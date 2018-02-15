/*******************************************************************************
 * Copyright (c) 2016, 2017 Inria and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Inria - initial API and implementation
 *******************************************************************************/
package org.eclipse.gemoc.studio.tests.system.lwb.userstory

import org.eclipse.gemoc.xdsmlframework.ide.ui.XDSMLFrameworkUI
import org.eclipse.gemoc.xdsmlframework.test.lib.MelangeUiInjectorProvider
import org.eclipse.gemoc.xdsmlframework.test.lib.WorkspaceTestHelper
import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot
import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner
import org.eclipse.swtbot.swt.finder.keyboard.Keyboard
import org.eclipse.swtbot.swt.finder.keyboard.KeyboardFactory
import org.eclipse.swtbot.swt.finder.keyboard.Keystrokes
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTreeItem
import org.eclipse.xtext.junit4.AbstractXtextTests
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.ui.testing.util.IResourcesSetupUtil
import org.junit.After
import org.junit.Before
import org.junit.BeforeClass
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.MethodSorters
import org.eclipse.swtbot.swt.finder.utils.SWTBotPreferences
import org.junit.Ignore

/**
 * This class check a scenario where we reuse some of the base projects of the official sample : LegacyFSM
 * in order to create a new language.
 * The tests are ordered and a failure in the initial tests will most likely make fail the following ones.
 */
@RunWith(SWTBotJunit4ClassRunner)
@InjectWith(MelangeUiInjectorProvider)
@FixMethodOrder(MethodSorters::NAME_ASCENDING)
public class CreateSingleSequentialLanguageFromOfficialFSM_Test extends AbstractXtextTests
{
	
	static WorkspaceTestHelper helper = new WorkspaceTestHelper
	

	static final String BASE_FOLDER_NAME = "tests-inputs-gen/SequentialFSM"
	static final String BASE_NAME = "org.eclipse.gemoc.sample.legacyfsm"
	static final String SOURCE_PROJECT_NAME = BASE_NAME + ".fsm"
	static final String PROJECT_NAME = BASE_NAME + ".xfsm"
	
	private static SWTWorkbenchBot	bot;
 
	@BeforeClass
	def static void beforeClass() throws Exception {
		helper.init
		bot = new SWTWorkbenchBot()
		// Set the SWTBot timeout
		SWTBotPreferences.TIMEOUT = WorkspaceTestHelper.SWTBotPreferencesTIMEOUT_4_GEMOC;
		bot.resetWorkbench
		IResourcesSetupUtil::cleanWorkspace
		helper.deployProject(SOURCE_PROJECT_NAME+".model",BASE_FOLDER_NAME+"/"+SOURCE_PROJECT_NAME+".model.zip")
		helper.deployProject(SOURCE_PROJECT_NAME+".k3dsa",BASE_FOLDER_NAME+"/"+SOURCE_PROJECT_NAME+".k3dsa.zip")
		
		IResourcesSetupUtil::fullBuild
		IResourcesSetupUtil::reallyWaitForAutoBuild
		WorkspaceTestHelper::reallyWaitForJobs(2)
	}
	
	@Before
	override setUp() {
		bot.resetWorkbench
		// helps to reset the workspace state by closing menu as bot.resetWorkbench is not enough
		val Keyboard key = KeyboardFactory.getSWTKeyboard();
		key.pressShortcut(Keystrokes.ESC);		
		// make sure we are on the correct perspective
		bot.perspectiveById(XDSMLFrameworkUI.ID_PERSPECTIVE).activate()
		val projExplorerBot = bot.viewByTitle("Project Explorer").bot
		
		IResourcesSetupUtil::reallyWaitForAutoBuild
		WorkspaceTestHelper::reallyWaitForJobs(4)
	}
	
	@After
	override tearDown() {
		// Nothing to do
	}
	
	@Test
	def void test01_OpenXDSMLPerspective() throws Exception {
		bot.perspectiveById(XDSMLFrameworkUI.ID_PERSPECTIVE).activate()
		helper.assertContains("Menu does not contain", "GEMOC Sequential xDSML Project",
				bot.menu("File").menu("New").menuItems())

	}
	
	@Test
	def void test02_CreateSequentialLanguageProject() {
		
		IResourcesSetupUtil::reallyWaitForAutoBuild
		bot.menu("File").menu("New").menu("GEMOC Sequential xDSML Project").click();
		bot.text().setText(PROJECT_NAME);
		bot.button("Next >").click();
		bot.button("Next >").click();
		bot.textWithLabel("&Package name(*)").setText(BASE_NAME);
				
		val activeShell = bot.activeShell // the focus is lost after click on "Browse..."
		bot.button("Browse...",0).click();
		//bot.shell("File Selection").activate();
		bot.tree().getTreeItem(SOURCE_PROJECT_NAME + ".model").expand();
		bot.tree().getTreeItem(SOURCE_PROJECT_NAME + ".model").getNode("model").expand();
		bot.tree().getTreeItem(SOURCE_PROJECT_NAME + ".model").getNode("model").getNode("fsm.ecore").click();
		bot.button("OK").click();
		activeShell.bot.button("Browse...",1).click();
		bot.button("OK").click();
		
		/* or 
		bot.textWithLabel("&Ecore file location").setText(SOURCE_PROJECT_NAME + ".model/model/fsm.ecore");
		bot.textWithLabel("K3 DSA Project name").setText(SOURCE_PROJECT_NAME + ".k3dsa");
		*/
		
		activeShell.bot.button("Finish").click()
		//bot.button("Finish").click();

		helper.assertProjectExists(PROJECT_NAME);

		IResourcesSetupUtil.reallyWaitForAutoBuild();
		helper.assertNoMarkers();
		
	}
	
