#include <bits/stdc++.h>

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

unordered_map <string,string> tmap;

unordered_map <string ,string> typemap
({
	{"Int","int"},{"Boolean","boolean"},{"Short","short"},{"Float","float"},{"Double","double"},
	{"Char","char"},{"Long","long"},{"Unit","void"},{"Any","Object"},{"String","String"}
});

unordered_map <string ,string> Ntypemap
({
	{"Int","Integer"},{"Boolean","Boolean"},{"Short","Short"},{"Float","Float"},{"Double","Double"},
	{"Char","Character"},{"Long","Long"},{"Unit","Void"},{"Any","Object"},{"String","String"}
});

unordered_map <string,string> ckmap;


unordered_map <string,string> fmap
({
	{"println","System.out.println"},{"is","instanceof"}
});




void transform(vector<info> vi,bool enter=true,bool ton=true)
{
	for(int i=0;i<vi.size();++i)
	{
		info x = vi[i];
		string ret = x.str;

		if(fmap.find(x.str) != fmap.end()) ret = fmap[x.str];

		
		if(ton && tmap.find(x.str) != tmap.end()) ret = tmap[x.str];
		
		if(i && vi[i-1].type == KotlinLexer::DOT && (i+1==vi.size() || vi[i+1].type!=KotlinParser::DOT)) ret += "()";

		if(vi[i].type != KotlinLexer::DOT && i+1!=vi.size() && vi[i+1].type!=KotlinLexer::DOT) ret += " ";

		cout << ret;
	}

	if(enter && vi.size()) cout <<";\n";

	return;
}

void typecheck(vector <info> vi)
{
	for(auto x : vi)
	{
		if(ckmap.find(x.str) != ckmap.end())
		{
			cout << typemap[ckmap[x.str]] <<" ";
			return;
		}
	}

	for(auto x : vi)
	{

		switch(x.type)
		{
			case KotlinLexer::STR:
				cout << "String ";
				return;

			case KotlinLexer::NUM:
				if(x.str.find('.')!=string::npos) cout<<"double ";
				else cout<<"int ";
				return;
			
			case KotlinLexer::TRUE:
			case KotlinLexer::FALSE:
				cout << "boolean ";
				return;

			case KotlinLexer::CHR:
				cout<< "char ";
				return;

			default:
			break;
		}
	}

}

class alphVisitor : public KotlinBaseVisitor{
private:
	bool sk = false;
	vector <info> vs[10];
	int c = 0;
	bool df=0;

public:
	virtual antlrcpp::Any visitProg(KotlinParser::ProgContext * ctx)
	{

		cout << "\n";
		cout << "class Main{\n\n";

		for(auto x : ctx->outerL()) visitOuterL(x);
		df=true;
		cout <<"\n";
		for(auto x : ctx->outerL()) visitOuterL(x);

		visitMainf(ctx->mainf());
		
		cout <<"}";
		return 0;
	}

	virtual antlrcpp::Any visitPackageR(KotlinParser::PackageRContext * ctx)
	{
		visitChildren(ctx);			
		transform(vs[c]);
		return 0;
	}

	virtual antlrcpp::Any visitOuterL(KotlinParser::OuterLContext * ctx)
	{
		for(auto x : ctx->outerR()) visitOuterR(x);
		return 0;
	}

	virtual antlrcpp::Any visitOuterR(KotlinParser::OuterRContext * ctx)
	{
		if(df) 
		{
			if(ctx->functionD()) visitFunctionD(ctx->functionD(),false);
		}
		else if(ctx->propertyD()) visitPropertyD(ctx->propertyD());
		return 0;
	}


	virtual antlrcpp::Any visitFunctionD(KotlinParser::FunctionDContext * ctx,bool inner=true)
	{
		if(inner)
		{

		}
		else
		{
			cout << "public static ";

			if(ctx->typef()) 
			{
				vs[++c].clear();
				visitTypef(ctx->typef());
				for(auto x : vs[c])
				{
					if(ctx->QUERY()) cout << Ntypemap[x.str]<<" ";
					else cout << typemap[x.str] << " ";
				}
				vs[c--].clear();
			}
			else
			{
				vs[++c].clear();
				for(auto x : ctx->argument()->ID()) visitTerminal(x);
				for(auto x : ctx->argument()->typef()) visitTypef(x);

				int sz = ctx->argument()->typef().size();

				for(int i=0;i<sz;++i) ckmap.insert({vs[c][i].str,vs[c][i+sz].str});

				vs[c--].clear();

				vs[++c].clear();
				visitExpression(ctx->whichfunction()->assign()->expression());
				typecheck(vs[c]);

				ckmap.clear();
				vs[c--].clear();				
			}

			cout << ctx->ID()->getText()<<"(";

			visitArgument(ctx->argument());
			cout<<")";
		
			visitWhichfunction(ctx->whichfunction());
		}

		return 0;
	}

