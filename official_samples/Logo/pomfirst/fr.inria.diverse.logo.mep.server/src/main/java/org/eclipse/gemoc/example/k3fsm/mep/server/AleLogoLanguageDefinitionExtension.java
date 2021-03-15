package org.eclipse.gemoc.example.k3fsm.mep.server;

import org.eclipse.gemoc.xdsmlframework.api.extensions.languages.LanguageDefinitionExtension;

public class AleLogoLanguageDefinitionExtension extends LanguageDefinitionExtension {
	@Override
	public String getName() {
		return "Logo";
	}

	@Override
	public String getXDSMLFilePath() {
		return "file:/home/rhiobet/gemoc-full/gemoc-studio/official_samples/Logo/language_workbench/fr.inria.diverse.logo.model/model/logo.dsl";
	}
		
}
