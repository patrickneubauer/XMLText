/*
* generated by Xtext
*/
grammar InternalMyDsl;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package org.xtext.example.mydsl.restrictions.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.xtext.example.mydsl.restrictions.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.restrictions.services.MyDslGrammarAccess;

}

@parser::members {
 
 	private MyDslGrammarAccess grammarAccess;
 	
    public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
    	this.grammarAccess = grammarAccess;
    }
    
    @Override
    protected Grammar getGrammar() {
    	return grammarAccess.getGrammar();
    }
    
    @Override
    protected String getValueForTokenName(String tokenName) {
    	return tokenName;
    }

}




// Entry rule entryRuleOrdersType
entryRuleOrdersType 
:
{ before(grammarAccess.getOrdersTypeRule()); }
	 ruleOrdersType
{ after(grammarAccess.getOrdersTypeRule()); } 
	 EOF 
;

// Rule OrdersType
ruleOrdersType
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getOrdersTypeAccess().getGroup()); }
(rule__OrdersType__Group__0)
{ after(grammarAccess.getOrdersTypeAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleOrderDetail
entryRuleOrderDetail 
:
{ before(grammarAccess.getOrderDetailRule()); }
	 ruleOrderDetail
{ after(grammarAccess.getOrderDetailRule()); } 
	 EOF 
;

// Rule OrderDetail
ruleOrderDetail
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getOrderDetailAccess().getGroup()); }
(rule__OrderDetail__Group__0)
{ after(grammarAccess.getOrderDetailAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleRestrictedAddress
entryRuleRestrictedAddress 
:
{ before(grammarAccess.getRestrictedAddressRule()); }
	 ruleRestrictedAddress
{ after(grammarAccess.getRestrictedAddressRule()); } 
	 EOF 
;

// Rule RestrictedAddress
ruleRestrictedAddress
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getRestrictedAddressAccess().getGroup()); }
(rule__RestrictedAddress__Group__0)
{ after(grammarAccess.getRestrictedAddressAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleCustomerAge
entryRuleCustomerAge 
:
{ before(grammarAccess.getCustomerAgeRule()); }
	 ruleCustomerAge
{ after(grammarAccess.getCustomerAgeRule()); } 
	 EOF 
;

// Rule CustomerAge
ruleCustomerAge
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getCustomerAgeAccess().getINTTerminalRuleCall()); }
	RULE_INT
{ after(grammarAccess.getCustomerAgeAccess().getINTTerminalRuleCall()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleCustomerContactNumber1
entryRuleCustomerContactNumber1 
:
{ before(grammarAccess.getCustomerContactNumber1Rule()); }
	 ruleCustomerContactNumber1
{ after(grammarAccess.getCustomerContactNumber1Rule()); } 
	 EOF 
;

// Rule CustomerContactNumber1
ruleCustomerContactNumber1
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getCustomerContactNumber1Access().getINTTerminalRuleCall()); }
	RULE_INT
{ after(grammarAccess.getCustomerContactNumber1Access().getINTTerminalRuleCall()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleCustomerFirstName
entryRuleCustomerFirstName 
:
{ before(grammarAccess.getCustomerFirstNameRule()); }
	 ruleCustomerFirstName
{ after(grammarAccess.getCustomerFirstNameRule()); } 
	 EOF 
;

// Rule CustomerFirstName
ruleCustomerFirstName
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getCustomerFirstNameAccess().getSTRINGTerminalRuleCall()); }
	RULE_STRING
{ after(grammarAccess.getCustomerFirstNameAccess().getSTRINGTerminalRuleCall()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleCustomerLastName
entryRuleCustomerLastName 
:
{ before(grammarAccess.getCustomerLastNameRule()); }
	 ruleCustomerLastName
{ after(grammarAccess.getCustomerLastNameRule()); } 
	 EOF 
;

// Rule CustomerLastName
ruleCustomerLastName
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getCustomerLastNameAccess().getSTRINGTerminalRuleCall()); }
	RULE_STRING
{ after(grammarAccess.getCustomerLastNameAccess().getSTRINGTerminalRuleCall()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleCustomerNumber
entryRuleCustomerNumber 
:
{ before(grammarAccess.getCustomerNumberRule()); }
	 ruleCustomerNumber
{ after(grammarAccess.getCustomerNumberRule()); } 
	 EOF 
;

// Rule CustomerNumber
ruleCustomerNumber
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getCustomerNumberAccess().getSTRINGTerminalRuleCall()); }
	RULE_STRING
{ after(grammarAccess.getCustomerNumberAccess().getSTRINGTerminalRuleCall()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleCustomerPassword
entryRuleCustomerPassword 
:
{ before(grammarAccess.getCustomerPasswordRule()); }
	 ruleCustomerPassword
{ after(grammarAccess.getCustomerPasswordRule()); } 
	 EOF 
;

// Rule CustomerPassword
ruleCustomerPassword
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getCustomerPasswordAccess().getSTRINGTerminalRuleCall()); }
	RULE_STRING
{ after(grammarAccess.getCustomerPasswordAccess().getSTRINGTerminalRuleCall()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleID0
entryRuleID0 
:
{ before(grammarAccess.getID0Rule()); }
	 ruleID0
{ after(grammarAccess.getID0Rule()); } 
	 EOF 
;

// Rule ID0
ruleID0
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getID0Access().getIDKeyword()); }

	'ID' 