	/**
	 * call melange to generate all
	 * 
	 * @result Runtime language project and other files will be created without any
	 *         errors, workspace must not report any error after a full build
	 * @throws Exception
	 */
	@Test
	def void test03_GenerateAllMelangeArtifacts() throws Exception {
		
		val projExplorerBot = bot.viewByTitle("Project Explorer").bot
		//bot.viewByTitle("Project Explorer").
		projExplorerBot.tree().getTreeItem(PROJECT_NAME).expand();
		projExplorerBot.tree().getTreeItem(PROJECT_NAME).getNode("src").expand();
		projExplorerBot.tree().getTreeItem(PROJECT_NAME).getNode("src").getNode(BASE_NAME).expand();
		val SWTBotTreeItem melangeFileItem = bot.tree().getTreeItem(PROJECT_NAME).getNode("src").getNode(BASE_NAME)
				.getNode("Xfsm.melange").select();
		melangeFileItem.contextMenu("Melange").menu("Generate All").click();

		// Melange "Generate all is a bit special as it trigger several jobs one after the other
		// retry in order to make sure they all have been done 
		WorkspaceTestHelper::reallyWaitForJobs(50)
		IResourcesSetupUtil::reallyWaitForAutoBuild
		
		// if the package name is correct all the files are created in the current project
		// Language runtime classes
		helper.waitFileExistOrAssert(PROJECT_NAME + "/src-model-gen/org/eclipse/gemoc/sample/legacyfsm/xfsm/fsm/FsmPackage.java", 10, 300)
		// ModelType classes
		helper.assertFileExists("org.eclipse.gemoc.sample.legacyfsm.xfsm/src-gen/org/eclipse/gemoc/sample/legacyfsm/Xfsm.java")
		helper.assertFolderExists(PROJECT_NAME + "/src-gen")
		helper.assertFileExists(PROJECT_NAME + "/src-gen/org/eclipse/gemoc/sample/legacyfsm/XfsmMT.java");
		// k3 aspects
		helper.assertFileExists(
				PROJECT_NAME + "/src-gen/org/eclipse/gemoc/sample/legacyfsm/xfsm/aspects/StateMachineAspect.java");
		// ecore files
		helper.assertFileExists(PROJECT_NAME + "/model-gen/Xfsm.dsl");
		helper.assertFileExists(PROJECT_NAME + "/model-gen/Xfsm.ecore");
		helper.assertFileExists(PROJECT_NAME + "/model-gen/Xfsm.genmodel");
		helper.assertFileExists(PROJECT_NAME + "/model-gen/XfsmMT.ecore");
		
		helper.assertNoMarkers();
	}
	
	@Test
	def void test04_CreateTraceAddon() throws Exception {
		val projExplorerBot = bot.viewByTitle("Project Explorer").bot
		val SWTBotTreeItem projectItem = projExplorerBot.tree().getTreeItem(PROJECT_NAME).select();
		projectItem.contextMenu("GEMOC Language").menu("Generate Multidimensional Trace Addon project for language")
				.click();
		bot.button("OK").click();
		bot.button("OK").click();

		IResourcesSetupUtil::reallyWaitForAutoBuild
		WorkspaceTestHelper::waitForJobs

		helper.assertProjectExists(PROJECT_NAME + ".trace");

		helper.assertNoMarkers();
	}

	/**
	 * This test use the GEMOC menu to create a Sirius editor for a language
	 * @throws Exception
	 */
	@Ignore  // temporarily disabled, waiting for a fix of test CreateSiriusEditor_Test.test01_CreateEditorProject_usingGemocMenuOnProject() in the backlog
	@Test
	def void test05_CreateSiriusEditorForLanguage() throws Exception {
				
		val SWTBotTreeItem projectItem = bot.tree().getTreeItem("org.eclipse.gemoc.sample.legacyfsm.xfsm").select();
		projectItem.contextMenu("GEMOC Language").menu("Create Sirius Editor Project for language").click();
		bot.button("OK").click();
		
		helper.assertProjectExists(PROJECT_NAME + ".design");
		
		bot.editorByTitle("xfsm.odesign").show();
		bot.tree().getTreeItem("platform:/resource/"+PROJECT_NAME+".design/description/xfsm.odesign").expand();
		// TODO recreate a basic representation in the default layer
		

		helper.assertNoMarkers();
	}
	
}
	