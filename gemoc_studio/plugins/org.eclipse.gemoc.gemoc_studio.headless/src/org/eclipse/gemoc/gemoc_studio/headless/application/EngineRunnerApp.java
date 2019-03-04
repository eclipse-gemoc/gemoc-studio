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

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.eclipse.gemoc.ale.interpreted.engine.AleEngine;
import org.eclipse.gemoc.commons.eclipse.core.resources.IFileUtils;
import org.eclipse.gemoc.execution.sequential.javaengine.PlainK3ExecutionEngine;
import org.eclipse.gemoc.executionframework.engine.commons.DslHelper;
import org.eclipse.gemoc.gemoc_studio.headless.Activator;
import org.eclipse.gemoc.gemoc_studio.headless.runner.ALEInterpretedSequentialRunner;
import org.eclipse.gemoc.gemoc_studio.headless.runner.PlainK3SequentialRunner;

public class EngineRunnerApp implements IApplication {

	Options options = null; // Command line options
	private static final String HELP_OPTION = "h";
	private static final String LIST_AVAILABLE_LANGUAGES_OPTION = "ll";
	private static final String LIST_AVAILABLE_ENGINES_OPTION = "le";
	private static final String MODEL_FILE_OPTION = "m";
	private static final String LANGUAGE_OPTION = "l";
	private static final String ENGINE_OPTION = "e";
	private static final String VERBOSE_OPTION = "v";
	
	// engine specific options 
	// TODO move model specific options in a better place (from engine declaration extension point ?)
	private static final String INITIALIZATION_METHOD_OPTION = "initMethod"; // is this engine specific ?
	private static final String METHOD_ENTRY_POINT_OPTION = "mainMethod";
	private static final String MODEL_ENTRY_POINT_OPTION = "modelEntryPoint";
	
	public boolean isVerbose = false;

	CommandLine cmd; // parsed command line
	
	// use a non empty loggerId for debug or verbose messages
	// use a "" loggerId for high level user messages
	public static String LoggerID = "EngineRunnerApp";
	