{ after(grammarAccess.getID0Access().getIDKeyword()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleString0
entryRuleString0 
:
{ before(grammarAccess.getString0Rule()); }
	 ruleString0
{ after(grammarAccess.getString0Rule()); } 
	 EOF 
;

// Rule String0
ruleString0
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getString0Access().getSTRINGTerminalRuleCall()); }
	RULE_STRING
{ after(grammarAccess.getString0Access().getSTRINGTerminalRuleCall()); }
)

;
finally {
	restoreStackSize(stackSize);
}




// Rule USState
ruleUSState
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUSStateAccess().getAlternatives()); }
(rule__USState__Alternatives)
{ after(grammarAccess.getUSStateAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__USState__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUSStateAccess().getA_KEnumLiteralDeclaration_0()); }
(	'A_K' 
)
{ after(grammarAccess.getUSStateAccess().getA_KEnumLiteralDeclaration_0()); }
)

    |(
{ before(grammarAccess.getUSStateAccess().getL_TEnumLiteralDeclaration_1()); }
(	'L_T' 
)
{ after(grammarAccess.getUSStateAccess().getL_TEnumLiteralDeclaration_1()); }
)

    |(
{ before(grammarAccess.getUSStateAccess().getU_ZEnumLiteralDeclaration_2()); }
(	'U_Z' 
)
{ after(grammarAccess.getUSStateAccess().getU_ZEnumLiteralDeclaration_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__OrdersType__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__OrdersType__Group__0__Impl
	rule__OrdersType__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__OrdersType__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOrdersTypeAccess().getOrdersTypeKeyword_0()); }

	'OrdersType' 

{ after(grammarAccess.getOrdersTypeAccess().getOrdersTypeKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__OrdersType__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__OrdersType__Group__1__Impl
	rule__OrdersType__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__OrdersType__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOrdersTypeAccess().getLeftCurlyBracketKeyword_1()); }

	'{' 

{ after(grammarAccess.getOrdersTypeAccess().getLeftCurlyBracketKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__OrdersType__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__OrdersType__Group__2__Impl
	rule__OrdersType__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__OrdersType__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOrdersTypeAccess().getOrderKeyword_2()); }

	'order' 

{ after(grammarAccess.getOrdersTypeAccess().getOrderKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__OrdersType__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__OrdersType__Group__3__Impl
	rule__OrdersType__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__OrdersType__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOrdersTypeAccess().getLeftCurlyBracketKeyword_3()); }

	'{' 

{ after(grammarAccess.getOrdersTypeAccess().getLeftCurlyBracketKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__OrdersType__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__OrdersType__Group__4__Impl
	rule__OrdersType__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__OrdersType__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOrdersTypeAccess().getOrderAssignment_4()); }
(rule__OrdersType__OrderAssignment_4)
{ after(grammarAccess.getOrdersTypeAccess().getOrderAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__OrdersType__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__OrdersType__Group__5__Impl
	rule__OrdersType__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__OrdersType__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOrdersTypeAccess().getGroup_5()); }
(rule__OrdersType__Group_5__0)*
{ after(grammarAccess.getOrdersTypeAccess().getGroup_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__OrdersType__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__OrdersType__Group__6__Impl
	rule__OrdersType__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__OrdersType__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOrdersTypeAccess().getRightCurlyBracketKeyword_6()); }

	'}' 

{ after(grammarAccess.getOrdersTypeAccess().getRightCurlyBracketKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__OrdersType__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__OrdersType__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OrdersType__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOrdersTypeAccess().getRightCurlyBracketKeyword_7()); }

	'}' 

{ after(grammarAccess.getOrdersTypeAccess().getRightCurlyBracketKeyword_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


















rule__OrdersType__Group_5__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__OrdersType__Group_5__0__Impl
	rule__OrdersType__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__OrdersType__Group_5__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOrdersTypeAccess().getCommaKeyword_5_0()); }

	',' 

{ after(grammarAccess.getOrdersTypeAccess().getCommaKeyword_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__OrdersType__Group_5__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__OrdersType__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OrdersType__Group_5__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOrdersTypeAccess().getOrderAssignment_5_1()); }
(rule__OrdersType__OrderAssignment_5_1)
{ after(grammarAccess.getOrdersTypeAccess().getOrderAssignment_5_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__OrderDetail__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__OrderDetail__Group__0__Impl
	rule__OrderDetail__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__OrderDetail__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOrderDetailAccess().getOrderDetailKeyword_0()); }

	'OrderDetail' 

{ after(grammarAccess.getOrderDetailAccess().getOrderDetailKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__OrderDetail__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__OrderDetail__Group__1__Impl
	rule__OrderDetail__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__OrderDetail__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOrderDetailAccess().getOrderIDAssignment_1()); }
(rule__OrderDetail__OrderIDAssignment_1)
{ after(grammarAccess.getOrderDetailAccess().getOrderIDAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__OrderDetail__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__OrderDetail__Group__2__Impl
	rule__OrderDetail__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__OrderDetail__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOrderDetailAccess().getLeftCurlyBracketKeyword_2()); }

	'{' 

{ after(grammarAccess.getOrderDetailAccess().getLeftCurlyBracketKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__OrderDetail__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__OrderDetail__Group__3__Impl
	rule__OrderDetail__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__OrderDetail__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOrderDetailAccess().getGroup_3()); }
(rule__OrderDetail__Group_3__0)?
{ after(grammarAccess.getOrderDetailAccess().getGroup_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__OrderDetail__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__OrderDetail__Group__4__Impl
	rule__OrderDetail__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__OrderDetail__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOrderDetailAccess().getGroup_4()); }
(rule__OrderDetail__Group_4__0)?
{ after(grammarAccess.getOrderDetailAccess().getGroup_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__OrderDetail__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__OrderDetail__Group__5__Impl
	rule__OrderDetail__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__OrderDetail__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOrderDetailAccess().getGroup_5()); }
(rule__OrderDetail__Group_5__0)?
{ after(grammarAccess.getOrderDetailAccess().getGroup_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__OrderDetail__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__OrderDetail__Group__6__Impl
	rule__OrderDetail__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__OrderDetail__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOrderDetailAccess().getGroup_6()); }
(rule__OrderDetail__Group_6__0)?
{ after(grammarAccess.getOrderDetailAccess().getGroup_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__OrderDetail__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__OrderDetail__Group__7__Impl
	rule__OrderDetail__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__OrderDetail__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOrderDetailAccess().getGroup_7()); }
(rule__OrderDetail__Group_7__0)?
{ after(grammarAccess.getOrderDetailAccess().getGroup_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__OrderDetail__Group__8
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__OrderDetail__Group__8__Impl
	rule__OrderDetail__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__OrderDetail__Group__8__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOrderDetailAccess().getGroup_8()); }
(rule__OrderDetail__Group_8__0)?
{ after(grammarAccess.getOrderDetailAccess().getGroup_8()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__OrderDetail__Group__9
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__OrderDetail__Group__9__Impl
	rule__OrderDetail__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__OrderDetail__Group__9__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOrderDetailAccess().getGroup_9()); }
(rule__OrderDetail__Group_9__0)?
{ after(grammarAccess.getOrderDetailAccess().getGroup_9()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__OrderDetail__Group__10
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__OrderDetail__Group__10__Impl
	rule__OrderDetail__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__OrderDetail__Group__10__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOrderDetailAccess().getCustomerAddressKeyword_10()); }

	'customerAddress' 

{ after(grammarAccess.getOrderDetailAccess().getCustomerAddressKeyword_10()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__OrderDetail__Group__11
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__OrderDetail__Group__11__Impl
	rule__OrderDetail__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__OrderDetail__Group__11__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOrderDetailAccess().getCustomerAddressAssignment_11()); }
(rule__OrderDetail__CustomerAddressAssignment_11)
{ after(grammarAccess.getOrderDetailAccess().getCustomerAddressAssignment_11()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__OrderDetail__Group__12
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__OrderDetail__Group__12__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OrderDetail__Group__12__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOrderDetailAccess().getRightCurlyBracketKeyword_12()); }

	'}' 

{ after(grammarAccess.getOrderDetailAccess().getRightCurlyBracketKeyword_12()); }
)

