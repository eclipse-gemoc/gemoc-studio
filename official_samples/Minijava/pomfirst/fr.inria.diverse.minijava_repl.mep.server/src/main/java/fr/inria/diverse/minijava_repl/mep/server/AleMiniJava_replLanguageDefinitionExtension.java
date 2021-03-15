package fr.inria.diverse.minijava_repl.mep.server;

import org.eclipse.gemoc.xdsmlframework.api.extensions.languages.LanguageDefinitionExtension;

public class AleMiniJava_replLanguageDefinitionExtension extends LanguageDefinitionExtension {
	@Override
	public String getName() {
		return "MiniJava_repl";
	}

	@Override
	public String getXDSMLFilePath() {
		return "file:/home/rhiobet/gemoc-full/gemoc-studio/official_samples/Minijava/language_workbench/fr.inria.diverse.minijava_repl.xtext/model/generated/MiniJava_repl.dsl";
	}
		
}
