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

import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.NullProgressMonitor
import org.eclipse.gemoc.commons.eclipse.core.resources.IFileUtils
import org.eclipse.gemoc.execution.sequential.javaxdsml.ide.ui.templates.WizardTemplateMessages
import org.eclipse.gemoc.xdsmlframework.ide.ui.XDSMLFrameworkUI
import org.eclipse.gemoc.xdsmlframework.test.lib.TailWorkspaceLogToStderrRule
import org.eclipse.gemoc.xdsmlframework.test.lib.WorkspaceTestHelper
import org.eclipse.swt.widgets.Display
import org.eclipse.swt.widgets.Table
import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot
import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner
import org.eclipse.swtbot.swt.finder.keyboard.Keyboard
import org.eclipse.swtbot.swt.finder.keyboard.KeyboardFactory
import org.eclipse.swtbot.swt.finder.keyboard.Keystrokes
import org.eclipse.swtbot.swt.finder.utils.SWTBotPreferences
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTreeItem
import org.eclipse.xtext.junit4.AbstractXtextTests
import org.eclipse.xtext.ui.testing.util.IResourcesSetupUtil
import org.junit.After
import org.junit.Before
import org.junit.BeforeClass
import org.junit.FixMethodOrder
import org.junit.Ignore
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.MethodSorters

import static org.eclipse.swtbot.swt.finder.utils.SWTBotPreferences.*

/**
 * This class check a scenario where we reuse some of the base projects of the official sample : MelangeK3FSM
 * in order to create a new language.
 * The tests are ordered and a failure in the initial tests will most likely make fail the following ones.
 * As much as possible, this test tries to follow the DIY section in the K3FSM documentation 
 */
@RunWith(SWTBotJunit4ClassRunner)
@FixMethodOrder(MethodSorters::NAME_ASCENDING)
public class CreateSequentialLanguageFromOfficialK3FSM_Test extends AbstractXtextTests {

	static WorkspaceTestHelper helper = new WorkspaceTestHelper

	static final String BASE_FOLDER_NAME = "tests-inputs-gen/K3FSM"
	static final String BASE_NAME = "org.eclipse.gemoc.example.k3fsm"
	static final String MODEL_PROJECT_NAME = BASE_NAME
	static final String XDSML_PROJECT_NAME = BASE_NAME + ".xdsml"
	static final String XTEXT_PROJECT_NAME = BASE_NAME + ".xtext"

	private static SWTWorkbenchBot bot;

