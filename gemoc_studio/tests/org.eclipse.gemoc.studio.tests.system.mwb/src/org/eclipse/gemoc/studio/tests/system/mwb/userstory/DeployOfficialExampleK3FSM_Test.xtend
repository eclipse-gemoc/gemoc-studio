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
import org.eclipse.gemoc.xdsmlframework.test.lib.TailWorkspaceLogToStderrRule
import org.eclipse.gemoc.xdsmlframework.test.lib.WorkspaceTestHelper
import org.eclipse.swt.SWT
import org.eclipse.swt.widgets.ToolItem
import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot
import org.eclipse.swtbot.swt.finder.exceptions.WidgetNotFoundException
import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner
import org.eclipse.swtbot.swt.finder.keyboard.Keyboard
import org.eclipse.swtbot.swt.finder.keyboard.KeyboardFactory
import org.eclipse.swtbot.swt.finder.keyboard.Keystrokes
import org.eclipse.swtbot.swt.finder.utils.SWTBotPreferences
import org.eclipse.swtbot.swt.finder.widgets.SWTBotToolbarPushButton
import org.eclipse.xtext.junit4.AbstractXtextTests
import org.eclipse.xtext.ui.testing.util.IResourcesSetupUtil
import org.junit.After
import org.junit.Before
import org.junit.BeforeClass
import org.junit.FixMethodOrder
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.MethodSorters

import static org.eclipse.swtbot.swt.finder.matchers.WidgetMatcherFactory.allOf
import static org.eclipse.swtbot.swt.finder.matchers.WidgetMatcherFactory.anyOf
import static org.eclipse.swtbot.swt.finder.matchers.WidgetMatcherFactory.widgetOfType
import static org.eclipse.swtbot.swt.finder.matchers.WidgetMatcherFactory.withStyle
import static org.eclipse.swtbot.swt.finder.matchers.WidgetMatcherFactory.withTooltip
import static org.eclipse.swtbot.swt.finder.utils.SWTBotPreferences.*
import org.eclipse.debug.core.DebugPlugin
import org.eclipse.debug.internal.core.LaunchManager
import org.eclipse.gemoc.xdsmlframework.test.lib.SWTBotHelper
import org.junit.rules.TestName
import org.eclipse.gemoc.xdsmlframework.test.lib.GEMOCTestVideoHelper
import org.junit.rules.TestWatcher
import org.junit.runner.Description

/**
 * Verifies that we can use the wizard to install the official sample models 
 * and proceed to some run/debug on them using the predefined launch configuration
 * The resulting projects should not have any errors (no user action required except a Project>Clean...)
 */
@RunWith(SWTBotJunit4ClassRunner)
@FixMethodOrder(MethodSorters::NAME_ASCENDING)
class DeployOfficialExampleK3FSM_Test extends AbstractXtextTests
{
	
	static WorkspaceTestHelper helper = new WorkspaceTestHelper

	static final String BASE_NAME = "org.eclipse.gemoc.example.k3fsm"
	
	static SWTWorkbenchBot	bot;
 
	@Rule public TestName testName = new TestName();
 
	@BeforeClass
	def static void beforeClass() throws Exception {
		GEMOCTestVideoHelper.addTestSuiteVideoLog("starting "+DeployOfficialExampleK3FSM_Test.canonicalName);
		helper.waitWorkbench // useful especially for the first test suite that starts the workbench
		helper.init
		bot = new SWTWorkbenchBot()
		SWTBotPreferences.TIMEOUT = WorkspaceTestHelper.SWTBotPreferencesTIMEOUT_4_GEMOC ;
		bot.resetWorkbench
		IResourcesSetupUtil::cleanWorkspace
		IResourcesSetupUtil::reallyWaitForAutoBuild
		WorkspaceTestHelper::reallyWaitForJobs(2)
	}
	
	@Rule
    public TailWorkspaceLogToStderrRule workspaceLogRule = new TailWorkspaceLogToStderrRule();
    
