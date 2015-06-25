/*
 * generated by Xtext
 */
package eu.artist.tosca.dsl.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import eu.artist.tosca.dsl.ui.internal.ToscaMarkupLanguageActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class ToscaMarkupLanguageExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return ToscaMarkupLanguageActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return ToscaMarkupLanguageActivator.getInstance().getInjector(ToscaMarkupLanguageActivator.EU_ARTIST_TOSCA_DSL_TOSCAMARKUPLANGUAGE);
	}
	
}