	virtual antlrcpp::Any visitArgument(KotlinParser::ArgumentContext * ctx)
	{
		for(int i=0;i<ctx->ID().size();++i)
		{
			vs[++c].clear();
			visitTerminal((ctx->ID())[i]);
			visitTypef((ctx->typef())[i]);

			cout << typemap[vs[c][1].str]<<" ";
			cout <<vs[c][0].str;

			if(i!=ctx->ID().size()-1) cout <<",";
			vs[c--].clear();
		}

		return 0;
	}
	virtual antlrcpp::Any visitWhichfunction(KotlinParser::WhichfunctionContext * ctx)

	{
		cout <<"{\n";

		if(ctx->assign()) 
		{
			cout <<"return ";
			vs[c++].clear();
			visitExpression(ctx->assign()->expression());
			transform(vs[c]);
			vs[c--].clear();
		}
		else visitInnerblock(ctx->innerblock());			
		
		cout <<"}\n";

		return 0;
	}

	virtual antlrcpp::Any visitAssign(KotlinParser::AssignContext * ctx)
	{
		visitChildren(ctx);	
		return 0;
	}

	virtual antlrcpp::Any visitAssignopr(KotlinParser::AssignoprContext * ctx)
	{
		visitChildren(ctx);
		return 0;
	}

	virtual antlrcpp::Any visitInnerblock(KotlinParser::InnerblockContext * ctx)
	{		
		for(auto x : ctx->statement()) visitStatement(x);
		return 0;
	}

	virtual antlrcpp::Any visitStatement(KotlinParser::StatementContext * ctx)
	{
		vs[++c].clear();
		visitChildren(ctx);
		if(!(ctx->exit()))transform(vs[c]);
		vs[c--].clear();
		return 0;
	}

	virtual antlrcpp::Any visitExit(KotlinParser::ExitContext * ctx)
	{
		cout << "return ";
		vs[++c].clear();
		visitExpression(ctx->expression());

		transform(vs[c]);

		vs[c--].clear();

		return 0;
	}

	virtual antlrcpp::Any visitVariableD(KotlinParser::VariableDContext * ctx)
	{
		if(ctx->propertyD()) visitPropertyD(ctx->propertyD(),true);
		else
		{
			if(ctx->VAL()) cout<<"final ";

			vs[++c].clear();
			visitTypef(ctx->typef());
			for(auto x : vs[c]) cout << typemap[x.str];
			cout <<" ";
			vs[c--].clear();
		
			cout<<ctx->ID()->getText() << ";\n";
		}
		return 0;
	}



	virtual antlrcpp::Any visitMainf(KotlinParser::MainfContext * ctx)
	{
		cout << "public static void main(String[] args) {\n";

		visitInnerblock(ctx->innerblock());

		cout <<"\n}\n";
								
		return 0;
	}
	

	virtual antlrcpp::Any visitPropertyD(KotlinParser::PropertyDContext * ctx,bool inner = false)
	{
		vs[++c].clear();

		visitExpression(ctx->expression());

		if(!inner) cout << "public static ";

		if(ctx->VAL()) cout<<"final ";

		if(ctx->typef()) 
		{
			vs[++c].clear();
			visitTypef(ctx->typef());
			for(auto x : vs[c]) cout << typemap[x.str];
			cout <<" ";
			vs[c--].clear();
		}
		else
		{			
			typecheck(vs[c]);
		}
		
		cout<<ctx->ID()->getText() << " = ";

		transform(vs[c]);

		vs[c--].clear();
		return 0;
	}

	virtual antlrcpp::Any visitExpression(KotlinParser::ExpressionContext * ctx)
	{

		if(ctx->expor()) visitExpor(ctx->expor());		
		else visitIfthenelse(ctx->ifthenelse());
		return 0;
	}

	virtual antlrcpp::Any visitIfthenelse(KotlinParser::IfthenelseContext * ctx)
	{
		cout << "if(";
		vs[++c].clear();
		visitExpression(ctx->expression());
		for(int i=0;i<vs[c].size();++i)
		{
			if(vs[c][i].type == KotlinLexer::IS)
			{
				string r = "(("+typemap[vs[c][i+1].str]+")"+vs[c][i-1].str+")";
				tmap.insert({vs[c][i-1].str,r});		
			}
		}
		transform(vs[c],false,false);
		cout<<")";
		cout<<"{\n";

		if(ctx->innerblock()) visitInnerblock(ctx->innerblock());
		else visitStatement(ctx->statement());

		cout<<"}";

		tmap.clear();

		if(ctx->elif()) visitElif(ctx->elif());

		vs[c--].clear();

		return 0;
	}

