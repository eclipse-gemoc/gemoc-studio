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
import static extension org.eclipse.gemoc.studio.tests.system.mwb.userstory.ModelingWorkbenchTestHelper.*
import org.eclipse.gemoc.example.k3fsm.FSM
import org.eclipse.gemoc.trace.commons.model.trace.Step
import java.util.Deque
import org.junit.Ignore
import org.eclipse.debug.core.DebugPlugin
import org.eclipse.debug.internal.core.LaunchManager
import org.eclipse.gemoc.xdsmlframework.test.lib.SWTBotHelper
import org.junit.rules.TestName
import org.eclipse.gemoc.xdsmlframework.test.lib.GEMOCTestVideoHelper
import org.junit.AfterClass
import org.eclipse.debug.core.IDebugEventSetListener
import org.eclipse.debug.core.DebugEvent
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTreeItem
import org.junit.rules.TestWatcher
import org.junit.runner.Description
import org.eclipse.gemoc.xdsmlframework.api.core.IExecutionEngine
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.ResourcesPlugin

/**
 * Verifies that we can execute a debug session 
 * if possible verifies correct output in the views
 * The resulting projects should not have any errors (no user action required except a Project>Clean...)
 */
@RunWith(SWTBotJunit4ClassRunner)
@FixMethodOrder(MethodSorters::NAME_ASCENDING)
class DebugOfficialExampleK3FSM_Test extends AbstractXtextTests
{
	
	static WorkspaceTestHelper helper = new WorkspaceTestHelper

	static final String BASE_FOLDER_NAME = "tests-inputs-gen/K3FSM"
	static final String MODEL_PROJECT_NAME = "org.eclipse.gemoc.example.k3fsm.model_examples.TwoStates"
	
	static SWTWorkbenchBot bot;
 
	@Rule public TestName testName = new TestName();
	
	@BeforeClass
	def static void beforeClass() throws Exception {
		GEMOCTestVideoHelper.addTestSuiteVideoLog("starting "+DebugOfficialExampleK3FSM_Test.canonicalName);
		helper.waitWorkbench // useful especially for the first test suite that starts the workbench
		helper.init
		bot = new SWTWorkbenchBot()
		SWTBotPreferences.TIMEOUT = WorkspaceTestHelper.SWTBotPreferencesTIMEOUT_4_GEMOC ;
		bot.resetWorkbench
		IResourcesSetupUtil::cleanWorkspace
		IResourcesSetupUtil::reallyWaitForAutoBuild
		WorkspaceTestHelper::reallyWaitForJobs(2)
		helper.deployProject(MODEL_PROJECT_NAME,BASE_FOLDER_NAME+"/"+MODEL_PROJECT_NAME+".zip")
		IResourcesSetupUtil::reallyWaitForAutoBuild
		WorkspaceTestHelper::reallyWaitForJobs(2)
	}
	
	@AfterClass
	def static void afterClass() {
		//
		println("afterClass clearing: " + DebugOfficialExampleK3FSM_Test.canonicalName )
		val IProject[] visibleProjects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
		visibleProjects.forEach[p | p.close(null)]
		println("afterClass visibleProjects.forEach[p | p.close(null)] " + DebugOfficialExampleK3FSM_Test.canonicalName )
		WorkspaceTestHelper::reallyWaitForJobs(2)
		println("afterClass WorkspaceTestHelper::reallyWaitForJobs(2) " + DebugOfficialExampleK3FSM_Test.canonicalName )
		bot.resetWorkbench
		println("afterClass bot.resetWorkbench: " + DebugOfficialExampleK3FSM_Test.canonicalName )
		IResourcesSetupUtil::cleanWorkspace
		println("afterClass IResourcesSetupUtil::cleanWorkspace: " + DebugOfficialExampleK3FSM_Test.canonicalName )
		IResourcesSetupUtil::reallyWaitForAutoBuild
		WorkspaceTestHelper::reallyWaitForJobs(2)
		println("afterClass done: " + DebugOfficialExampleK3FSM_Test.canonicalName )
	}
	
	@Rule
    public TailWorkspaceLogToStderrRule workspaceLogRule = new TailWorkspaceLogToStderrRule();
    
