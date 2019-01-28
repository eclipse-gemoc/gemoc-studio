/*******************************************************************************
 * Copyright (c)  2019 Inria.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Inria - initial API and implementation
 *******************************************************************************/
package org.eclipse.gemoc.gemoc_studio.headless.application;

import java.util.List;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.eclipse.gemoc.executionframework.engine.commons.DslHelper;

public class EngineRunner implements IApplication {

	Options options = null; // Command line options
	private static final String HELP_OPTION = "h";
	private static final String LIST_AVAILABLE_LANGUAGES_OPTION = "l";
	
	Option help = new Option( "HELP_OPTION", "print this message" );
	

	CommandLine cmd; // parsed command line
	
	@Override
	public Object start(IApplicationContext context) throws Exception {
		String[] appArgs = (String[]) context.getArguments().get(IApplicationContext.APPLICATION_ARGS);
		parseCommandLineArgs(appArgs);
		if(appArgs.length == 0) {
			System.out.println("Missing options");
			printHelp();
			return IApplication.EXIT_OK;
		}
		if(cmd.hasOption(HELP_OPTION)) {
			printHelp();
		}

		if(cmd.hasOption(LIST_AVAILABLE_LANGUAGES_OPTION)) {
			printAvailableLanguages();
		}
		
		
		return IApplication.EXIT_OK;
	}


	@Override
	public void stop() {
		// nothing to do

	}
	
	protected void parseCommandLineArgs(String[] appArgs) {
		options = new Options();
		options.addOption(Option.builder(HELP_OPTION)
				.longOpt("help")
				.desc("Print help message").build());
		options.addOption(Option.builder(LIST_AVAILABLE_LANGUAGES_OPTION)
				.longOpt("list-languages").desc("Print the list of installed GEMOC languages").build());
				
		
		CommandLineParser parser = new DefaultParser();
		try {
			cmd = parser.parse(options, appArgs);
		} catch (ParseException e) {
			System.err.println("Error parsing arguments");
			e.printStackTrace();
			System.exit(1);
		}
	}	
	

	private void printAvailableLanguages() {
		System.out.println("List the available GEMOC languages installed in this studio: ");
		List<String> languagesNames = DslHelper.getAllLanguages();
		if(languagesNames.isEmpty()) {
			System.out.println("No language found.");
			System.out.println("If you think that some language should available in this distribution, please check :");
			System.out.println(" - the content of the plugins folder");
			System.out.println(" - the content of the dropins folder");
			System.out.println(" - that the jars of the languages in these folders are correctly built (unzip the jar and check content)");
			
		}
		for (String string : languagesNames) {
			System.out.println(string);
		}
	}

	
	
	private void printHelp() {
		String header = "Run a model conforming to a language using GEMOC Engine.\n" + 
	"Please read the documentation about how to package the language.";
		String footer = "Please report issue at https://github.com/eclipse/gemoc-studio/issues";
		HelpFormatter formatter = new HelpFormatter();
		 formatter.printHelp("GEMOC EngineRunner CLI", header, options, footer, true);
		
	}
}