	virtual antlrcpp::Any visitElif(KotlinParser::ElifContext * ctx)
	{
		cout <<"else ";
		if(ctx->innerblock()) visitInnerblock(ctx->innerblock());
		else visitStatement(ctx->statement());

		return 0;
	}

	virtual antlrcpp::Any visitExpor(KotlinParser::ExporContext * ctx)
	{
		visitChildren(ctx);
		return 0;
	}

	virtual antlrcpp::Any visitExpand(KotlinParser::ExpandContext * ctx)
	{
		visitChildren(ctx);
		return 0;
	}

	virtual antlrcpp::Any visitExpeq(KotlinParser::ExpeqContext * ctx)
	{
		visitChildren(ctx);
		return 0;
	}

	virtual antlrcpp::Any visitExpcmp(KotlinParser::ExpcmpContext * ctx)
	{
		visitChildren(ctx);
		return 0;
	}

	virtual antlrcpp::Any visitExppre(KotlinParser::ExppreContext * ctx)
	{
		visitChildren(ctx);
		return 0;
	}

	virtual antlrcpp::Any visitExprange(KotlinParser::ExprangeContext * ctx)
	{
		visitChildren(ctx);
		return 0;
	}

	virtual antlrcpp::Any visitExpR(KotlinParser::ExpRContext * ctx)
	{
		visitChildren(ctx);
		return 0;
	}

	virtual antlrcpp::Any visitExpadd(KotlinParser::ExpaddContext * ctx)
	{
		visitChildren(ctx);
		return 0;
	}

	virtual antlrcpp::Any visitExpmul(KotlinParser::ExpmulContext * ctx)
	{
		visitChildren(ctx);
		return 0;
	}

	virtual antlrcpp::Any visitPrefixexp(KotlinParser::PrefixoprContext * ctx)
	{
		visitChildren(ctx);
		return 0;
	}

	virtual antlrcpp::Any visitExppostfix(KotlinParser::ExppostfixContext * ctx)
	{
		visitChildren(ctx);
		return 0;
	}

	virtual antlrcpp::Any visitFccall(KotlinParser::FccallContext * ctx)
	{
		visitChildren(ctx);
		return 0;
	}

	virtual antlrcpp::Any visitArgus(KotlinParser::ArgusContext * ctx)
	{
		visitChildren(ctx);
		return 0;
	}

	virtual antlrcpp::Any visitArgu(KotlinParser::ArguContext * ctx)
	{
		visitChildren(ctx);
		return 0;
	}

	virtual antlrcpp::Any visitOprpostfix(KotlinParser::OprpostfixContext * ctx)
	{
		visitChildren(ctx);
		return 0;
	}

	virtual antlrcpp::Any visitPrefixopr(KotlinParser::PrefixoprContext * ctx)
	{
		visitChildren(ctx);
		return 0;
	}

	virtual antlrcpp::Any visitMulopr(KotlinParser::MuloprContext * ctx)
	{
		visitChildren(ctx);
		return 0;
	}

	virtual antlrcpp::Any visitAddopr(KotlinParser::AddoprContext * ctx)
	{
		visitChildren(ctx);
		return 0;
	}

	virtual antlrcpp::Any visitInopr(KotlinParser::InoprContext * ctx)
	{
		visitChildren(ctx);
		return 0;
	}

	virtual antlrcpp::Any visitIsopr(KotlinParser::IsoprContext * ctx)
	{
		visitChildren(ctx);
		return 0;
	}

	virtual antlrcpp::Any visitEqopr(KotlinParser::EqoprContext * ctx)
	{
		visitChildren(ctx);
		return 0;
	}

	virtual antlrcpp::Any visitCmpopr(KotlinParser::CmpoprContext * ctx)
	{
		visitChildren(ctx);
		return 0;
	}

	virtual antlrcpp::Any visitTypef(KotlinParser::TypefContext * ctx)
	{
		visitChildren(ctx);
		return 0;
	}

			
	virtual antlrcpp::Any visitTerminal(tree::TerminalNode *node) 
	{
		vs[c].push_back({node->getText(),node->getSymbol()->getType()});
		return 0;
	}
};



int main(int argc, const char* argv[]) 
{
	if (argc < 2) {
		cerr << "[Usage] " << argv[0] << "  <input-file>\n";
		exit(0);
	}

	// using dup2 to connect file output

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
