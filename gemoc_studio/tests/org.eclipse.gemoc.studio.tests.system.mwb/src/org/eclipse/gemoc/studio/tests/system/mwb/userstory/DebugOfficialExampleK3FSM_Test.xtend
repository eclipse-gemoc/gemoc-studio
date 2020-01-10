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
	static final String BASE_NAME = "org.eclipse.gemoc.example.k3fsm"
	static final String MODEL_PROJECT_NAME = BASE_NAME+".model_examples"
	
	static SWTWorkbenchBot bot;
 
	@Rule public TestName testName = new TestName();
	
	@BeforeClass
	def static void beforeClass() throws Exception {
		GEMOCTestVideoHelper.addTestSuiteVideoLog("starting "+DebugOfficialExampleK3FSM_Test.canonicalName);
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
	
	/**
	 * Stop is done using Engine Status view
	 */
	@Test
	def void test01_TwoStatesUpCast_Model_some_steps_stop_and_clear() throws Exception {
		TwoStatesUpCast_Model_some_steps_stop_and_clear	
	}

	@Test
	def void test02_secondRun_TwoStatesUpCast_Model_some_steps_stop_and_clear() throws Exception {
		TwoStatesUpCast_Model_some_steps_stop_and_clear
	}
	
	private def void TwoStatesUpCast_Model_some_steps_stop_and_clear() {
		val runningEnginesRegistry = org.eclipse.gemoc.executionframework.engine.Activator.getDefault().gemocRunningEngineRegistry;
		
		startDebugwoStatesUpCast_Model
		
		val engine = runningEnginesRegistry.runningEngines.entrySet.get(0).value		
		assertEquals("GEMOC Kermeta Sequential Engine platform:/resource/org.eclipse.gemoc.example.k3fsm.model_examples/TwoStatesUpcast.k3fsm", engine.name)
		assertEquals(0,engine.engineStatus.nbLogicalStepRun)
		val fsm = engine.executionContext.resourceModel.contents.get(0) as FSM
		fsm.currentState.assertNull
		assertEquals("MSE_FSMImpl_initializeModel",stackToString(engine.currentStack))
		// proceeds for some steps
		// verify some basic points in the engine status, in the model resource and in the UI
		
		bot.viewByTitle("Debug").show();
		clickOnStepInto() // initializeModel, no increment of steps		
		waitThreadSuspended
		assertEquals(1,engine.engineStatus.nbLogicalStepRun)
		assertEquals("S1",fsm.currentState.name)
		assertEquals("MSE_FSMImpl_main",stackToString(engine.currentStack))
		
		clickOnStepInto() // initializeModel, no increment of steps		
		waitThreadSuspended
		assertEquals("S1",fsm.currentState.name)
		assertEquals(1,engine.engineStatus.nbLogicalStepRun) // this is a small step (no increment)
		assertEquals("MSE_StateImpl_step|MSE_FSMImpl_main",stackToString(engine.currentStack))
		
		clickOnStepInto() 
		waitThreadSuspended
		assertEquals("S1",fsm.currentState.name)
		assertEquals(1,engine.engineStatus.nbLogicalStepRun) // this is a small step (no increment)
		assertEquals("MSE_TransitionImpl_fire|MSE_StateImpl_step|MSE_FSMImpl_main",stackToString(engine.currentStack))
		
		clickOnStepInto()
		waitThreadSuspended
		assertEquals(3,engine.engineStatus.nbLogicalStepRun) // increment only here because the BigStep finishes here 
		assertEquals("S2",fsm.currentState.name)
		assertEquals("MSE_StateImpl_step|MSE_FSMImpl_main",stackToString(engine.currentStack))
		
		clickOnStepInto()
		waitThreadSuspended
		assertEquals("S2",fsm.currentState.name)
		
		clickOnStepInto()
		waitThreadSuspended
		assertEquals(5,engine.engineStatus.nbLogicalStepRun)
		assertEquals("S1",fsm.currentState.name)
		
		closeAndClearEngine
		
		helper.assertNoMarkers();	
	}

	/**
	 * verifies that the end of the execution looks correct
	 * see bug https://github.com/eclipse/gemoc-studio-modeldebugging/issues/66
	 */
	@Ignore // this test actually implies to fix https://github.com/eclipse/gemoc-studio-modeldebugging/issues/66
	@Test
	def void test03_TwoStatesUpCast_Model_run_to_end() throws Exception {
		startDebugwoStatesUpCast_Model
		
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
		
		closeAndClearEngine
	}
	
	// some reusabe test part
	def void startDebugwoStatesUpCast_Model() {
		val runningEnginesRegistry = org.eclipse.gemoc.executionframework.engine.Activator.getDefault().gemocRunningEngineRegistry;
		assertTrue("runningEngineRegistry not empty " +runningEnginesRegistry.runningEngines,  runningEnginesRegistry.runningEngines.size == 0)
		
		bot.tree().getTreeItem("org.eclipse.gemoc.example.k3fsm.model_examples").select();
		bot.tree().getTreeItem("org.eclipse.gemoc.example.k3fsm.model_examples").expand();
		val item = bot.tree().getTreeItem("org.eclipse.gemoc.example.k3fsm.model_examples").waitNode("TwoStatesUpcast.k3fsm").select();
		item.contextMenu("Debug As").menu("Debug Configurations...").click();
		bot.tree().getTreeItem("Executable model with GEMOC Java engine").expand();
		bot.tree().getTreeItem("Executable model with GEMOC Java engine").waitNode("K3FSM - TwoStatesUpcast(abababa)").select();
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
		
		// select stack in Debug view (this opens the xtext editor and enables the F5 buttons)
		bot.viewByTitle("Debug").show();
		bot.tree().getTreeItem("K3FSM - TwoStatesUpcast(abababa) [Executable model with GEMOC Java engine]").select();
		bot.tree().getTreeItem("K3FSM - TwoStatesUpcast(abababa) [Executable model with GEMOC Java engine]").waitNode("Gemoc debug target").waitNode("Model debugging").select();
		bot.tree().getTreeItem("K3FSM - TwoStatesUpcast(abababa) [Executable model with GEMOC Java engine]").getNode("Gemoc debug target").getNode("Model debugging").expand();
		bot.tree().getTreeItem("K3FSM - TwoStatesUpcast(abababa) [Executable model with GEMOC Java engine]").getNode("Gemoc debug target").getNode("Model debugging").waitNode("Engine : TwoStatesUpcast.k3fsm => TwoStateUpcast").select();
		bot.tree().getTreeItem("K3FSM - TwoStatesUpcast(abababa) [Executable model with GEMOC Java engine]").getNode("Gemoc debug target").getNode("Model debugging").waitNode("[FSM] TwoStateUpcast#initializeModel()").select();
		
		
		closeXtextProjectConversionPopup
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
	
	def static void closeAndClearEngine() {
		val runningEnginesRegistry = org.eclipse.gemoc.executionframework.engine.Activator.getDefault().gemocRunningEngineRegistry;
		
		// stop engine and clear using the engine status view
		bot.viewByTitle("Gemoc Engines Status").show();
		bot.toolbarButtonWithTooltip("Stop selected engines").click();
		bot.toolbarButtonWithTooltip("Dispose all stopped engines").click();
		
		assertTrue("runningEngineRegistry not empty " +runningEnginesRegistry.runningEngines,  runningEnginesRegistry.runningEngines.size == 0)
	}

	/**
	 * for some reason, the step into tooltip may change
	 * so, here is a method that handle both tooltips
	 * similar to bot.toolbarButtonWithTooltip("Step &Into (F5)").click();
	 */
	def void clickOnStepInto(){
		
		val runningEnginesRegistry = org.eclipse.gemoc.executionframework.engine.Activator.getDefault().gemocRunningEngineRegistry;		
		val engine = runningEnginesRegistry.runningEngines.entrySet.get(0).value
		val prevNbLogicalStepCalled = engine.engineStatus.nbLogicalStepCalled		
		
		val matcher = allOf(widgetOfType(typeof(ToolItem)), 
			anyOf(withTooltip("Step &Into (F5)"), withTooltip("Step &Into")), 
			withStyle(SWT.PUSH, "SWT.PUSH")
		)
		val btn = new SWTBotToolbarPushButton( bot.widget(matcher, 0) as ToolItem, matcher);
		btn.click
		
		// wait for the action being taken into account by the engine
		var timeout = 80
		while(engine.engineStatus.nbLogicalStepCalled == prevNbLogicalStepCalled || timeout < 0) {
			Thread.sleep(100)
			timeout--
		} 
		assertTrue("Timeout: Step Into debug command did not trigger a new step in engine "+ engine.name, timeout > 0)
	}
	
	/**
	 * supposes that there is one and only one debug target in the debug view
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
	
	var xtextProjectConversionPopupclosed = false
	
	def void closeXtextProjectConversionPopup(){
		// at some point, xtext may  wish to convert the project containing the models, accept is silently
		// however, it seems to be in another thread and do not block the execution
		// close it only once per testsuite (this saves the timeout)
		if(!xtextProjectConversionPopupclosed) {
			try {
				bot.shell("Configure Xtext").bot.button("Yes").click
			} catch (WidgetNotFoundException wnfe){}
			xtextProjectConversionPopupclosed= true
		}
	}
	
	/** simple helper method to get a string representation of the stack*/
	def String stackToString(Deque<Step<?>> stack){
		return stack.map[s | s.mseoccurrence.mse.name].join("|")
	}
	
}
	