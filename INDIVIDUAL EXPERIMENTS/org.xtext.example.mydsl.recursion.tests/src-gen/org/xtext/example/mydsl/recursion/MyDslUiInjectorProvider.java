/*
* generated by Xtext
*/
package org.xtext.example.mydsl.recursion;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class MyDslUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return org.xtext.example.mydsl.recursion.ui.internal.MyDslActivator.getInstance().getInjector("org.xtext.example.mydsl.recursion.MyDsl");
	}
	
}
