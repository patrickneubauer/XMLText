/*
* generated by Xtext
*/
package org.xtext.example.mydsl.references.untyped.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class MyDslGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class OrdersTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "OrdersType");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cOrdersTypeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cOrder1Keyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cOrder1Assignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cOrder1OrderDetail1ParserRuleCall_4_0 = (RuleCall)cOrder1Assignment_4.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cCommaKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cOrder1Assignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cOrder1OrderDetail1ParserRuleCall_5_1_0 = (RuleCall)cOrder1Assignment_5_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cOrder2Keyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Keyword cLeftCurlyBracketKeyword_8 = (Keyword)cGroup.eContents().get(8);
		private final Assignment cOrder2Assignment_9 = (Assignment)cGroup.eContents().get(9);
		private final RuleCall cOrder2OrderDetail2ParserRuleCall_9_0 = (RuleCall)cOrder2Assignment_9.eContents().get(0);
		private final Group cGroup_10 = (Group)cGroup.eContents().get(10);
		private final Keyword cCommaKeyword_10_0 = (Keyword)cGroup_10.eContents().get(0);
		private final Assignment cOrder2Assignment_10_1 = (Assignment)cGroup_10.eContents().get(1);
		private final RuleCall cOrder2OrderDetail2ParserRuleCall_10_1_0 = (RuleCall)cOrder2Assignment_10_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Keyword cOrderReference1Keyword_12 = (Keyword)cGroup.eContents().get(12);
		private final Keyword cLeftCurlyBracketKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Assignment cOrderReference1Assignment_14 = (Assignment)cGroup.eContents().get(14);
		private final RuleCall cOrderReference1OrderRef1ParserRuleCall_14_0 = (RuleCall)cOrderReference1Assignment_14.eContents().get(0);
		private final Group cGroup_15 = (Group)cGroup.eContents().get(15);
		private final Keyword cCommaKeyword_15_0 = (Keyword)cGroup_15.eContents().get(0);
		private final Assignment cOrderReference1Assignment_15_1 = (Assignment)cGroup_15.eContents().get(1);
		private final RuleCall cOrderReference1OrderRef1ParserRuleCall_15_1_0 = (RuleCall)cOrderReference1Assignment_15_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_16 = (Keyword)cGroup.eContents().get(16);
		private final Keyword cOrderReference2Keyword_17 = (Keyword)cGroup.eContents().get(17);
		private final Keyword cLeftCurlyBracketKeyword_18 = (Keyword)cGroup.eContents().get(18);
		private final Assignment cOrderReference2Assignment_19 = (Assignment)cGroup.eContents().get(19);
		private final RuleCall cOrderReference2OrderRef2ParserRuleCall_19_0 = (RuleCall)cOrderReference2Assignment_19.eContents().get(0);
		private final Group cGroup_20 = (Group)cGroup.eContents().get(20);
		private final Keyword cCommaKeyword_20_0 = (Keyword)cGroup_20.eContents().get(0);
		private final Assignment cOrderReference2Assignment_20_1 = (Assignment)cGroup_20.eContents().get(1);
		private final RuleCall cOrderReference2OrderRef2ParserRuleCall_20_1_0 = (RuleCall)cOrderReference2Assignment_20_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_21 = (Keyword)cGroup.eContents().get(21);
		private final Keyword cRightCurlyBracketKeyword_22 = (Keyword)cGroup.eContents().get(22);
		
		//OrdersType:
		//	"OrdersType" "{" "order1" "{" order1+=OrderDetail1 ("," order1+=OrderDetail1)* "}" "order2" "{" order2+=OrderDetail2
		//	("," order2+=OrderDetail2)* "}" "orderReference1" "{" orderReference1+=OrderRef1 ("," orderReference1+=OrderRef1)*
		//	"}" "orderReference2" "{" orderReference2+=OrderRef2 ("," orderReference2+=OrderRef2)* "}" "}";
		public ParserRule getRule() { return rule; }

		//"OrdersType" "{" "order1" "{" order1+=OrderDetail1 ("," order1+=OrderDetail1)* "}" "order2" "{" order2+=OrderDetail2
		//("," order2+=OrderDetail2)* "}" "orderReference1" "{" orderReference1+=OrderRef1 ("," orderReference1+=OrderRef1)* "}"
		//"orderReference2" "{" orderReference2+=OrderRef2 ("," orderReference2+=OrderRef2)* "}" "}"
		public Group getGroup() { return cGroup; }

		//"OrdersType"
		public Keyword getOrdersTypeKeyword_0() { return cOrdersTypeKeyword_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }

		//"order1"
		public Keyword getOrder1Keyword_2() { return cOrder1Keyword_2; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//order1+=OrderDetail1
		public Assignment getOrder1Assignment_4() { return cOrder1Assignment_4; }

		//OrderDetail1
		public RuleCall getOrder1OrderDetail1ParserRuleCall_4_0() { return cOrder1OrderDetail1ParserRuleCall_4_0; }

		//("," order1+=OrderDetail1)*
		public Group getGroup_5() { return cGroup_5; }

		//","
		public Keyword getCommaKeyword_5_0() { return cCommaKeyword_5_0; }

		//order1+=OrderDetail1
		public Assignment getOrder1Assignment_5_1() { return cOrder1Assignment_5_1; }

		//OrderDetail1
		public RuleCall getOrder1OrderDetail1ParserRuleCall_5_1_0() { return cOrder1OrderDetail1ParserRuleCall_5_1_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }

		//"order2"
		public Keyword getOrder2Keyword_7() { return cOrder2Keyword_7; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_8() { return cLeftCurlyBracketKeyword_8; }

		//order2+=OrderDetail2
		public Assignment getOrder2Assignment_9() { return cOrder2Assignment_9; }

		//OrderDetail2
		public RuleCall getOrder2OrderDetail2ParserRuleCall_9_0() { return cOrder2OrderDetail2ParserRuleCall_9_0; }

		//("," order2+=OrderDetail2)*
		public Group getGroup_10() { return cGroup_10; }

		//","
		public Keyword getCommaKeyword_10_0() { return cCommaKeyword_10_0; }

		//order2+=OrderDetail2
		public Assignment getOrder2Assignment_10_1() { return cOrder2Assignment_10_1; }

		//OrderDetail2
		public RuleCall getOrder2OrderDetail2ParserRuleCall_10_1_0() { return cOrder2OrderDetail2ParserRuleCall_10_1_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_11() { return cRightCurlyBracketKeyword_11; }

		//"orderReference1"
		public Keyword getOrderReference1Keyword_12() { return cOrderReference1Keyword_12; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_13() { return cLeftCurlyBracketKeyword_13; }

		//orderReference1+=OrderRef1
		public Assignment getOrderReference1Assignment_14() { return cOrderReference1Assignment_14; }

		//OrderRef1
		public RuleCall getOrderReference1OrderRef1ParserRuleCall_14_0() { return cOrderReference1OrderRef1ParserRuleCall_14_0; }

		//("," orderReference1+=OrderRef1)*
		public Group getGroup_15() { return cGroup_15; }

		//","
		public Keyword getCommaKeyword_15_0() { return cCommaKeyword_15_0; }

		//orderReference1+=OrderRef1
		public Assignment getOrderReference1Assignment_15_1() { return cOrderReference1Assignment_15_1; }

		//OrderRef1
		public RuleCall getOrderReference1OrderRef1ParserRuleCall_15_1_0() { return cOrderReference1OrderRef1ParserRuleCall_15_1_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_16() { return cRightCurlyBracketKeyword_16; }

		//"orderReference2"
		public Keyword getOrderReference2Keyword_17() { return cOrderReference2Keyword_17; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_18() { return cLeftCurlyBracketKeyword_18; }

		//orderReference2+=OrderRef2
		public Assignment getOrderReference2Assignment_19() { return cOrderReference2Assignment_19; }

		//OrderRef2
		public RuleCall getOrderReference2OrderRef2ParserRuleCall_19_0() { return cOrderReference2OrderRef2ParserRuleCall_19_0; }

		//("," orderReference2+=OrderRef2)*
		public Group getGroup_20() { return cGroup_20; }

		//","
		public Keyword getCommaKeyword_20_0() { return cCommaKeyword_20_0; }

		//orderReference2+=OrderRef2
		public Assignment getOrderReference2Assignment_20_1() { return cOrderReference2Assignment_20_1; }

		//OrderRef2
		public RuleCall getOrderReference2OrderRef2ParserRuleCall_20_1_0() { return cOrderReference2OrderRef2ParserRuleCall_20_1_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_21() { return cRightCurlyBracketKeyword_21; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_22() { return cRightCurlyBracketKeyword_22; }
	}

	public class OrderDetail1Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "OrderDetail1");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cOrderDetail1Action_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cOrderDetail1Keyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cOrderIDAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cOrderIDID0ParserRuleCall_2_0 = (RuleCall)cOrderIDAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cCustomerAddressKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cCustomerAddressAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cCustomerAddressString0ParserRuleCall_4_1_0 = (RuleCall)cCustomerAddressAssignment_4_1.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cCustomerContactKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cCustomerContactAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cCustomerContactString0ParserRuleCall_5_1_0 = (RuleCall)cCustomerContactAssignment_5_1.eContents().get(0);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cCustomerNameKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Assignment cCustomerNameAssignment_6_1 = (Assignment)cGroup_6.eContents().get(1);
		private final RuleCall cCustomerNameString0ParserRuleCall_6_1_0 = (RuleCall)cCustomerNameAssignment_6_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//OrderDetail1:
		//	{OrderDetail1} "OrderDetail1" orderID=ID0 "{" ("customerAddress" customerAddress=String0)? ("customerContact"
		//	customerContact=String0)? ("customerName" customerName=String0)? "}";
		public ParserRule getRule() { return rule; }

		//{OrderDetail1} "OrderDetail1" orderID=ID0 "{" ("customerAddress" customerAddress=String0)? ("customerContact"
		//customerContact=String0)? ("customerName" customerName=String0)? "}"
		public Group getGroup() { return cGroup; }

		//{OrderDetail1}
		public Action getOrderDetail1Action_0() { return cOrderDetail1Action_0; }

		//"OrderDetail1"
		public Keyword getOrderDetail1Keyword_1() { return cOrderDetail1Keyword_1; }

		//orderID=ID0
		public Assignment getOrderIDAssignment_2() { return cOrderIDAssignment_2; }

		//ID0
		public RuleCall getOrderIDID0ParserRuleCall_2_0() { return cOrderIDID0ParserRuleCall_2_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//("customerAddress" customerAddress=String0)?
		public Group getGroup_4() { return cGroup_4; }

		//"customerAddress"
		public Keyword getCustomerAddressKeyword_4_0() { return cCustomerAddressKeyword_4_0; }

		//customerAddress=String0
		public Assignment getCustomerAddressAssignment_4_1() { return cCustomerAddressAssignment_4_1; }

		//String0
		public RuleCall getCustomerAddressString0ParserRuleCall_4_1_0() { return cCustomerAddressString0ParserRuleCall_4_1_0; }

		//("customerContact" customerContact=String0)?
		public Group getGroup_5() { return cGroup_5; }

		//"customerContact"
		public Keyword getCustomerContactKeyword_5_0() { return cCustomerContactKeyword_5_0; }

		//customerContact=String0
		public Assignment getCustomerContactAssignment_5_1() { return cCustomerContactAssignment_5_1; }

		//String0
		public RuleCall getCustomerContactString0ParserRuleCall_5_1_0() { return cCustomerContactString0ParserRuleCall_5_1_0; }

		//("customerName" customerName=String0)?
		public Group getGroup_6() { return cGroup_6; }

		//"customerName"
		public Keyword getCustomerNameKeyword_6_0() { return cCustomerNameKeyword_6_0; }

		//customerName=String0
		public Assignment getCustomerNameAssignment_6_1() { return cCustomerNameAssignment_6_1; }

		//String0
		public RuleCall getCustomerNameString0ParserRuleCall_6_1_0() { return cCustomerNameString0ParserRuleCall_6_1_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
	}

	public class OrderDetail2Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "OrderDetail2");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cOrderDetail2Action_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cOrderDetail2Keyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cOrderIDAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cOrderIDID0ParserRuleCall_2_0 = (RuleCall)cOrderIDAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cCustomerNameKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cCustomerNameAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cCustomerNameString0ParserRuleCall_4_1_0 = (RuleCall)cCustomerNameAssignment_4_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//OrderDetail2:
		//	{OrderDetail2} "OrderDetail2" orderID=ID0 "{" ("customerName" customerName=String0)? "}";
		public ParserRule getRule() { return rule; }

		//{OrderDetail2} "OrderDetail2" orderID=ID0 "{" ("customerName" customerName=String0)? "}"
		public Group getGroup() { return cGroup; }

		//{OrderDetail2}
		public Action getOrderDetail2Action_0() { return cOrderDetail2Action_0; }

		//"OrderDetail2"
		public Keyword getOrderDetail2Keyword_1() { return cOrderDetail2Keyword_1; }

		//orderID=ID0
		public Assignment getOrderIDAssignment_2() { return cOrderIDAssignment_2; }

		//ID0
		public RuleCall getOrderIDID0ParserRuleCall_2_0() { return cOrderIDID0ParserRuleCall_2_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//("customerName" customerName=String0)?
		public Group getGroup_4() { return cGroup_4; }

		//"customerName"
		public Keyword getCustomerNameKeyword_4_0() { return cCustomerNameKeyword_4_0; }

		//customerName=String0
		public Assignment getCustomerNameAssignment_4_1() { return cCustomerNameAssignment_4_1; }

		//String0
		public RuleCall getCustomerNameString0ParserRuleCall_4_1_0() { return cCustomerNameString0ParserRuleCall_4_1_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}

	public class OrderRef1Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "OrderRef1");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cOrderRef1Action_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cOrderRef1Keyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cNameKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cNameAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final CrossReference cNameEObjectCrossReference_3_1_0 = (CrossReference)cNameAssignment_3_1.eContents().get(0);
		private final RuleCall cNameEObjectEStringParserRuleCall_3_1_0_1 = (RuleCall)cNameEObjectCrossReference_3_1_0.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//OrderRef1:
		//	{OrderRef1} "OrderRef1" "{" ("name" name=[ecore::EObject|EString])? "}";
		public ParserRule getRule() { return rule; }

		//{OrderRef1} "OrderRef1" "{" ("name" name=[ecore::EObject|EString])? "}"
		public Group getGroup() { return cGroup; }

		//{OrderRef1}
		public Action getOrderRef1Action_0() { return cOrderRef1Action_0; }

		//"OrderRef1"
		public Keyword getOrderRef1Keyword_1() { return cOrderRef1Keyword_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//("name" name=[ecore::EObject|EString])?
		public Group getGroup_3() { return cGroup_3; }

		//"name"
		public Keyword getNameKeyword_3_0() { return cNameKeyword_3_0; }

		//name=[ecore::EObject|EString]
		public Assignment getNameAssignment_3_1() { return cNameAssignment_3_1; }

		//[ecore::EObject|EString]
		public CrossReference getNameEObjectCrossReference_3_1_0() { return cNameEObjectCrossReference_3_1_0; }

		//EString
		public RuleCall getNameEObjectEStringParserRuleCall_3_1_0_1() { return cNameEObjectEStringParserRuleCall_3_1_0_1; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}

	public class OrderRef2Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "OrderRef2");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cOrderRef2Action_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cOrderRef2Keyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cNameKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cNameAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final CrossReference cNameEObjectCrossReference_3_1_0 = (CrossReference)cNameAssignment_3_1.eContents().get(0);
		private final RuleCall cNameEObjectEStringParserRuleCall_3_1_0_1 = (RuleCall)cNameEObjectCrossReference_3_1_0.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//OrderRef2:
		//	{OrderRef2} "OrderRef2" "{" ("name" name=[ecore::EObject|EString])? "}";
		public ParserRule getRule() { return rule; }

		//{OrderRef2} "OrderRef2" "{" ("name" name=[ecore::EObject|EString])? "}"
		public Group getGroup() { return cGroup; }

		//{OrderRef2}
		public Action getOrderRef2Action_0() { return cOrderRef2Action_0; }

		//"OrderRef2"
		public Keyword getOrderRef2Keyword_1() { return cOrderRef2Keyword_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//("name" name=[ecore::EObject|EString])?
		public Group getGroup_3() { return cGroup_3; }

		//"name"
		public Keyword getNameKeyword_3_0() { return cNameKeyword_3_0; }

		//name=[ecore::EObject|EString]
		public Assignment getNameAssignment_3_1() { return cNameAssignment_3_1; }

		//[ecore::EObject|EString]
		public CrossReference getNameEObjectCrossReference_3_1_0() { return cNameEObjectCrossReference_3_1_0; }

		//EString
		public RuleCall getNameEObjectEStringParserRuleCall_3_1_0_1() { return cNameEObjectEStringParserRuleCall_3_1_0_1; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
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

	public class ID0Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ID0");
		private final RuleCall cIDTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//ID0 returns type::ID: //	'ID' / * TODO: implement this rule and an appropriate IValueConverter * /;
		//	ID;
		public ParserRule getRule() { return rule; }

		////	'ID' / * TODO: implement this rule and an appropriate IValueConverter * /;
		//ID
		public RuleCall getIDTerminalRuleCall() { return cIDTerminalRuleCall; }
	}

	public class EObjectElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EObject");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cEObjectAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cEObjectKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//EObject returns ecore::EObject:
		//	{ecore::EObject} "EObject";
		public ParserRule getRule() { return rule; }

		//{ecore::EObject} "EObject"
		public Group getGroup() { return cGroup; }

		//{ecore::EObject}
		public Action getEObjectAction_0() { return cEObjectAction_0; }

		//"EObject"
		public Keyword getEObjectKeyword_1() { return cEObjectKeyword_1; }
	}

	public class EStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EString");
		private final RuleCall cSTRINGTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//EString returns ecore::EString:
		//	STRING;
		public ParserRule getRule() { return rule; }

		//STRING
		public RuleCall getSTRINGTerminalRuleCall() { return cSTRINGTerminalRuleCall; }
	}
	
	
	private final OrdersTypeElements pOrdersType;
	private final OrderDetail1Elements pOrderDetail1;
	private final OrderDetail2Elements pOrderDetail2;
	private final OrderRef1Elements pOrderRef1;
	private final OrderRef2Elements pOrderRef2;
	private final String0Elements pString0;
	private final ID0Elements pID0;
	private final EObjectElements pEObject;
	private final EStringElements pEString;
	
	private final Grammar grammar;

	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public MyDslGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pOrdersType = new OrdersTypeElements();
		this.pOrderDetail1 = new OrderDetail1Elements();
		this.pOrderDetail2 = new OrderDetail2Elements();
		this.pOrderRef1 = new OrderRef1Elements();
		this.pOrderRef2 = new OrderRef2Elements();
		this.pString0 = new String0Elements();
		this.pID0 = new ID0Elements();
		this.pEObject = new EObjectElements();
		this.pEString = new EStringElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.mydsl.references.untyped.MyDsl".equals(grammar.getName())) {
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

	
	//OrdersType:
	//	"OrdersType" "{" "order1" "{" order1+=OrderDetail1 ("," order1+=OrderDetail1)* "}" "order2" "{" order2+=OrderDetail2
	//	("," order2+=OrderDetail2)* "}" "orderReference1" "{" orderReference1+=OrderRef1 ("," orderReference1+=OrderRef1)*
	//	"}" "orderReference2" "{" orderReference2+=OrderRef2 ("," orderReference2+=OrderRef2)* "}" "}";
	public OrdersTypeElements getOrdersTypeAccess() {
		return pOrdersType;
	}
	
	public ParserRule getOrdersTypeRule() {
		return getOrdersTypeAccess().getRule();
	}

	//OrderDetail1:
	//	{OrderDetail1} "OrderDetail1" orderID=ID0 "{" ("customerAddress" customerAddress=String0)? ("customerContact"
	//	customerContact=String0)? ("customerName" customerName=String0)? "}";
	public OrderDetail1Elements getOrderDetail1Access() {
		return pOrderDetail1;
	}
	
	public ParserRule getOrderDetail1Rule() {
		return getOrderDetail1Access().getRule();
	}

	//OrderDetail2:
	//	{OrderDetail2} "OrderDetail2" orderID=ID0 "{" ("customerName" customerName=String0)? "}";
	public OrderDetail2Elements getOrderDetail2Access() {
		return pOrderDetail2;
	}
	
	public ParserRule getOrderDetail2Rule() {
		return getOrderDetail2Access().getRule();
	}

	//OrderRef1:
	//	{OrderRef1} "OrderRef1" "{" ("name" name=[ecore::EObject|EString])? "}";
	public OrderRef1Elements getOrderRef1Access() {
		return pOrderRef1;
	}
	
	public ParserRule getOrderRef1Rule() {
		return getOrderRef1Access().getRule();
	}

	//OrderRef2:
	//	{OrderRef2} "OrderRef2" "{" ("name" name=[ecore::EObject|EString])? "}";
	public OrderRef2Elements getOrderRef2Access() {
		return pOrderRef2;
	}
	
	public ParserRule getOrderRef2Rule() {
		return getOrderRef2Access().getRule();
	}

	/// * TODO: implement this rule and an appropriate IValueConverter * / String0 returns type::String:
	//	"String";
	public String0Elements getString0Access() {
		return pString0;
	}
	
	public ParserRule getString0Rule() {
		return getString0Access().getRule();
	}

	//ID0 returns type::ID: //	'ID' / * TODO: implement this rule and an appropriate IValueConverter * /;
	//	ID;
	public ID0Elements getID0Access() {
		return pID0;
	}
	
	public ParserRule getID0Rule() {
		return getID0Access().getRule();
	}

	//EObject returns ecore::EObject:
	//	{ecore::EObject} "EObject";
	public EObjectElements getEObjectAccess() {
		return pEObject;
	}
	
	public ParserRule getEObjectRule() {
		return getEObjectAccess().getRule();
	}

	//EString returns ecore::EString:
	//	STRING;
	public EStringElements getEStringAccess() {
		return pEString;
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
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
