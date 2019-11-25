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
 * Verifies that we can use the wizard to install the official sample
 * The resulting projects should not have any errors (no user action required except a Project>Clean...)
 */
@RunWith(SWTBotJunit4ClassRunner)
@FixMethodOrder(MethodSorters::NAME_ASCENDING)
class DeployOfficialExampleK3FSM_Test extends AbstractXtextTests
{
	
	static WorkspaceTestHelper helper = new WorkspaceTestHelper

	static final String BASE_NAME = "org.eclipse.gemoc.example.k3fsm"
	
	static SWTWorkbenchBot	bot;
 
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
	def void test01_InstallK3Fsm() throws Exception {
		//val activeShell = bot.activeShell // the focus is lost after click on "Browse..."
		bot.menu("File").menu("New").menu("Example...").click();
		bot.tree().getTreeItem("GEMOC language workbench examples").select();
		bot.tree().getTreeItem("GEMOC language workbench examples").expand();
		bot.tree().getTreeItem("GEMOC language workbench examples").getNode("GEMOC K3FSM Language (Sequential)").select();
	  	bot.button("Finish").click();

		IResourcesSetupUtil::reallyWaitForAutoBuild
		WorkspaceTestHelper::reallyWaitForJobs(4)
		IResourcesSetupUtil::fullBuild
		IResourcesSetupUtil::reallyWaitForAutoBuild
		WorkspaceTestHelper::reallyWaitForJobs(4)

		helper.assertProjectExists(BASE_NAME);
		helper.assertProjectExists(BASE_NAME+".design");
		helper.assertProjectExists(BASE_NAME+".edit");
		helper.assertProjectExists(BASE_NAME+".editor");
		helper.assertProjectExists(BASE_NAME+".k3dsa");
		helper.assertProjectExists(BASE_NAME+".xdsml");
		helper.assertProjectExists(BASE_NAME+".xtext");
		helper.assertProjectExists(BASE_NAME+".xtext.ide");
		helper.assertProjectExists(BASE_NAME+".xtext.ui");

		helper.assertNoMarkers();		
	}

	
}
	