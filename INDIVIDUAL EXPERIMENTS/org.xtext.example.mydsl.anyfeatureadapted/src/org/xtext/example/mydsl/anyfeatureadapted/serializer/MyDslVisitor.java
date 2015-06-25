package org.xtext.example.mydsl.anyfeatureadapted.serializer;

import anyfeatureadapted.AnyGenericAttribute;
import anyfeatureadapted.AnyGenericElement;
import anyfeatureadapted.util.AnyfeatureadaptedSwitch;

public class MyDslVisitor {

	AnyfeatureadaptedSwitch visitorSwitch;
	
	public AnyfeatureadaptedSwitch getVisitorSwitch() {
		return visitorSwitch;
	}

	public MyDslVisitor() {
		visitorSwitch = new AnyfeatureadaptedSwitch() {
			public Object caseAnyGenericElement(AnyGenericElement object) {
				System.out.println("visiting AnyGenericElement: " + object.getElemName());
				return object;
			}
			public Object caseAnyGenericAttribute(AnyGenericAttribute object) {
				System.out.println("visiting AnyGenericAttribute: " + object.getAttrName());
				return object;
			}
		};
	}
	
	
	
}