	@Before
	override setUp() {
		GEMOCTestVideoHelper.addTestSuiteVideoLog("   - "+testName.methodName);
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
	
	/** print SWTBot context on failure */
	@Rule(order=Integer.MIN_VALUE)
	public TestWatcher watchman = new TestWatcher() {
		override void failed(Throwable e, Description description) {
			println("FAILED test: " + description )
			SWTBotHelper.printSWTBotStatus(bot)
		}

		override void succeeded(Description description) {
			println(description + " success!")
			//SWTBotHelper.printSWTBotStatus(bot)
		}
	};
	
	/**
	 * verifies that the example models installation proceeds correctly
	 */
	@Test
	def void test01_InstallK3FsmModels() throws Exception {
		//val activeShell = bot.activeShell // the focus is lost after click on "Browse..."
		bot.menu("File").menu("New").menu("Example...").click();
		val newExampleBot = bot.shell("New Example").bot
		newExampleBot.tree().getTreeItem("GEMOC modeling workbench examples").select();
		newExampleBot.tree().getTreeItem("GEMOC modeling workbench examples").expand();
		newExampleBot.tree().getTreeItem("GEMOC modeling workbench examples").getNode("GEMOC models for K3FSM Language (Sequential)").select();
	  	newExampleBot.button("Finish").click();
	  
		IResourcesSetupUtil::reallyWaitForAutoBuild
		WorkspaceTestHelper::reallyWaitForJobs(2)
		IResourcesSetupUtil::fullBuild
		IResourcesSetupUtil::reallyWaitForAutoBuild
		WorkspaceTestHelper::reallyWaitForJobs(2)

		helper.assertProjectExists(BASE_NAME+".model_examples");

		helper.assertNoMarkers();		
	}
	
	/**
	 * verifies that we can use the predefined launch configuration and launch a debug session
	 */
	@Test
	def void test02_DebugPredefinedK3Fsm_TwoStatesUpCast_Model_some_steps_and_stop() throws Exception {
		//val activeShell = bot.activeShell // the focus is lost after click on "Browse..."
		// open the Debug configuration and start the predefined launch conf
		bot.tree().getTreeItem("org.eclipse.gemoc.example.k3fsm.model_examples").select();
		bot.tree().getTreeItem("org.eclipse.gemoc.example.k3fsm.model_examples").expand();
		val item = bot.tree().getTreeItem("org.eclipse.gemoc.example.k3fsm.model_examples").getNode("TwoStatesUpcast.k3fsm").select();
		item.contextMenu("Debug As").menu("Debug Configurations...").click();
		bot.tree().getTreeItem("Executable model with GEMOC Java engine").expand();
		bot.tree().getTreeItem("Executable model with GEMOC Java engine").getNode("K3FSM - TwoStatesUpcast(abababa)").select();
		bot.button("Debug").click();
				
		// accept switch to debug perspective (this also makes sure that the engines has started)		
		//bot.perspectiveByLabel("Debug").activate
		try {
			bot.shell("Confirm Perspective Switch").bot.button("Switch").click
		} catch (WidgetNotFoundException wnfe){
			System.out.println(wnfe);
			SWTBotHelper.printShellList(bot);
			System.out.println("retry a second time");
			try {
				bot.shell("Confirm Perspective Switch").bot.button("Switch").click
			} catch (WidgetNotFoundException wnfe2){
				System.out.println(wnfe2);
				System.out.println("retry a third time using main shell");
				bot.button("Switch").click
			}
		}
		
		bot.viewByTitle("Debug").show();
		// proceeds for some steps and then run up to the end
		clickOnStepInto()
		waitThreadSuspended
		clickOnStepInto()
		waitThreadSuspended
		clickOnStepInto()
		waitThreadSuspended
		clickOnStepInto()
		waitThreadSuspended
		bot.tree().getTreeItem("K3FSM - TwoStatesUpcast(abababa) [Executable model with GEMOC Java engine]").getNode("Gemoc debug target").select();
		bot.toolbarButtonWithTooltip("Resu&me (F8)").click();
		
		// at some point, xtext may  wish to convert the project containing the models, accept is silently
		// however, it seems to be in another thread and do not block the execution 
		try {
			bot.shell("Configure Xtext").bot.button("Yes").click
		} catch (WidgetNotFoundException wnfe){}
		
		// stop engine and clear using the engine status view
		bot.viewByTitle("Gemoc Engines Status").show();
		bot.toolbarButtonWithTooltip("Stop selected engines").click();
		bot.toolbarButtonWithTooltip("Dispose all stopped engines").click();
		helper.assertNoMarkers();	
		
	}

	/**
	 * for some reason, the step into tooltip may change
	 * so, here is a method that handle both tooltips
	 * similar to bot.toolbarButtonWithTooltip("Step &Into (F5)").click();
	 */
	def void clickOnStepInto(){
		val matcher = allOf(widgetOfType(typeof(ToolItem)), 
			anyOf(withTooltip("Step &Into (F5)"), withTooltip("Step &Into")), 
			withStyle(SWT.PUSH, "SWT.PUSH")
		)
		val btn = new SWTBotToolbarPushButton( bot.widget(matcher, 0) as ToolItem, matcher);
		btn.click
	}
	
	/**
	 * This is very basic, it supposes that there is one and only one debug target in the debug view
	 * or timeout exception
	 */
	def void waitThreadSuspended(){		
		val launchManager = DebugPlugin.getDefault().getLaunchManager() as LaunchManager
		val targets = launchManager.debugTargets
		val target = targets.get(0)
		assertTrue(target.name == "Gemoc debug target")
		assertTrue(target.launch.launchConfiguration.name == "K3FSM - TwoStatesUpcast(abababa)")
		
		// wait that the target suspends or timeout exception
		var timeout = 80
		while(!	target.suspended || timeout < 0) {
			Thread.sleep(100)
			timeout--
		} 
		assertTrue("Timeout: K3FSM - TwoStatesUpcast(abababa) did not suspend",timeout > 0)
	}
	
}
	