	@BeforeClass
	def static void beforeClass() throws Exception {
		helper.init
		bot = new SWTWorkbenchBot()
		// Set the SWTBot timeout
		SWTBotPreferences.TIMEOUT = WorkspaceTestHelper.SWTBotPreferencesTIMEOUT_4_GEMOC;
		helper.setTargetPlatform
		bot.resetWorkbench
		IResourcesSetupUtil::cleanWorkspace
		WorkspaceTestHelper::reallyWaitForJobs(2)
		IResourcesSetupUtil::reallyWaitForAutoBuild
		helper.deployProject(CreateSequentialLanguageFromOfficialK3FSM_Test.MODEL_PROJECT_NAME,
			BASE_FOLDER_NAME + "/" + CreateSequentialLanguageFromOfficialK3FSM_Test.MODEL_PROJECT_NAME + ".zip")
		helper.deployProject(CreateSequentialLanguageFromOfficialK3FSM_Test.MODEL_PROJECT_NAME + ".k3dsa",
			BASE_FOLDER_NAME + "/" + CreateSequentialLanguageFromOfficialK3FSM_Test.MODEL_PROJECT_NAME + ".k3dsa.zip")

		WorkspaceTestHelper::reallyWaitForJobs(2)
		IResourcesSetupUtil::reallyWaitForAutoBuild
		IResourcesSetupUtil::fullBuild
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
		bot.viewByTitle("Project Explorer").bot

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
		bot.text().setText(CreateSequentialLanguageFromOfficialK3FSM_Test.XDSML_PROJECT_NAME);
		bot.button("Next >").click();

		// bot.table(0).select("Simple GEMOC sequential project");
		// bot.tree().getTreeItem("Simple GEMOC sequential project").click();
		// bot.list().items
		// Cant find a way to correctly select the table item, so let's workaround by using keystrokes
		// this is ugly but seems to work ...
		selectTabWidgetByKeyStroke()
		// normally, we are now on the table
		val Keyboard key = KeyboardFactory.getSWTKeyboard();
		Display.getDefault().syncExec(new Runnable() {
			override void run() {
				val Table table = bot.focusedWidget as Table
				table.items.forEach[i|println(i + " " + i.text)]
				val index = table.items.indexOf(table.items.findFirst [ item |
					item.text.contains(WizardTemplateMessages.SequentialSingleLanguageTemplate_title)
				])
				// warning! the string actually comes from wizard name declared in the plugin.xml so make sure to have the same in the title !
				println("index of " + WizardTemplateMessages.SequentialSingleLanguageTemplate_title + " =" + index)
				// TODO assert if not found
				// table.select(index) // does not seem to work
				// bot.table.select(index) // does not seem to work too :-(
				for (var i = 0; i < table.itemCount; i++) {
					key.pressShortcut(Keystrokes.UP)
				}
				for (var i = 0; i < index; i++) {
					key.pressShortcut(Keystrokes.DOWN)
				}
			}
		})
		printFocusedWidget
		bot.sleep(2000)

		// val TemplateListSelectionPage templatePage =   bot.widget(widgetOfType(TemplateListSelectionPage.class))
		bot.button("Next >").click();
		bot.textWithLabel("&Package name(*)").setText(BASE_NAME);

		val activeShell = bot.activeShell // the focus is lost after click on "Browse..."
		bot.button("Browse...", 0).click();
		// bot.shell("File Selection").activate();
		bot.tree().getTreeItem(CreateSequentialLanguageFromOfficialK3FSM_Test.MODEL_PROJECT_NAME).expand();
		bot.tree().getTreeItem(CreateSequentialLanguageFromOfficialK3FSM_Test.MODEL_PROJECT_NAME).getNode("model").
			expand();
		bot.tree().getTreeItem(CreateSequentialLanguageFromOfficialK3FSM_Test.MODEL_PROJECT_NAME).getNode("model").
			getNode("k3fsm.ecore").click();
		bot.button("OK").click();
		activeShell.bot.button("Browse...", 1).click();
		bot.button("OK").click();

		/* or 
		 * bot.textWithLabel("&Ecore file location").setText(SOURCE_PROJECT_NAME + ".model/model/fsm.ecore");
		 * bot.textWithLabel("K3 DSA Project name").setText(SOURCE_PROJECT_NAME + ".k3dsa");
		 */
		activeShell.bot.button("Finish").click()
		// bot.button("Finish").click();
		IResourcesSetupUtil::reallyWaitForAutoBuild
		WorkspaceTestHelper::reallyWaitForJobs(2)
		helper.assertProjectExists(CreateSequentialLanguageFromOfficialK3FSM_Test.XDSML_PROJECT_NAME);

		IResourcesSetupUtil.reallyWaitForAutoBuild();
		helper.assertNoMarkers();

	}

	@Test
	def void test03_CreateTreeEditor() throws Exception {
		bot.tree().getTreeItem("org.eclipse.gemoc.example.k3fsm").expand();
		bot.tree().getTreeItem("org.eclipse.gemoc.example.k3fsm").getNode("model").expand();
		val projectItem = bot.tree().getTreeItem("org.eclipse.gemoc.example.k3fsm").getNode("model").getNode(
			"k3fsm.genmodel").select();
		projectItem.contextMenu("Open").click();
		val genModelEditor = bot.editorByTitle("k3fsm.genmodel")
		genModelEditor.show
		genModelEditor.setFocus
		val genModelPackageItem = genModelEditor.bot.tree().getTreeItem("K3fsm").select();
		genModelPackageItem.contextMenu("Generate All").click();
		IResourcesSetupUtil::reallyWaitForAutoBuild
		WorkspaceTestHelper::reallyWaitForJobs(2)
		helper.assertProjectExists(MODEL_PROJECT_NAME + ".edit");
		helper.assertProjectExists(MODEL_PROJECT_NAME + ".editor");
		helper.assertNoMarkers();
	}

