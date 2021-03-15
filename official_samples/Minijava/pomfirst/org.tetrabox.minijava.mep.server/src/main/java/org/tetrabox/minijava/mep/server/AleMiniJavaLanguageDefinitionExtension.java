package org.tetrabox.minijava.mep.server;

import org.eclipse.gemoc.xdsmlframework.api.extensions.languages.LanguageDefinitionExtension;

public class AleMiniJavaLanguageDefinitionExtension extends LanguageDefinitionExtension {
	@Override
	public String getName() {
		return "MiniJava";
	}

	@Override
	public String getXDSMLFilePath() {
		return "file:/home/rhiobet/gemoc-full/gemoc-studio/official_samples/Minijava/language_workbench/org.tetrabox.minijava.lang/model/minijava_exec.dsl";
	}
		
}
