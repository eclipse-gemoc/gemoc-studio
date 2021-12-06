/*******************************************************************************
 * Copyright (c) 2017 Inria.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Inria - initial API and implementation
 *******************************************************************************/
package org.eclipse.gemoc.studio.tests.system.mwb.userstory

import org.eclipse.debug.core.DebugPlugin
import org.eclipse.debug.internal.core.LaunchManager
import org.eclipse.gemoc.executionframework.engine.Activator
import org.eclipse.gemoc.xdsmlframework.api.core.IExecutionEngine
import org.eclipse.gemoc.xdsmlframework.test.lib.SWTBotHelper
import org.eclipse.swt.SWT
import org.eclipse.swt.widgets.ToolItem
import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot
import org.eclipse.swtbot.swt.finder.exceptions.WidgetNotFoundException
import org.eclipse.swtbot.swt.finder.utils.SWTBotPreferences
import org.eclipse.swtbot.swt.finder.widgets.SWTBotToolbarPushButton
import org.junit.Assert

import static org.eclipse.swtbot.swt.finder.matchers.WidgetMatcherFactory.allOf
import static org.eclipse.swtbot.swt.finder.matchers.WidgetMatcherFactory.anyOf
import static org.eclipse.swtbot.swt.finder.matchers.WidgetMatcherFactory.widgetOfType
import static org.eclipse.swtbot.swt.finder.matchers.WidgetMatcherFactory.withStyle
import static org.eclipse.swtbot.swt.finder.matchers.WidgetMatcherFactory.withTooltip
import static org.eclipse.swtbot.swt.finder.utils.SWTBotPreferences.*
import static org.junit.Assert.*

/**
 * Class containing helper methods for testing a workspace in a GEMOC Language workbench
 */
class ModelingWorkbenchTestHelper {

	static def void closeAndClearEngine(SWTWorkbenchBot bot) {

		// stop engine and clear using the engine status view
		bot.viewByTitle("Gemoc Engines Status").show();
		bot.toolbarButtonWithTooltip("Stop selected engines").click();
		bot.toolbarButtonWithTooltip("Dispose all stopped engines").click();

	}

	def static void closeAndClearEngineProgrammatically() {
		val runningEnginesRegistry = Activator.getDefault().
			gemocRunningEngineRegistry;

		// The Engine view used by closeAndClearEngine() tends to be flacky in Test suites, close and dispose manually
		for (IExecutionEngine<?> e : runningEnginesRegistry.runningEngines.values) {
			e.stop
			e.dispose
		}
	}

	def static void closeConfigureXtextPopup(SWTWorkbenchBot bot) {
		// at some point, xtext may  wish to convert the project containing the models, accept is silently
		// however, it seems to be in another thread and do not block the execution 
		val long savedTimeout = SWTBotPreferences.TIMEOUT
		SWTBotPreferences.TIMEOUT = 2000
		try {
			bot.shell("Configure Xtext").bot.button("Yes").click
		} catch (WidgetNotFoundException wnfe) {
		}
		SWTBotPreferences.TIMEOUT = savedTimeout
	}

	def static void waitFirstTargetThreadSuspended(String launchConfigurationName) {
		val launchManager = DebugPlugin.getDefault().getLaunchManager() as LaunchManager
		val targets = launchManager.debugTargets
		val target = targets.get(0)
		assertTrue(target.name == "Gemoc debug target")
		assertTrue(target.launch.launchConfiguration.name == launchConfigurationName)
		println("waitFirstTargetThreadSuspended: " + launchConfigurationName)

		// wait that the target suspends or timeout exception
		var timeout = 80
		while (!	target.suspended || timeout < 0) {
			Thread.sleep(100)
			timeout--
		}
		Assert.assertTrue("Timeout: first target didn't suspend  " + target.launch.launchConfiguration.name, timeout >
			0)
	}

	def static void waitFirstTargetThreadSuspendedOrTerminated(String launchConfigurationName) {
		val launchManager = DebugPlugin.getDefault().getLaunchManager() as LaunchManager
		val targets = launchManager.debugTargets
		val target = targets.get(0)
		assertTrue(target.name == "Gemoc debug target")
		assertTrue(target.launch.launchConfiguration.name == launchConfigurationName)
		println("waitFirstTargetThreadSuspendedOrTerminated: " + launchConfigurationName)

		// wait that the target suspends or timeout exception
		var timeout = 80
		while ((!	(target.suspended || target.terminated)) || timeout < 0) {
			Thread.sleep(100)
			timeout--
		}
		Assert.assertTrue(
			"Timeout: first target didn't suspend or terminated " + target.launch.launchConfiguration.name, timeout > 0)
	}

	def static void confirmPerspectiveSwitch(SWTWorkbenchBot bot) {
		val long savedTimeout = SWTBotPreferences.TIMEOUT
		SWTBotPreferences.TIMEOUT = 8000

		try {
			bot.shell("Confirm Perspective Switch").bot.button("Switch").click
		} catch (WidgetNotFoundException wnfe) {
			System.out.println(wnfe);
			SWTBotHelper.printShellList(bot);
			System.out.println("retry a second time");
			try {
				bot.shell("Confirm Perspective Switch").bot.button("Switch").click
			} catch (WidgetNotFoundException wnfe2) {
				System.out.println(wnfe2);
				System.out.println("retry a third time using main shell");
				bot.button("Switch").click
			}
		}
		SWTBotPreferences.TIMEOUT = savedTimeout
	}

	/**
	 * for some reason, the step into tooltip may change
	 * so, here is a method that handle both tooltips
	 * similar to bot.toolbarButtonWithTooltip("Step &Into (F5)").click();
	 */
	def static void clickOnStepInto(SWTWorkbenchBot bot) {

		val runningEnginesRegistry = Activator.getDefault().
			gemocRunningEngineRegistry;
		val engine = runningEnginesRegistry.runningEngines.entrySet.get(0).value
		val prevNbLogicalStepCalled = engine.engineStatus.nbLogicalStepCalled

		val matcher = allOf(
			widgetOfType(typeof(ToolItem)),
			anyOf(withTooltip("Step &Into (F5)"), withTooltip("Step &Into")),
			withStyle(SWT.PUSH, "SWT.PUSH")
		)
		val btn = new SWTBotToolbarPushButton(bot.widget(matcher, 0) as ToolItem, matcher);
		btn.click

		// wait for the action being taken into account by the engine
		var timeout = 80
		while (engine.engineStatus.nbLogicalStepCalled == prevNbLogicalStepCalled || timeout < 0) {
			Thread.sleep(100)
			timeout--
		}
		assertTrue("Timeout: Step Into debug command did not trigger a new step in engine " + engine.name, timeout > 0)
	}
}
