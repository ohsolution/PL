#include <iostream>
#include <string>
#include <unordered_map>
#include <queue>
#include <stack>
#include <vector>
#include <cstdio>

#include "antlr4-cpp/ExprBaseListener.h"
#include "antlr4-cpp/ExprLexer.h"
#include "antlr4-cpp/ExprParser.h"

using namespace std;
using namespace antlr4;
using namespace antlr4::tree;

#define DEFAULT 0
#define ASSNPORT 1
#define EXPRPORT 2
#define NUMPORT 3

#define P_FI 2
#define P_SE 3

struct term
{
    double val;
    char op;
    bool isop;
};

struct opr
{
    char op;
    int pri;
    bool lp,rp;
};

class EvalListener : public ExprBaseListener {

private:
    
    int port= DEFAULT;
    int prep = DEFAULT;
    int sign = 1;

    /* ASSN SECTION */
    string lid;
    double rval;
    unordered_map <string,double> xhash;

    /*EXPR SECTION */

    queue <term> bq;
    stack <opr> opst;


public:
    
	virtual void enterExpr(ExprParser::ExprContext *ctx) {openport(EXPRPORT);}

    virtual void enterAssn(ExprParser::AssnContext *ctx) { openport(ASSNPORT); }
    
    virtual void exitAssn(ExprParser::AssnContext *ctx){ xhash[lid] = rval;}

    virtual void enterNum(ExprParser::NumContext *ctx)
    {
        sign = 1;
        prep = port;
        openport(NUMPORT);
    }
    virtual void exitNum(ExprParser::NumContext *ctx){ sign = 1;}

	virtual void visitTerminal(tree::TerminalNode *node) 
    {
        int st = node->getSymbol()->getType();
        
        if(st == ExprLexer::SEMI) closeport();

        if(port == NUMPORT)
        {
            if(st == ExprLexer::PLUSM)
            {
                if((node->getText())[0] == '-') sign = -1;
            }
            else port = prep;
        }

        if(port == ASSNPORT)    
        {
            if(st == ExprLexer::ID) lid = node->getText();
            if(st == ExprLexer::INT || st == ExprLexer::REAL) rval = stod(node->getText())*sign;            
        }
        else if(port == EXPRPORT)
        {
            if(st == ExprLexer::INT || st == ExprLexer::REAL) bq.push({stod(node->getText())*sign,' ',0});
            else if(st == ExprLexer::ID) bq.push({xhash[node->getText()],' ',0});
            else
            {
                opr tmp;
                tmp.lp = (st == ExprLexer::LP);
                tmp.rp = (st == ExprLexer::RP);
                tmp.op = (node->getText())[0];
                tmp.pri =  (st==ExprLexer::PLUSM) * P_FI + (st==ExprLexer::MULD) * P_SE;

                push_op(tmp);                
            }
        }
	}

    void openport(int ty){port = ty;}
    void closeport(void)
    {
        if(port == EXPRPORT) calc();
        port = DEFAULT;
    }

    void push_op(opr elem)
    {
        if(opst.empty() || elem.lp || elem.pri > opst.top().pri) 
        {
            opst.push(elem);
            return;
        }

        if(elem.rp)
        {
            while(!opst.top().lp)
            {
                bq.push({0,opst.top().op,1});
                opst.pop();    
            }

            opst.pop();

            return;
        }

        while(opst.size() && elem.pri <= opst.top().pri)
        {        
            bq.push({0,opst.top().op,1});
            opst.pop();
        }

        opst.push(elem);
        return;
    }

    void calc()
    {
        while(!opst.empty())
        {
            bq.push({0,opst.top().op,1});
            opst.pop();
        }

        vector <double> vd;

        while(!bq.empty())
        {
            term cur = bq.front(); bq.pop();

            if(!cur.isop)
            {
                vd.push_back(cur.val);
                continue;
            }            

            double s_val = vd.back(); vd.pop_back();
            double f_val = vd.back(); vd.pop_back();
            double ret;

            switch (cur.op)
            {
                case '+':
                    ret = f_val + s_val;
                    break;
                case '-':
                    ret = f_val - s_val;
                    break;
                case '*':
                    ret = f_val * s_val;
                    break;
                case '/':
                    ret = f_val / s_val;
                    break;
                default:
                    break;                
            }

            vd.push_back(ret);
        }
                
        printf("%.1lf\n",vd.back());
    }
};

int main(int argc, const char* argv[]) 
{
	if (argc < 2) {
		cerr << "[Usage] " << argv[0] << "  <input-file>\n";
		exit(0);
	}

	std::ifstream stream;
	stream.open(argv[1]);
	if (stream.fail()) {
		cerr << argv[1] << " : file open fail\n";
		exit(0);
	}

	ANTLRInputStream input(stream);

	ExprLexer lexer(&input);

	CommonTokenStream tokens(&lexer);

	ExprParser parser(&tokens);	

    ParseTreeWalker walker;

	EvalListener listener;	

	walker.walk(&listener, parser.prog());

    return 0;
}
