#include <iostream>
#include <string>
#include <unordered_map>
#include <queue>
#include <stack>
#include <vector>
#include <cstdio>


#include "antlr4-cpp/KotlinLexer.h"
#include "antlr4-cpp/KotlinParser.h"
#include "antlr4-cpp/KotlinBaseVisitor.h"

using namespace std;
using namespace antlr4;
using namespace antlrcpp;
using namespace antlr4::tree;

struct info
{
	string str;
	int type;
};


class alphVisitor : public KotlinBaseVisitor{
private:
	bool sk = false;
	vector <info> vs;
public:
	virtual antlrcpp::Any visitProg(KotlinParser::ProgContext * ctx)
	{
		visitChildren(ctx);
		return 0;
	}

	virtual antlrcpp::Any visitPackageR(KotlinParser::PackageRContext * ctx)
	{
		visitChildren(ctx);							
		return 0;
	}

	virtual antlrcpp::Any visitMainf(KotlinParser::MainfContext * ctx)
	{
		visitChildren(ctx);							
		return 0;
	}		
	virtual antlrcpp::Any visitTerminal(tree::TerminalNode *node) 
	{
		vs.push_back({node->getText(),node->getSymbol()->getType()});
		return 0;
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

	//cout << "---Expression Evaluation with ANTLR listener---\n";
	ANTLRInputStream input(stream);

	KotlinLexer lexer(&input);

	CommonTokenStream tokens(&lexer);

	KotlinParser parser(&tokens);	

	ParseTree *tree = parser.prog();

	alphVisitor vis;

	vis.visit(tree);

    //cout << tree->toStringTree(&parser) << endl;

    //KotlinParser::ProgContext *ct;
	//KotlinListener listener;	
	//vis.visitProg(ct);
    return 0;
}
