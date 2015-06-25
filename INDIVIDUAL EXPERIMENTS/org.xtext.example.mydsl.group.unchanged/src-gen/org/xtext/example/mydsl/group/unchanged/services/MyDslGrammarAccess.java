/*
* generated by Xtext
*/
package org.xtext.example.mydsl.group.unchanged.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class MyDslGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class RootElementTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "RootElementType");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRootElementTypeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cElement1Keyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cElement1Assignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cElement1Element1ParserRuleCall_3_0 = (RuleCall)cElement1Assignment_3.eContents().get(0);
		private final Keyword cElement2Keyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cElement2Assignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cElement2Element2ParserRuleCall_5_0 = (RuleCall)cElement2Assignment_5.eContents().get(0);
		private final Keyword cElement3Keyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cElement3Assignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cElement3Element3ParserRuleCall_7_0 = (RuleCall)cElement3Assignment_7.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//RootElementType:
		//	"RootElementType" "{" "element1" element1=Element1 "element2" element2=Element2 "element3" element3=Element3 "}";
		public ParserRule getRule() { return rule; }

		//"RootElementType" "{" "element1" element1=Element1 "element2" element2=Element2 "element3" element3=Element3 "}"
		public Group getGroup() { return cGroup; }

		//"RootElementType"
		public Keyword getRootElementTypeKeyword_0() { return cRootElementTypeKeyword_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }

		//"element1"
		public Keyword getElement1Keyword_2() { return cElement1Keyword_2; }

		//element1=Element1
		public Assignment getElement1Assignment_3() { return cElement1Assignment_3; }

		//Element1
		public RuleCall getElement1Element1ParserRuleCall_3_0() { return cElement1Element1ParserRuleCall_3_0; }

		//"element2"
		public Keyword getElement2Keyword_4() { return cElement2Keyword_4; }

		//element2=Element2
		public Assignment getElement2Assignment_5() { return cElement2Assignment_5; }

		//Element2
		public RuleCall getElement2Element2ParserRuleCall_5_0() { return cElement2Element2ParserRuleCall_5_0; }

		//"element3"
		public Keyword getElement3Keyword_6() { return cElement3Keyword_6; }

		//element3=Element3
		public Assignment getElement3Assignment_7() { return cElement3Assignment_7; }

		//Element3
		public RuleCall getElement3Element3ParserRuleCall_7_0() { return cElement3Element3ParserRuleCall_7_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_8() { return cRightCurlyBracketKeyword_8; }
	}

	public class Element1Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Element1");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cElement1Action_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cElement1Keyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//Element1:
		//	{Element1} "Element1";
		public ParserRule getRule() { return rule; }

		//{Element1} "Element1"
		public Group getGroup() { return cGroup; }

		//{Element1}
		public Action getElement1Action_0() { return cElement1Action_0; }

		//"Element1"
		public Keyword getElement1Keyword_1() { return cElement1Keyword_1; }
	}

	public class Element2Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Element2");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cElement2Keyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cModelGroupElement1Keyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cModelGroupElement1Assignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cModelGroupElement1String0ParserRuleCall_4_0 = (RuleCall)cModelGroupElement1Assignment_4.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cCommaKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cModelGroupElement1Assignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cModelGroupElement1String0ParserRuleCall_5_1_0 = (RuleCall)cModelGroupElement1Assignment_5_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cModelGroupElement2Keyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cModelGroupElement2Assignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cModelGroupElement2String0ParserRuleCall_8_0 = (RuleCall)cModelGroupElement2Assignment_8.eContents().get(0);
		private final Keyword cModelGroupElement3Keyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Assignment cModelGroupElement3Assignment_10 = (Assignment)cGroup.eContents().get(10);
		private final RuleCall cModelGroupElement3String0ParserRuleCall_10_0 = (RuleCall)cModelGroupElement3Assignment_10.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_11 = (Keyword)cGroup.eContents().get(11);
		
		//Element2:
		//	"Element2" "{" "modelGroupElement1" "{" modelGroupElement1+=String0 ("," modelGroupElement1+=String0)* "}"
		//	"modelGroupElement2" modelGroupElement2=String0 "modelGroupElement3" modelGroupElement3=String0 "}";
		public ParserRule getRule() { return rule; }

		//"Element2" "{" "modelGroupElement1" "{" modelGroupElement1+=String0 ("," modelGroupElement1+=String0)* "}"
		//"modelGroupElement2" modelGroupElement2=String0 "modelGroupElement3" modelGroupElement3=String0 "}"
		public Group getGroup() { return cGroup; }

		//"Element2"
		public Keyword getElement2Keyword_0() { return cElement2Keyword_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }

		//"modelGroupElement1"
		public Keyword getModelGroupElement1Keyword_2() { return cModelGroupElement1Keyword_2; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//modelGroupElement1+=String0
		public Assignment getModelGroupElement1Assignment_4() { return cModelGroupElement1Assignment_4; }

		//String0
		public RuleCall getModelGroupElement1String0ParserRuleCall_4_0() { return cModelGroupElement1String0ParserRuleCall_4_0; }

		//("," modelGroupElement1+=String0)*
		public Group getGroup_5() { return cGroup_5; }

		//","
		public Keyword getCommaKeyword_5_0() { return cCommaKeyword_5_0; }

		//modelGroupElement1+=String0
		public Assignment getModelGroupElement1Assignment_5_1() { return cModelGroupElement1Assignment_5_1; }

		//String0
		public RuleCall getModelGroupElement1String0ParserRuleCall_5_1_0() { return cModelGroupElement1String0ParserRuleCall_5_1_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }

		//"modelGroupElement2"
		public Keyword getModelGroupElement2Keyword_7() { return cModelGroupElement2Keyword_7; }

		//modelGroupElement2=String0
		public Assignment getModelGroupElement2Assignment_8() { return cModelGroupElement2Assignment_8; }

		//String0
		public RuleCall getModelGroupElement2String0ParserRuleCall_8_0() { return cModelGroupElement2String0ParserRuleCall_8_0; }

		//"modelGroupElement3"
		public Keyword getModelGroupElement3Keyword_9() { return cModelGroupElement3Keyword_9; }

		//modelGroupElement3=String0
		public Assignment getModelGroupElement3Assignment_10() { return cModelGroupElement3Assignment_10; }

		//String0
		public RuleCall getModelGroupElement3String0ParserRuleCall_10_0() { return cModelGroupElement3String0ParserRuleCall_10_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_11() { return cRightCurlyBracketKeyword_11; }
	}

	public class Element3Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Element3");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cElement3Action_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cElement3Keyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cRepeatableElement1Keyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3_1 = (Keyword)cGroup_3.eContents().get(1);
		private final Assignment cRepeatableElement1Assignment_3_2 = (Assignment)cGroup_3.eContents().get(2);
		private final RuleCall cRepeatableElement1String0ParserRuleCall_3_2_0 = (RuleCall)cRepeatableElement1Assignment_3_2.eContents().get(0);
		private final Group cGroup_3_3 = (Group)cGroup_3.eContents().get(3);
		private final Keyword cCommaKeyword_3_3_0 = (Keyword)cGroup_3_3.eContents().get(0);
		private final Assignment cRepeatableElement1Assignment_3_3_1 = (Assignment)cGroup_3_3.eContents().get(1);
		private final RuleCall cRepeatableElement1String0ParserRuleCall_3_3_1_0 = (RuleCall)cRepeatableElement1Assignment_3_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3_4 = (Keyword)cGroup_3.eContents().get(4);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cRepeatableElement2Keyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cRepeatableElement2Assignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cRepeatableElement2String0ParserRuleCall_4_1_0 = (RuleCall)cRepeatableElement2Assignment_4_1.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cRepeatableElement3Keyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cRepeatableElement3Assignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cRepeatableElement3String0ParserRuleCall_5_1_0 = (RuleCall)cRepeatableElement3Assignment_5_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//Element3:
		//	{Element3} "Element3" "{" ("repeatableElement1" "{" repeatableElement1+=String0 ("," repeatableElement1+=String0)*
		//	"}")? ("repeatableElement2" repeatableElement2=String0)? ("repeatableElement3" repeatableElement3=String0)? "}";
		public ParserRule getRule() { return rule; }

		//{Element3} "Element3" "{" ("repeatableElement1" "{" repeatableElement1+=String0 ("," repeatableElement1+=String0)* "}")?
		//("repeatableElement2" repeatableElement2=String0)? ("repeatableElement3" repeatableElement3=String0)? "}"
		public Group getGroup() { return cGroup; }

		//{Element3}
		public Action getElement3Action_0() { return cElement3Action_0; }

		//"Element3"
		public Keyword getElement3Keyword_1() { return cElement3Keyword_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//("repeatableElement1" "{" repeatableElement1+=String0 ("," repeatableElement1+=String0)* "}")?
		public Group getGroup_3() { return cGroup_3; }

		//"repeatableElement1"
		public Keyword getRepeatableElement1Keyword_3_0() { return cRepeatableElement1Keyword_3_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_3_1() { return cLeftCurlyBracketKeyword_3_1; }

		//repeatableElement1+=String0
		public Assignment getRepeatableElement1Assignment_3_2() { return cRepeatableElement1Assignment_3_2; }

		//String0
		public RuleCall getRepeatableElement1String0ParserRuleCall_3_2_0() { return cRepeatableElement1String0ParserRuleCall_3_2_0; }

		//("," repeatableElement1+=String0)*
		public Group getGroup_3_3() { return cGroup_3_3; }

		//","
		public Keyword getCommaKeyword_3_3_0() { return cCommaKeyword_3_3_0; }

		//repeatableElement1+=String0
		public Assignment getRepeatableElement1Assignment_3_3_1() { return cRepeatableElement1Assignment_3_3_1; }

		//String0
		public RuleCall getRepeatableElement1String0ParserRuleCall_3_3_1_0() { return cRepeatableElement1String0ParserRuleCall_3_3_1_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_3_4() { return cRightCurlyBracketKeyword_3_4; }

		//("repeatableElement2" repeatableElement2=String0)?
		public Group getGroup_4() { return cGroup_4; }

		//"repeatableElement2"
		public Keyword getRepeatableElement2Keyword_4_0() { return cRepeatableElement2Keyword_4_0; }

		//repeatableElement2=String0
		public Assignment getRepeatableElement2Assignment_4_1() { return cRepeatableElement2Assignment_4_1; }

		//String0
		public RuleCall getRepeatableElement2String0ParserRuleCall_4_1_0() { return cRepeatableElement2String0ParserRuleCall_4_1_0; }

		//("repeatableElement3" repeatableElement3=String0)?
		public Group getGroup_5() { return cGroup_5; }

		//"repeatableElement3"
		public Keyword getRepeatableElement3Keyword_5_0() { return cRepeatableElement3Keyword_5_0; }

		//repeatableElement3=String0
		public Assignment getRepeatableElement3Assignment_5_1() { return cRepeatableElement3Assignment_5_1; }

		//String0
		public RuleCall getRepeatableElement3String0ParserRuleCall_5_1_0() { return cRepeatableElement3String0ParserRuleCall_5_1_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}

	public class String0Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "String0");
		private final Keyword cStringKeyword = (Keyword)rule.eContents().get(1);
		
		/// * TODO: implement this rule and an appropriate IValueConverter * / String0 returns type::String:
		//	"String";
		public ParserRule getRule() { return rule; }

		//"String"
		public Keyword getStringKeyword() { return cStringKeyword; }
	}
	
	
	private final RootElementTypeElements pRootElementType;
	private final Element1Elements pElement1;
	private final Element2Elements pElement2;
	private final Element3Elements pElement3;
	private final String0Elements pString0;
	
	private final Grammar grammar;

	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public MyDslGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pRootElementType = new RootElementTypeElements();
		this.pElement1 = new Element1Elements();
		this.pElement2 = new Element2Elements();
		this.pElement3 = new Element3Elements();
		this.pString0 = new String0Elements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.mydsl.group.unchanged.MyDsl".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//RootElementType:
	//	"RootElementType" "{" "element1" element1=Element1 "element2" element2=Element2 "element3" element3=Element3 "}";
	public RootElementTypeElements getRootElementTypeAccess() {
		return pRootElementType;
	}
	
	public ParserRule getRootElementTypeRule() {
		return getRootElementTypeAccess().getRule();
	}

	//Element1:
	//	{Element1} "Element1";
	public Element1Elements getElement1Access() {
		return pElement1;
	}
	
	public ParserRule getElement1Rule() {
		return getElement1Access().getRule();
	}

	//Element2:
	//	"Element2" "{" "modelGroupElement1" "{" modelGroupElement1+=String0 ("," modelGroupElement1+=String0)* "}"
	//	"modelGroupElement2" modelGroupElement2=String0 "modelGroupElement3" modelGroupElement3=String0 "}";
	public Element2Elements getElement2Access() {
		return pElement2;
	}
	
	public ParserRule getElement2Rule() {
		return getElement2Access().getRule();
	}

	//Element3:
	//	{Element3} "Element3" "{" ("repeatableElement1" "{" repeatableElement1+=String0 ("," repeatableElement1+=String0)*
	//	"}")? ("repeatableElement2" repeatableElement2=String0)? ("repeatableElement3" repeatableElement3=String0)? "}";
	public Element3Elements getElement3Access() {
		return pElement3;
	}
	
	public ParserRule getElement3Rule() {
		return getElement3Access().getRule();
	}

	/// * TODO: implement this rule and an appropriate IValueConverter * / String0 returns type::String:
	//	"String";
	public String0Elements getString0Access() {
		return pString0;
	}
	
	public ParserRule getString0Rule() {
		return getString0Access().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" . / * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\""))* "\"" | "\'" ("\\" .
	//	/ * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