;
finally {
	restoreStackSize(stackSize);
}




























rule__OrderDetail__Group_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__OrderDetail__Group_3__0__Impl
	rule__OrderDetail__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__OrderDetail__Group_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOrderDetailAccess().getCustomerAgeKeyword_3_0()); }

	'customerAge' 

{ after(grammarAccess.getOrderDetailAccess().getCustomerAgeKeyword_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__OrderDetail__Group_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__OrderDetail__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OrderDetail__Group_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOrderDetailAccess().getCustomerAgeAssignment_3_1()); }
(rule__OrderDetail__CustomerAgeAssignment_3_1)
{ after(grammarAccess.getOrderDetailAccess().getCustomerAgeAssignment_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__OrderDetail__Group_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__OrderDetail__Group_4__0__Impl
	rule__OrderDetail__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__OrderDetail__Group_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOrderDetailAccess().getCustomerContact1Keyword_4_0()); }

	'customerContact1' 

{ after(grammarAccess.getOrderDetailAccess().getCustomerContact1Keyword_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__OrderDetail__Group_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__OrderDetail__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OrderDetail__Group_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOrderDetailAccess().getCustomerContact1Assignment_4_1()); }
(rule__OrderDetail__CustomerContact1Assignment_4_1)
{ after(grammarAccess.getOrderDetailAccess().getCustomerContact1Assignment_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__OrderDetail__Group_5__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__OrderDetail__Group_5__0__Impl
	rule__OrderDetail__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__OrderDetail__Group_5__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOrderDetailAccess().getCustomerFirstNameKeyword_5_0()); }

	'customerFirstName' 

