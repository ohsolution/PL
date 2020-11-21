#include <iostream>
#include <string>
#include <unordered_map>
#include <queue>
#include <stack>
#include <vector>
#include <cstdio>

#include "antlr4-cpp/KotlinBaseListener.h"
#include "antlr4-cpp/KotlinLexer.h"
#include "antlr4-cpp/KotlinParser.h"

using namespace std;
using namespace antlr4;
using namespace antlr4::tree;

#define DEFAULT 0
#define ASSNPORT 1
#define EXPRPORT 2

#define P_FI 2
#define P_SE 3

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

	cout << "---Expression Evaluation with ANTLR listener---\n";
	ANTLRInputStream input(stream);
	KotlinLexer lexer(&input);
	CommonTokenStream tokens(&lexer);
	KotlinParser parser(&tokens);	
	    //ParseTree *tree = parser.prog();

    //cout << tree->toStringTree(&parser) << endl;

    ParseTreeWalker walker;
	//KotlinListener listener;	
	//walker.walk(&listener, parser.prog());
    return 0;
}