	@Test
	def void test04_CreateTextualEditor() throws Exception {
		val SWTBotTreeItem projectItem = bot.tree().getTreeItem("org.eclipse.gemoc.example.k3fsm.xdsml").select();
		projectItem.contextMenu("GEMOC Language").menu("Create XText Editor Project for language").click();
		bot.button("Add...").click();
		selectTabWidgetByKeyStroke()
		// normally, we are now on the table
		val Keyboard key = KeyboardFactory.getSWTKeyboard();
		// press space to select the first entry
		key.pressShortcut((Keystrokes.SPACE))
		bot.button("OK").click();
		bot.button("Next >").click();
		bot.textWithLabel("&Project name:").setText(XTEXT_PROJECT_NAME);
		bot.textWithLabel("Name:").setText(BASE_NAME + ".K3FSM");
		bot.textWithLabel("Extensions:").setText("k3fsm");
		bot.button("Next >").click();
		bot.button("Finish").click();
		IResourcesSetupUtil::reallyWaitForAutoBuild
		WorkspaceTestHelper::reallyWaitForJobs(4)
		
		// workaround for https://github.com/eclipse/gemoc-studio/issues/14 we currently need to manually replace the nsUri by a platform uri
		val xtexFile = ResourcesPlugin::workspace.root.getProject(XTEXT_PROJECT_NAME).getFile("src/org/eclipse/gemoc/example/k3fsm/K3FSM.xtext")
		assertTrue(xtexFile.exists)
		IFileUtils.writeInFileIfDifferent(xtexFile,
			IFileUtils.getStringContent(xtexFile).replaceFirst(
				'import "http://www.eclipse.org/gemoc/example/k3fsm"', 
				'import "platform:/resource/org.eclipse.gemoc.example.k3fsm/model/k3fsm.ecore"'),
			new NullProgressMonitor)
		
		
		helper.assertProjectExists(XTEXT_PROJECT_NAME);
		helper.assertProjectExists(XTEXT_PROJECT_NAME + ".ide");
		helper.assertProjectExists(XTEXT_PROJECT_NAME + ".ui");
		bot.tree().getTreeItem(XTEXT_PROJECT_NAME).select();
		bot.tree().getTreeItem(XTEXT_PROJECT_NAME).expand();
		bot.tree().getTreeItem(XTEXT_PROJECT_NAME).getNode("src").expand();
		bot.tree().getTreeItem(XTEXT_PROJECT_NAME).getNode("src").getNode(BASE_NAME).expand();
		val SWTBotTreeItem mwe2Item = bot.tree().getTreeItem(XTEXT_PROJECT_NAME).getNode("src").getNode(BASE_NAME).
			getNode("GenerateK3FSM.mwe2").select();
		mwe2Item.contextMenu("Run As").menu("1 MWE2 Workflow").click();

		IResourcesSetupUtil::reallyWaitForAutoBuild
		WorkspaceTestHelper::reallyWaitForJobs(2)
		helper.assertNoMarkers();

	}

	/**
	 * This test use the GEMOC menu to create a Sirius editor for a language
	 * @throws Exception
	 */
	@Test
	def void test05_CreateSiriusEditorForLanguage() throws Exception {

		val SWTBotTreeItem projectItem = bot.tree().getTreeItem(XDSML_PROJECT_NAME).select();
		projectItem.contextMenu("GEMOC Language").menu("Create Sirius Editor Project for language").click();
		bot.button("Finish").click();

		IResourcesSetupUtil::reallyWaitForAutoBuild
		WorkspaceTestHelper::reallyWaitForJobs(2)
		helper.assertProjectExists(CreateSequentialLanguageFromOfficialK3FSM_Test.BASE_NAME + ".design");

		bot.editorByTitle("k3fsm.odesign").show();
		/*bot.tree().getTreeItem(
			"platform:/resource/" + CreateSequentialLanguageFromOfficialK3FSM_Test.BASE_NAME +
				".design/description/xfsm.odesign").expand();
		*/
				// TODO recreate a basic representation in the default layer
		helper.assertNoMarkers();
	}

	def printFocusedWidget() {

		Display.getDefault().syncExec(new Runnable() {
			override void run() {
				System.out.println(
					"Focused Widget = " + bot.focusedWidget.toString + " " + bot.focusedWidget.class)
			}
		});
	}

	def selectTabWidgetByKeyStroke() {
		// Cant find a way to correctly select the table item, so let's workaround by using keystrokes
		// this is ugly but seems to work ...
		printFocusedWidget
		bot.sleep(500)
		val Keyboard key = KeyboardFactory.getSWTKeyboard();
		(1 .. 10).takeWhile[!( bot.focusedWidget instanceof Table)].forEach [ i |
			key.pressShortcut(Keystrokes.TAB)
			printFocusedWidget
			bot.sleep(500)
		]
	}

}
		