{ after(grammarAccess.getOrderDetailAccess().getCustomerFirstNameKeyword_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__OrderDetail__Group_5__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__OrderDetail__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OrderDetail__Group_5__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOrderDetailAccess().getCustomerFirstNameAssignment_5_1()); }
(rule__OrderDetail__CustomerFirstNameAssignment_5_1)
{ after(grammarAccess.getOrderDetailAccess().getCustomerFirstNameAssignment_5_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__OrderDetail__Group_6__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__OrderDetail__Group_6__0__Impl
	rule__OrderDetail__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__OrderDetail__Group_6__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOrderDetailAccess().getCustomerLastNameKeyword_6_0()); }

	'customerLastName' 

{ after(grammarAccess.getOrderDetailAccess().getCustomerLastNameKeyword_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__OrderDetail__Group_6__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__OrderDetail__Group_6__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OrderDetail__Group_6__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOrderDetailAccess().getCustomerLastNameAssignment_6_1()); }
(rule__OrderDetail__CustomerLastNameAssignment_6_1)
{ after(grammarAccess.getOrderDetailAccess().getCustomerLastNameAssignment_6_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__OrderDetail__Group_7__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__OrderDetail__Group_7__0__Impl
	rule__OrderDetail__Group_7__1
;
finally {
	restoreStackSize(stackSize);
}

rule__OrderDetail__Group_7__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOrderDetailAccess().getCustomerNumberKeyword_7_0()); }

	'customerNumber' 

{ after(grammarAccess.getOrderDetailAccess().getCustomerNumberKeyword_7_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__OrderDetail__Group_7__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__OrderDetail__Group_7__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OrderDetail__Group_7__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOrderDetailAccess().getCustomerNumberAssignment_7_1()); }
(rule__OrderDetail__CustomerNumberAssignment_7_1)
{ after(grammarAccess.getOrderDetailAccess().getCustomerNumberAssignment_7_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__OrderDetail__Group_8__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__OrderDetail__Group_8__0__Impl
	rule__OrderDetail__Group_8__1
;
finally {
	restoreStackSize(stackSize);
}

rule__OrderDetail__Group_8__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOrderDetailAccess().getCustomerPasswordKeyword_8_0()); }

	'customerPassword' 

