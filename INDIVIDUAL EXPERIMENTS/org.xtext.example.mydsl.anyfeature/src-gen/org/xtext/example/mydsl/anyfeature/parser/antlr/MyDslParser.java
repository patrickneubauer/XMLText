/*
* generated by Xtext
*/
package org.xtext.example.mydsl.anyfeature.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.example.mydsl.anyfeature.services.MyDslGrammarAccess;

public class MyDslParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.xtext.example.mydsl.anyfeature.parser.antlr.internal.InternalMyDslParser createParser(XtextTokenStream stream) {
		return new org.xtext.example.mydsl.anyfeature.parser.antlr.internal.InternalMyDslParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "RootElementType";
	}
	
	public MyDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