	@Override
	public Object start(IApplicationContext context) throws Exception {
		String[] appArgs = (String[]) context.getArguments().get(IApplicationContext.APPLICATION_ARGS);
		
		parseCommandLineArgs(appArgs);
		if(appArgs.length == 0) {
			System.out.println("Missing options");
			printHelp();
			return IApplication.EXIT_OK;
		}
		if(cmd.hasOption(VERBOSE_OPTION)) {
			isVerbose = true;
			Activator.getDefault().getMessaggingSystem().debug("all arguments seen:",LoggerID);
			Activator.getDefault().getMessaggingSystem().debug(String.join(" ", appArgs),LoggerID);	  		
			Activator.getDefault().getMessaggingSystem().debug("Remaining args not handled by Apache CLI:",LoggerID);	
			Activator.getDefault().getMessaggingSystem().debug(String.join(" ", cmd.getArgList()),LoggerID);	 
		}
		if(cmd.hasOption(HELP_OPTION)) {
			printHelp();
		}
		if(cmd.hasOption(LIST_AVAILABLE_LANGUAGES_OPTION)) {
			printAvailableLanguages();
		}
		if(cmd.hasOption(LIST_AVAILABLE_ENGINES_OPTION)) {
			printAvailableEngines();
		}
		String selectedEngineName = null; // remains null if engine not found
		if(cmd.hasOption(ENGINE_OPTION)) {
			String proposedEngine = cmd.getOptionValue(ENGINE_OPTION, getDefaultEngineName());
			if(getAllEngines().contains(proposedEngine)) {
				selectedEngineName = proposedEngine;
			} else {
				Activator.getDefault().getMessaggingSystem().error("Engine \""+proposedEngine+"\" not available in this Studio","");
			}
		} else if(!getAllEngines().isEmpty()) { // remains null if engine not found
			selectedEngineName = getDefaultEngineName();
		}
		String selectedLanguageName = null; // remains null if language not found
		if(cmd.hasOption(LANGUAGE_OPTION)) {
			String proposedLanguage = cmd.getOptionValue(LANGUAGE_OPTION, getDefaultLanguageName());
			if(DslHelper.getAllLanguages().contains(proposedLanguage)) {
				selectedLanguageName = proposedLanguage;
			} else {
				Activator.getDefault().getMessaggingSystem().error("Language \""+proposedLanguage+"\" not available in this Studio", "");
			}
		} else if(!DslHelper.getAllLanguages().isEmpty()) { // remains null if language not found
			selectedLanguageName = getDefaultLanguageName();
		}
		
		if(cmd.hasOption(MODEL_FILE_OPTION)) {
			if(isVerbose) {
				Activator.getDefault().getMessaggingSystem().debug("Will run model "+cmd.getOptionValue(MODEL_FILE_OPTION), LoggerID);
				Activator.getDefault().getMessaggingSystem().debug("Workspace is mapped to "+ResourcesPlugin.getWorkspace().getRoot().getLocation().toString(), LoggerID);
			}
			if(selectedEngineName== null) {
				Activator.getDefault().getMessaggingSystem().error("Missing engine parameter","");
				return IApplication.EXIT_OK;
			}
			if(selectedLanguageName==null) {
				Activator.getDefault().getMessaggingSystem().error("Missing language parameter","");
				return IApplication.EXIT_OK;
			}
			String modelFileStr = cmd.getOptionValue(MODEL_FILE_OPTION);
			if(modelFileStr==null) {
				Activator.getDefault().getMessaggingSystem().error("Missing model file arg","");
				return IApplication.EXIT_OK;
			}
			IFile modelFile = IFileUtils.getIFileFromWorkspaceOrFileSystem(modelFileStr);
			if(!modelFile.exists()) {
				Activator.getDefault().getMessaggingSystem().error("File "+modelFileStr + " doesn't exists","");
				return IApplication.EXIT_OK;
			}
			String modelentryPoint = cmd.getOptionValue(MODEL_ENTRY_POINT_OPTION);
			if(modelentryPoint==null) {
				System.out.println("Missing model entry point args");
				return IApplication.EXIT_OK;
			}
			String methodentryPoint = cmd.getOptionValue(METHOD_ENTRY_POINT_OPTION);
			if(methodentryPoint==null) {
				System.out.println("Missing method entry point args");
				return IApplication.EXIT_OK;
			}
			String initializationMethod = cmd.getOptionValue(INITIALIZATION_METHOD_OPTION, "");
						
			List<String> initializationMethodArgsList = cmd.getArgList();
			String initializationMethodArgs = String.join("&#10;", initializationMethodArgsList);
			
			
			if(selectedEngineName.equals(new PlainK3ExecutionEngine().engineKindName().replaceAll(" ", ""))) {
				
				
				
				Activator.getDefault().getMessaggingSystem().debug("Initializing a PlainK3ExecutionEngine...", LoggerID);
				PlainK3SequentialRunner runner = new PlainK3SequentialRunner();
				// create a standard launch configuration with these data
				// cf. org.eclipse.gemoc.dsl.debug.ide.sirius.ui.launch.AbstractDSLLaunchConfigurationDelegateUI for an example
				runner.buildLaunchConfiguration(modelFile,
						selectedLanguageName,
						modelentryPoint,
						methodentryPoint,
						initializationMethod,
						initializationMethodArgs);				
				runner.run();
			} else if (selectedEngineName.equals(new AleEngine().engineKindName().replaceAll(" ", ""))) {
				
				Activator.getDefault().getMessaggingSystem().debug("Initializing an ALEInterpretedSequentialExecutionEngine...", LoggerID);
				ALEInterpretedSequentialRunner runner = new ALEInterpretedSequentialRunner();
				runner.buildLaunchConfiguration(modelFile,
						selectedLanguageName,
						modelentryPoint,
						methodentryPoint,
						initializationMethod,
						initializationMethodArgs);
				
				runner.run();
			} 
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
		options.addOption(Option.builder(VERBOSE_OPTION)
				.longOpt("verbose")
				.desc("Print more messages").build());
		options.addOption(Option.builder(LIST_AVAILABLE_LANGUAGES_OPTION)
				.longOpt("list-languages")
				.desc("Print the list of installed GEMOC languages").build());
		options.addOption(Option.builder(LIST_AVAILABLE_ENGINES_OPTION)
				.longOpt("list-engines")
				.desc("Print the list of installed GEMOC engines").build());
		options.addOption(Option.builder(ENGINE_OPTION)
				.longOpt("engine")
				.required(false)
				.hasArg(true)
				.argName("engineName")
				.desc("Uses the given engine when running the model (default is "+getDefaultEngineName()+")").build());
		options.addOption(Option.builder(LANGUAGE_OPTION)
				.longOpt("language")
				.required(false)
				.hasArg(true)
				.argName("languageName")
				.desc("Uses the given language when running the model (default is "+getDefaultLanguageName()+")").build());
		options.addOption(Option.builder(MODEL_FILE_OPTION)
				.longOpt("model-file")
				.required(false)
				.hasArg(true)
				.argName("fileName")
				.desc("Runs the given model").build());
		

		// engine specific options 
		// TODO move model specific options in a better place (from engine declaration extension point ?)
		options.addOption(Option.builder(INITIALIZATION_METHOD_OPTION)
				.required(false)
				.hasArg(true)
				.argName("initializationMethod")
				.desc("Method run prior to the execution in order to initialize the model (Runtime data) from arguments [GEMOCKermetaSequentialEngine, ALEEngine]").build());
		options.addOption(Option.builder(METHOD_ENTRY_POINT_OPTION)
				.required(false)
				.hasArg(true)
				.argName("methodEntryPoint")
				.desc("Method run as that start of the execution (Ie. main) [GEMOCKermetaSequentialEngine, ALEEngine]").build());
		options.addOption(Option.builder(MODEL_ENTRY_POINT_OPTION)
				.required(false)
				.hasArg(true)
				.argName("modelEntryPoint")
				.desc("Model element used as 'self' for the method entry point [GEMOCKermetaSequentialEngine, ALEEngine]").build());
		
		CommandLineParser parser = new DefaultParser();
		try {
			cmd = parser.parse(options, appArgs, true);
		} catch (ParseException e) {
			System.err.println("Error parsing arguments");
			System.err.println(e.getMessage());
			System.err.flush();
			printHelp();
			System.exit(1);
		}
	}	
	

	private String getDefaultLanguageName() {
		List<String> languagesNames = DslHelper.getAllLanguages();
		if(languagesNames.isEmpty()) 
			return "(no valid language definition found)";
		else 
			return languagesNames.get(0);
	}


	private String getDefaultEngineName() {
		// TODO get the name from installed engine typically calling a declared equivalent to PlainK3ExecutionEngine.engineKindName but using a static ?
		new PlainK3ExecutionEngine().engineKindName().replaceAll(" ", "");
		return new PlainK3ExecutionEngine().engineKindName().replaceAll(" ", "");
	}


	private void printAvailableLanguages() {
		System.out.println("List of the available GEMOC languages installed in this studio: ");
		List<String> languagesNames = DslHelper.getAllLanguages();
		if(languagesNames.isEmpty()) {
			Activator.getDefault().getMessaggingSystem().info("No language found.","");
			Activator.getDefault().getMessaggingSystem().info("If you think that some language should available in this distribution, please check :","");
			Activator.getDefault().getMessaggingSystem().info(" - the content of the plugins folder", "");
			Activator.getDefault().getMessaggingSystem().info(" - the content of the dropins folder", "");
			Activator.getDefault().getMessaggingSystem().info(" - that the jars of the languages in these folders are correctly built (unzip the jar and check content)", "");
			
		}
		int i = 0;
		for (String string : languagesNames) {
			if(i == 0) 
				Activator.getDefault().getMessaggingSystem().info(string+" (default)", "");
			else
				Activator.getDefault().getMessaggingSystem().info(string, "");
			i++;
		}
	}
	
	private void printAvailableEngines() {
		Activator.getDefault().getMessaggingSystem().info("List of the GEMOC engines installed in this studio and available using command line: ", "");
		int i = 0;
		for (String string : getAllEngines()) {
			if(i == 0) 
				Activator.getDefault().getMessaggingSystem().info(string+" (default)", "");
			else
				Activator.getDefault().getMessaggingSystem().info(string, "");
			i++;
		}
	}
	
	public List<String> getAllEngines(){
		// TODO replace this by a proper extension point
		List<String> l = new ArrayList<String>();
		l.add(new PlainK3ExecutionEngine().engineKindName().replaceAll(" ", ""));
		l.add(new AleEngine().engineKindName().replaceAll(" ", ""));
		return l;
	}

	
	
	private void printHelp() {
		String header = "Run a single model conforming to a language using GEMOC Engine.\n" + 
	"Please read the documentation about how to package the language.\n" +
	"Arguments after a \"--\" will be passed to the model initialization method if any.";
		String footer = "Please report issue at https://github.com/eclipse/gemoc-studio/issues";
		HelpFormatter formatter = new HelpFormatter();
		 formatter.printHelp("GemocStudioHeadless", header, options, footer, true);
		
	}
}