{ after(grammarAccess.getOrderDetailAccess().getCustomerPasswordKeyword_8_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__OrderDetail__Group_8__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__OrderDetail__Group_8__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OrderDetail__Group_8__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOrderDetailAccess().getCustomerPasswordAssignment_8_1()); }
(rule__OrderDetail__CustomerPasswordAssignment_8_1)
{ after(grammarAccess.getOrderDetailAccess().getCustomerPasswordAssignment_8_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__OrderDetail__Group_9__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__OrderDetail__Group_9__0__Impl
	rule__OrderDetail__Group_9__1
;
finally {
	restoreStackSize(stackSize);
}

rule__OrderDetail__Group_9__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOrderDetailAccess().getCustomerUSStateKeyword_9_0()); }

	'customerUSState' 

{ after(grammarAccess.getOrderDetailAccess().getCustomerUSStateKeyword_9_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__OrderDetail__Group_9__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__OrderDetail__Group_9__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OrderDetail__Group_9__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOrderDetailAccess().getCustomerUSStateAssignment_9_1()); }
(rule__OrderDetail__CustomerUSStateAssignment_9_1)
{ after(grammarAccess.getOrderDetailAccess().getCustomerUSStateAssignment_9_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__RestrictedAddress__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__RestrictedAddress__Group__0__Impl
	rule__RestrictedAddress__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RestrictedAddress__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRestrictedAddressAccess().getRestrictedAddressKeyword_0()); }

	'RestrictedAddress' 

{ after(grammarAccess.getRestrictedAddressAccess().getRestrictedAddressKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__RestrictedAddress__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__RestrictedAddress__Group__1__Impl
	rule__RestrictedAddress__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__RestrictedAddress__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRestrictedAddressAccess().getLeftCurlyBracketKeyword_1()); }

	'{' 

{ after(grammarAccess.getRestrictedAddressAccess().getLeftCurlyBracketKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__RestrictedAddress__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__RestrictedAddress__Group__2__Impl
	rule__RestrictedAddress__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__RestrictedAddress__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRestrictedAddressAccess().getStreetKeyword_2()); }

	'street' 

{ after(grammarAccess.getRestrictedAddressAccess().getStreetKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__RestrictedAddress__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__RestrictedAddress__Group__3__Impl
	rule__RestrictedAddress__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__RestrictedAddress__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRestrictedAddressAccess().getLeftCurlyBracketKeyword_3()); }

	'{' 

{ after(grammarAccess.getRestrictedAddressAccess().getLeftCurlyBracketKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__RestrictedAddress__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__RestrictedAddress__Group__4__Impl
	rule__RestrictedAddress__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__RestrictedAddress__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRestrictedAddressAccess().getStreetAssignment_4()); }
(rule__RestrictedAddress__StreetAssignment_4)
{ after(grammarAccess.getRestrictedAddressAccess().getStreetAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__RestrictedAddress__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__RestrictedAddress__Group__5__Impl
	rule__RestrictedAddress__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__RestrictedAddress__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRestrictedAddressAccess().getGroup_5()); }
(rule__RestrictedAddress__Group_5__0)*
{ after(grammarAccess.getRestrictedAddressAccess().getGroup_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__RestrictedAddress__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__RestrictedAddress__Group__6__Impl
	rule__RestrictedAddress__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__RestrictedAddress__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRestrictedAddressAccess().getRightCurlyBracketKeyword_6()); }

	'}' 

{ after(grammarAccess.getRestrictedAddressAccess().getRightCurlyBracketKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__RestrictedAddress__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__RestrictedAddress__Group__7__Impl
	rule__RestrictedAddress__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__RestrictedAddress__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRestrictedAddressAccess().getCityKeyword_7()); }

	'city' 

{ after(grammarAccess.getRestrictedAddressAccess().getCityKeyword_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__RestrictedAddress__Group__8
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__RestrictedAddress__Group__8__Impl
	rule__RestrictedAddress__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__RestrictedAddress__Group__8__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRestrictedAddressAccess().getCityAssignment_8()); }
(rule__RestrictedAddress__CityAssignment_8)
{ after(grammarAccess.getRestrictedAddressAccess().getCityAssignment_8()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__RestrictedAddress__Group__9
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__RestrictedAddress__Group__9__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RestrictedAddress__Group__9__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRestrictedAddressAccess().getRightCurlyBracketKeyword_9()); }

	'}' 

{ after(grammarAccess.getRestrictedAddressAccess().getRightCurlyBracketKeyword_9()); }
)

;
finally {
	restoreStackSize(stackSize);
}






















rule__RestrictedAddress__Group_5__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__RestrictedAddress__Group_5__0__Impl
	rule__RestrictedAddress__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RestrictedAddress__Group_5__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRestrictedAddressAccess().getCommaKeyword_5_0()); }

	',' 

