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
package org.eclipse.gemoc.studio.tests.system.mwb.userstory

import org.eclipse.gemoc.xdsmlframework.ide.ui.XDSMLFrameworkUI
import org.eclipse.gemoc.xdsmlframework.test.lib.WorkspaceTestHelper
import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot
import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner
import org.eclipse.swtbot.swt.finder.keyboard.Keyboard
import org.eclipse.swtbot.swt.finder.keyboard.KeyboardFactory
import org.eclipse.swtbot.swt.finder.keyboard.Keystrokes
import org.eclipse.xtext.junit4.AbstractXtextTests
import org.eclipse.xtext.ui.testing.util.IResourcesSetupUtil
import org.junit.After
import org.junit.Before
import org.junit.BeforeClass
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.MethodSorters
import org.eclipse.swtbot.swt.finder.utils.SWTBotPreferences
import org.eclipse.gemoc.xdsmlframework.test.lib.TailWorkspaceLogToStderrRule
import org.junit.Rule

/**
 * Verifies that we can use the wizard to install the official sample models
 * The resulting projects should not have any errors (no user action required except a Project>Clean...)
 */
@RunWith(SWTBotJunit4ClassRunner)
@FixMethodOrder(MethodSorters::NAME_ASCENDING)
public class DeployOfficialExampleK3FSM_Test extends AbstractXtextTests
{
	
	static WorkspaceTestHelper helper = new WorkspaceTestHelper

	static final String BASE_NAME = "org.eclipse.gemoc.example.k3fsm"
	
	private static SWTWorkbenchBot	bot;
 
	@BeforeClass
	def static void beforeClass() throws Exception {
		helper.init
		bot = new SWTWorkbenchBot()
		SWTBotPreferences.TIMEOUT = WorkspaceTestHelper.SWTBotPreferencesTIMEOUT_4_GEMOC;
		bot.resetWorkbench
		IResourcesSetupUtil::cleanWorkspace
		IResourcesSetupUtil::reallyWaitForAutoBuild
		WorkspaceTestHelper::reallyWaitForJobs(2)
	}
	
	@Rule
    public TailWorkspaceLogToStderrRule workspaceLogRule = new TailWorkspaceLogToStderrRule();
    
	@Before
	override setUp() {
		helper.setTargetPlatform
		bot.resetWorkbench
		// helps to reset the workspace state by closing menu as bot.resetWorkbench is not enough
		val Keyboard key = KeyboardFactory.getSWTKeyboard();
		key.pressShortcut(Keystrokes.ESC);		
		// make sure we are on the correct perspective
		bot.perspectiveById(XDSMLFrameworkUI.ID_PERSPECTIVE).activate()
		IResourcesSetupUtil::reallyWaitForAutoBuild
	}
	
	@After
	override tearDown() {
		// Nothing to do
	}
	
	@Test
	def void test01_InstallK3FsmModels() throws Exception {
		//val activeShell = bot.activeShell // the focus is lost after click on "Browse..."
		bot.menu("File").menu("New").menu("Example...").click();
		bot.tree().getTreeItem("GEMOC modeling workbench examples").select();
		bot.tree().getTreeItem("GEMOC modeling workbench examples").expand();
		bot.tree().getTreeItem("GEMOC modeling workbench examples").getNode("GEMOC models for K3FSM Language (Sequential)").select();
	  	bot.button("Finish").click();

		IResourcesSetupUtil::reallyWaitForAutoBuild
		WorkspaceTestHelper::reallyWaitForJobs(2)
		IResourcesSetupUtil::fullBuild
		IResourcesSetupUtil::reallyWaitForAutoBuild
		WorkspaceTestHelper::reallyWaitForJobs(2)

		helper.assertProjectExists(BASE_NAME+".model_examples");

		helper.assertNoMarkers();		
	}
	
		@Test
	def void test02_DebugPredefinedK3Fsm_TwoStatesUpCast_Model() throws Exception {
		//val activeShell = bot.activeShell // the focus is lost after click on "Browse..."
		
		bot.tree().getTreeItem("org.eclipse.gemoc.example.k3fsm.model_examples").select();
		bot.tree().getTreeItem("org.eclipse.gemoc.example.k3fsm.model_examples").expand();
		bot.tree().getTreeItem("org.eclipse.gemoc.example.k3fsm.model_examples").getNode("TwoStatesUpcast.aird").select();
		val item = bot.tree().getTreeItem("org.eclipse.gemoc.example.k3fsm.model_examples").getNode("TwoStatesUpcast.k3fsm").select();
		item.contextMenu("Debug As").menu("Debug Configurations...").click();
		bot.tree().getTreeItem("Gemoc Sequential eXecutable Model").expand();
		bot.tree().getTreeItem("Gemoc Sequential eXecutable Model").getNode("K3FSM - TwoStatesUpcast(abababa)").select();
		bot.button("Debug").click();
		bot.viewByTitle("Gemoc Engines Status").show();
		bot.viewByTitle("Console (Model Debugger console)").show();
		bot.editorByTitle("TwoStateUpcast").show();
		bot.viewByTitle("").show();
		bot.button("Yes").click();
		bot.editorByTitle("TwoStateUpcast").show();
		bot.button("Yes").click();
		bot.editorByTitle("TwoStatesUpcast.k3fsm").show();
		bot.toolbarButtonWithTooltip("Step &Into (F5)").click();
		bot.viewByTitle("Debug").show();
		bot.toolbarButtonWithTooltip("Step &Into (F5)").click();
		bot.toolbarButtonWithTooltip("Step &Into (F5)").click();
		bot.toolbarButtonWithTooltip("Step &Into (F5)").click();
		
		// stop engine
		bot.viewByTitle("Debug").show();
		bot.viewByTitle("Gemoc Engines Status").show();
		bot.toolbarButtonWithTooltip("Stop selected engines").click();
		bot.viewByTitle("Debug").show();
		bot.viewByTitle("Gemoc Engines Status").show();
		bot.toolbarButtonWithTooltip("Dispose all stopped engines").click();
		helper.assertNoMarkers();		
	}

	
}
	