	@Before
	override setUp() {
		GEMOCTestVideoHelper.addTestSuiteVideoLog("   - START of "+testName.methodName);
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
		GEMOCTestVideoHelper.addTestSuiteVideoLog("   - END of "+testName.methodName);
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
	 * Stop is done using Engine Status view
	 */
	@Test
	def void test01_TwoStates_Model_some_steps_stop_and_clear() throws Exception {
		TwoStatesUpCast_Model_some_steps_stop_and_clear	
	}

	@Test
	def void test02_secondRun_TwoStates_Model_some_steps_stop_and_clear() throws Exception {
		TwoStatesUpCast_Model_some_steps_stop_and_clear
	}
	
	private def void TwoStatesUpCast_Model_some_steps_stop_and_clear() {
		val runningEnginesRegistry = org.eclipse.gemoc.executionframework.engine.Activator.getDefault().gemocRunningEngineRegistry;
		
		startDebugTwoStates_Model
		val engine = runningEnginesRegistry.runningEngines.entrySet.get(0).value		
		assertEquals("GEMOC Kermeta Sequential Engine platform:/resource/"+MODEL_PROJECT_NAME+"/xtext/TwoStates.k3fsm", engine.name)
		assertEquals(0,engine.engineStatus.nbLogicalStepRun)
		val fsm = engine.executionContext.resourceModel.contents.get(0) as FSM
		fsm.currentState.assertNull
		assertEquals("MSE_FSMImpl_initializeModel",stackToString(engine.currentStack))
		// proceeds for some steps
		// verify some basic points in the engine status, in the model resource and in the UI
		
		
		bot.viewByTitle("Debug").show();
		clickOnStepInto(bot) // initializeModel, no increment of steps		
		waitThreadSuspended
		assertEquals(1,engine.engineStatus.nbLogicalStepRun)
		assertEquals("S1",fsm.currentState.name)
		assertEquals("MSE_FSMImpl_main",stackToString(engine.currentStack))
				
		clickOnStepInto(bot) // initializeModel, no increment of steps		
		waitThreadSuspended
		assertEquals("S1",fsm.currentState.name)
		assertEquals(1,engine.engineStatus.nbLogicalStepRun) // this is a small step (no increment)
		assertEquals("MSE_StateImpl_step|MSE_FSMImpl_main",stackToString(engine.currentStack))
		
		clickOnStepInto(bot) 
		waitThreadSuspended
		assertEquals("S1",fsm.currentState.name)
		assertEquals(1,engine.engineStatus.nbLogicalStepRun) // this is a small step (no increment)
		assertEquals("MSE_TransitionImpl_fire|MSE_StateImpl_step|MSE_FSMImpl_main",stackToString(engine.currentStack))
		
		clickOnStepInto(bot)
		waitThreadSuspended
		assertEquals(3,engine.engineStatus.nbLogicalStepRun) // increment only here because the BigStep finishes here 
		assertEquals("S2",fsm.currentState.name)
		assertEquals("MSE_StateImpl_step|MSE_FSMImpl_main",stackToString(engine.currentStack))
		
		clickOnStepInto(bot)
		waitThreadSuspended
		assertEquals("S2",fsm.currentState.name)
		
		clickOnStepInto(bot)
		waitThreadSuspended
		assertEquals(5,engine.engineStatus.nbLogicalStepRun)
		assertEquals("S1",fsm.currentState.name)
		
		println("TwoStatesUpCast_Model_some_steps_stop_and_clear ending")
		Thread.sleep(2000)
		try {
			closeAndClearEngine(bot)	
		} catch (Exception e){
			println("Failed to close engine using UI, Trying programmatically instead")
			e.printStackTrace
			closeAndClearEngineProgrammatically
		}
		
		helper.assertNoMarkers();	
	}

	/**
	 * verifies that the end of the execution looks correct
	 * see bug https://github.com/eclipse/gemoc-studio-modeldebugging/issues/66
	 */
	@Ignore // this test actually implies to fix https://github.com/eclipse/gemoc-studio-modeldebugging/issues/66
	@Test
	def void test03_TwoStates_Model_run_to_end() throws Exception {
		startDebugTwoStates_Model
		
		val matcher = allOf(widgetOfType(typeof(ToolItem)), 
			anyOf(withTooltip("Resu&me (F8)"), withTooltip("Resu&me")), 
			withStyle(SWT.PUSH, "SWT.PUSH")
		)
		val btn = new SWTBotToolbarPushButton( bot.widget(matcher, 0) as ToolItem, matcher);
		btn.click
		// we currently don't have a way to know if we've reached the end
		// so just sleep a little bit
		Thread.sleep(2000)
		
		val runningEnginesRegistry = org.eclipse.gemoc.executionframework.engine.Activator.getDefault().gemocRunningEngineRegistry;		
		val engine = runningEnginesRegistry.runningEngines.entrySet.get(0).value		
		assertEquals("GEMOC Kermeta Sequential Engine platform:/resource/org.eclipse.gemoc.example.k3fsm.model_examples/TwoStatesUpcast.k3fsm", engine.name)
		assertEquals(15,engine.engineStatus.nbLogicalStepRun)
		val fsm = engine.executionContext.resourceModel.contents.get(0) as FSM
		
		assertEquals("abababa",fsm.consummedString)
		assertEquals("ABABABA",fsm.producedString)
		assertEquals("",fsm.unprocessedString)
		
		ModelingWorkbenchTestHelper.closeAndClearEngine(bot)
		ModelingWorkbenchTestHelper.closeAndClearEngineProgrammatically
		assertTrue("runningEngineRegistry not empty " +runningEnginesRegistry.runningEngines,  runningEnginesRegistry.runningEngines.size == 0)
	}
	
	// some reusabe test part
	def void startDebugTwoStates_Model() {
		val runningEnginesRegistry = org.eclipse.gemoc.executionframework.engine.Activator.getDefault().gemocRunningEngineRegistry;
		assertTrue("runningEngineRegistry not empty " +runningEnginesRegistry.runningEngines,  runningEnginesRegistry.runningEngines.size == 0)
		
		bot.tree().getTreeItem(MODEL_PROJECT_NAME).select();
		bot.tree().getTreeItem(MODEL_PROJECT_NAME).expand();
		bot.tree().getTreeItem(MODEL_PROJECT_NAME).waitNode("xtext").select();
		bot.tree().getTreeItem(MODEL_PROJECT_NAME).getNode("xtext").expand();
		val item = bot.tree().getTreeItem(MODEL_PROJECT_NAME).getNode("xtext").waitNode("TwoStates.k3fsm").select();
		item.contextMenu("Debug As").menu("Debug Configurations...").click();
		bot.tree().getTreeItem("Executable model with GEMOC Java engine").expand();
		bot.tree().getTreeItem("Executable model with GEMOC Java engine").waitNode("K3FSM- TwoStates(abababa)").select();
		bot.button("Debug").click();
		
		// accept switch to debug perspective (this also makes sure that the engines has started)
		confirmPerspectiveSwitch(bot)
		
		// select stack in Debug view (this opens the xtext editor and enables the F5 buttons)
		bot.viewByTitle("Debug").show();
		bot.tree().getTreeItem("K3FSM- TwoStates(abababa) [Executable model with GEMOC Java engine]").select();
		bot.tree().getTreeItem("K3FSM- TwoStates(abababa) [Executable model with GEMOC Java engine]").waitNode("Gemoc debug target").waitNode("Model debugging").select();
		bot.tree().getTreeItem("K3FSM- TwoStates(abababa) [Executable model with GEMOC Java engine]").getNode("Gemoc debug target").getNode("Model debugging").expand();
		bot.tree().getTreeItem("K3FSM- TwoStates(abababa) [Executable model with GEMOC Java engine]").getNode("Gemoc debug target").getNode("Model debugging").waitNode("Engine : TwoStates.k3fsm => TwoStates").select();
		bot.tree().getTreeItem("K3FSM- TwoStates(abababa) [Executable model with GEMOC Java engine]").getNode("Gemoc debug target").getNode("Model debugging").waitNode("[FSM] TwoStates#initializeModel([])").select();
		
		
		closeConfigureXtextPopup(bot)
		assertTrue("engine not found in runningEngineRegistry" +runningEnginesRegistry.runningEngines,  runningEnginesRegistry.runningEngines.size == 1)
		
	}
	
	
	/**
	 * wait for the node then returns its
	 */
	def SWTBotTreeItem waitNode(SWTBotTreeItem baseTreeItem, String nodeName) {
		bot.waitUntil(
			org.eclipse.swtbot.swt.finder.waits.Conditions.treeItemHasNode(
				baseTreeItem,
				nodeName)
		)
		return baseTreeItem.getNode(nodeName)
	}
	

	
	/**
	 * supposes that there is one and only one debug target in the debug view
	 * or timeout exception
	 */
	def void waitThreadSuspended(){		
		ModelingWorkbenchTestHelper.waitFirstTargetThreadSuspended("K3FSM- TwoStates(abababa)")
	}
	
	/** simple helper method to get a string representation of the stack*/
	def String stackToString(Deque<Step<?>> stack){
		return stack.map[s | s.mseoccurrence.mse.name].join("|")
	}
	
}
	