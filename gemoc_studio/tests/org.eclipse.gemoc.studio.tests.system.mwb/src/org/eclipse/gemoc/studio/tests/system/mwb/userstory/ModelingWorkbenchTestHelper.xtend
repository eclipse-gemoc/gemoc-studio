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

import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot
import org.eclipse.gemoc.xdsmlframework.api.core.IExecutionEngine
import org.eclipse.swtbot.swt.finder.exceptions.WidgetNotFoundException
import org.eclipse.swtbot.swt.finder.utils.SWTBotPreferences
import org.eclipse.debug.core.DebugPlugin
import org.eclipse.debug.internal.core.LaunchManager
import org.junit.Assert
import org.eclipse.gemoc.xdsmlframework.test.lib.SWTBotHelper

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
		val runningEnginesRegistry = org.eclipse.gemoc.executionframework.engine.Activator.getDefault().gemocRunningEngineRegistry;
		
		// The Engine view used by closeAndClearEngine() tends to be flacky in Test suites, close and dispose manually
		for(IExecutionEngine<?> e : runningEnginesRegistry.runningEngines.values) {
			e.stop
			e.dispose
		}
	}
	
	def static void closeConfigureXtextPopup(SWTWorkbenchBot bot){
		// at some point, xtext may  wish to convert the project containing the models, accept is silently
		// however, it seems to be in another thread and do not block the execution 
		val long savedTimeout = SWTBotPreferences.TIMEOUT
		SWTBotPreferences.TIMEOUT = 2000
		try {
			bot.shell("Configure Xtext").bot.button("Yes").click
		} catch (WidgetNotFoundException wnfe){}
		SWTBotPreferences.TIMEOUT = savedTimeout
	}
	def static void waitFirstTargetThreadSuspended(String launchConfigurationName){		
		val launchManager = DebugPlugin.getDefault().getLaunchManager() as LaunchManager
		val targets = launchManager.debugTargets
		val target = targets.get(0)
		Assert.assertTrue(target.name == "Gemoc debug target")
		Assert.assertTrue(target.launch.launchConfiguration.name == launchConfigurationName)
		println("waitFirstTargetThreadSuspended: "+launchConfigurationName)
		
		// wait that the target suspends or timeout exception
		var timeout = 80
		while(!	target.suspended || timeout < 0) {
			Thread.sleep(100)
			timeout--
		} 
		Assert.assertTrue("Timeout: first target didn't suspend  "+target.launch.launchConfiguration.name,timeout > 0)
	}
	def static void waitFirstTargetThreadSuspendedOrTerminated(String launchConfigurationName){		
		val launchManager = DebugPlugin.getDefault().getLaunchManager() as LaunchManager
		val targets = launchManager.debugTargets
		val target = targets.get(0)
		Assert.assertTrue(target.name == "Gemoc debug target")
		Assert.assertTrue(target.launch.launchConfiguration.name == launchConfigurationName)
		println("waitFirstTargetThreadSuspendedOrTerminated: "+launchConfigurationName)
		
		// wait that the target suspends or timeout exception
		var timeout = 80
		while((!	(target.suspended || target.terminated)) || timeout < 0) {
			Thread.sleep(100)
			timeout--
		} 
		Assert.assertTrue("Timeout: first target didn't suspend or terminated "+target.launch.launchConfiguration.name,timeout > 0)
	}
	
	def static void confirmPerspectiveSwitch(SWTWorkbenchBot bot) {
		val long savedTimeout = SWTBotPreferences.TIMEOUT
		SWTBotPreferences.TIMEOUT = 8000
		
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
		SWTBotPreferences.TIMEOUT = savedTimeout
	} 
}
