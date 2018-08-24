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
package org.eclipse.gemoc.studio.tests.system.lwb.feature

import org.eclipse.gemoc.xdsmlframework.ide.ui.XDSMLFrameworkUI
import org.eclipse.gemoc.xdsmlframework.test.lib.MelangeUiInjectorProvider
import org.eclipse.gemoc.xdsmlframework.test.lib.WorkspaceTestHelper
import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot
import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner
import org.eclipse.swtbot.swt.finder.keyboard.Keyboard
import org.eclipse.swtbot.swt.finder.keyboard.KeyboardFactory
import org.eclipse.swtbot.swt.finder.keyboard.Keystrokes
import org.eclipse.xtext.junit4.AbstractXtextTests
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.ui.testing.util.IResourcesSetupUtil
import org.junit.After
import org.junit.Before
import org.junit.BeforeClass
import org.junit.Test
import org.junit.runner.RunWith
import org.eclipse.swtbot.swt.finder.utils.SWTBotPreferences
import org.eclipse.swtbot.swt.finder.exceptions.WidgetNotFoundException
import org.junit.Rule
import org.eclipse.gemoc.xdsmlframework.test.lib.TailWorkspaceLogToStderrRule

/**
 * This class check the content of the XDSML Perspective
 */
@RunWith(SWTBotJunit4ClassRunner)
@InjectWith(MelangeUiInjectorProvider)
//@FixMethodOrder(MethodSorters::NAME_ASCENDING)
public class XDSMLPerspective_Test extends AbstractXtextTests {

	static WorkspaceTestHelper helper = new WorkspaceTestHelper

	private static SWTWorkbenchBot bot;

	@BeforeClass
	def static void beforeClass() throws Exception {
		bot = new SWTWorkbenchBot()
		SWTBotPreferences.TIMEOUT = WorkspaceTestHelper.SWTBotPreferencesTIMEOUT_4_GEMOC;
		SWTBotPreferences.PLAYBACK_DELAY = WorkspaceTestHelper.SWTBotPreferencesPLAYBACK_DELAY_4_GEMOC;
		IResourcesSetupUtil::cleanWorkspace
		helper.init

	}

	@Before
	override setUp() {
		bot.resetWorkbench
		// helps to reset the workspace state by closing menu as bot.resetWorkbench is not enough
		val Keyboard key = KeyboardFactory.getSWTKeyboard();
		key.pressShortcut(Keystrokes.ESC);
		// make sure we are on the correct perspective
		bot.perspectiveById(XDSMLFrameworkUI.ID_PERSPECTIVE).activate()
	// val projExplorerBot = bot.viewByTitle("Project Explorer").bot
	}

	@Rule
    public TailWorkspaceLogToStderrRule workspaceLogRule = new TailWorkspaceLogToStderrRule();
    
	@After
	override tearDown() {
		bot.sleep(500);
		// Nothing to do
	}

	@Test
	def void test01_FileMenuContent() throws Exception {
		helper.assertContains("Menu does not contain", "GEMOC Sequential xDSML Project",
			bot.menu("File").menu("New").menuItems())
		helper.assertContains("Menu does not contain", "K3 Project", bot.menu("File").menu("New").menuItems())
		helper.assertContains("Menu does not contain", "Ecore Modeling Project",
			bot.menu("File").menu("New").menuItems())

	}

	@Test
	def void test02_toolbarDropDownNewMenuContent() throws Exception {
		val newMenu = bot.toolbarDropDownButtonWithTooltip("New")
		newMenu.menuItem("K3 Project").click
		bot.button("Cancel").click

		newMenu.menuItem("GEMOC Sequential xDSML Project").click
		bot.button("Cancel").click
		
		newMenu.menuItem("Ecore Modeling Project").click

		// Workaround to discard the error message that pops when webkitgtk is not installed on the system
		// "Unknown Mozilla path (MOZILLA_FIVE_HOME not set)"
		try {
			bot.button("No").click
		} catch (WidgetNotFoundException e) {
		}

		bot.shell("New Ecore Modeling Project").setFocus
		bot.button("Cancel").click

	}

	@Test
	def void test03_toolbarContent() throws Exception {
		bot.toolbarButtonWithTooltip("Install GEMOC Components").click
		bot.sleep(8000);
		bot.shell("GEMOC Components Discovery").setFocus
		bot.button("Cancel").click
	}

}