{ after(grammarAccess.getRestrictedAddressAccess().getCommaKeyword_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__RestrictedAddress__Group_5__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__RestrictedAddress__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RestrictedAddress__Group_5__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRestrictedAddressAccess().getStreetAssignment_5_1()); }
(rule__RestrictedAddress__StreetAssignment_5_1)
{ after(grammarAccess.getRestrictedAddressAccess().getStreetAssignment_5_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}







rule__OrdersType__OrderAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOrdersTypeAccess().getOrderOrderDetailParserRuleCall_4_0()); }
	ruleOrderDetail{ after(grammarAccess.getOrdersTypeAccess().getOrderOrderDetailParserRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__OrdersType__OrderAssignment_5_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOrdersTypeAccess().getOrderOrderDetailParserRuleCall_5_1_0()); }
	ruleOrderDetail{ after(grammarAccess.getOrdersTypeAccess().getOrderOrderDetailParserRuleCall_5_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__OrderDetail__OrderIDAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOrderDetailAccess().getOrderIDID0ParserRuleCall_1_0()); }
	ruleID0{ after(grammarAccess.getOrderDetailAccess().getOrderIDID0ParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__OrderDetail__CustomerAgeAssignment_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOrderDetailAccess().getCustomerAgeCustomerAgeParserRuleCall_3_1_0()); }
	ruleCustomerAge{ after(grammarAccess.getOrderDetailAccess().getCustomerAgeCustomerAgeParserRuleCall_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__OrderDetail__CustomerContact1Assignment_4_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOrderDetailAccess().getCustomerContact1CustomerContactNumber1ParserRuleCall_4_1_0()); }
	ruleCustomerContactNumber1{ after(grammarAccess.getOrderDetailAccess().getCustomerContact1CustomerContactNumber1ParserRuleCall_4_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__OrderDetail__CustomerFirstNameAssignment_5_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOrderDetailAccess().getCustomerFirstNameCustomerFirstNameParserRuleCall_5_1_0()); }
	ruleCustomerFirstName{ after(grammarAccess.getOrderDetailAccess().getCustomerFirstNameCustomerFirstNameParserRuleCall_5_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__OrderDetail__CustomerLastNameAssignment_6_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOrderDetailAccess().getCustomerLastNameCustomerLastNameParserRuleCall_6_1_0()); }
	ruleCustomerLastName{ after(grammarAccess.getOrderDetailAccess().getCustomerLastNameCustomerLastNameParserRuleCall_6_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__OrderDetail__CustomerNumberAssignment_7_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOrderDetailAccess().getCustomerNumberCustomerNumberParserRuleCall_7_1_0()); }
	ruleCustomerNumber{ after(grammarAccess.getOrderDetailAccess().getCustomerNumberCustomerNumberParserRuleCall_7_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__OrderDetail__CustomerPasswordAssignment_8_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOrderDetailAccess().getCustomerPasswordCustomerPasswordParserRuleCall_8_1_0()); }
	ruleCustomerPassword{ after(grammarAccess.getOrderDetailAccess().getCustomerPasswordCustomerPasswordParserRuleCall_8_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__OrderDetail__CustomerUSStateAssignment_9_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOrderDetailAccess().getCustomerUSStateUSStateEnumRuleCall_9_1_0()); }
	ruleUSState{ after(grammarAccess.getOrderDetailAccess().getCustomerUSStateUSStateEnumRuleCall_9_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__OrderDetail__CustomerAddressAssignment_11
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOrderDetailAccess().getCustomerAddressRestrictedAddressParserRuleCall_11_0()); }
	ruleRestrictedAddress{ after(grammarAccess.getOrderDetailAccess().getCustomerAddressRestrictedAddressParserRuleCall_11_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__RestrictedAddress__StreetAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRestrictedAddressAccess().getStreetString0ParserRuleCall_4_0()); }
	ruleString0{ after(grammarAccess.getRestrictedAddressAccess().getStreetString0ParserRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__RestrictedAddress__StreetAssignment_5_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRestrictedAddressAccess().getStreetString0ParserRuleCall_5_1_0()); }
	ruleString0{ after(grammarAccess.getRestrictedAddressAccess().getStreetString0ParserRuleCall_5_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__RestrictedAddress__CityAssignment_8
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRestrictedAddressAccess().getCityString0ParserRuleCall_8_0()); }
	ruleString0{ after(grammarAccess.getRestrictedAddressAccess().getCityString0ParserRuleCall_8_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


