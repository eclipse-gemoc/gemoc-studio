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

import com.google.inject.Inject
import org.eclipse.core.resources.IProject
import org.eclipse.xtext.junit4.AbstractXtextTests
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.junit.After
import org.junit.Before
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.MethodSorters
import org.eclipse.gemoc.xdsmlframework.test.lib.MelangeWorkspaceTestHelper
import org.eclipse.gemoc.xdsmlframework.test.lib.MelangeUiInjectorProvider
import org.eclipse.swt.widgets.Display
import org.junit.BeforeClass
import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot
import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner
import org.eclipse.gemoc.xdsmlframework.test.lib.WorkspaceTestHelper
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTreeItem
import com.google.inject.Injector
import java.util.ArrayList
import org.eclipse.swtbot.swt.finder.utils.SWTBotPreferences
import org.eclipse.xtext.ui.testing.util.IResourcesSetupUtil
import org.eclipse.gemoc.xdsmlframework.test.lib.TailWorkspaceLogToStderrRule
import org.junit.Rule

/**
 * Checks that the provided official sample can compile without error 
 */
@RunWith(XtextRunner)
//@RunWith(SWTBotJunit4ClassRunner)
@InjectWith(MelangeUiInjectorProvider)
@FixMethodOrder(MethodSorters::NAME_ASCENDING)
public class GenerateLangRuntime4OfficialSampleLegacyFSM_Test extends AbstractXtextTests
{
	
	@Inject MelangeWorkspaceTestHelper melangeHelper
	static WorkspaceTestHelper helper = new WorkspaceTestHelper
	private static SWTWorkbenchBot	bot;
	IProject melangeProject
	IProject melangeProject2
	static final String BASE_FOLDER_NAME = "tests-inputs-gen/SequentialFSM"
	static final String BASE_PROJECT_NAME = "org.eclipse.gemoc.sample.legacyfsm"
	static final String PROJECT_NAME = BASE_PROJECT_NAME+".fsm"
	static final String MELANGE_FILE = PROJECT_NAME+"/src/org/eclipse/gemoc/sample/legacyfsm/fsm/FSM.melange"
	static final String PROJECT_NAME2 = BASE_PROJECT_NAME+".xsfsm"
	static final String MELANGE_FILE2 = PROJECT_NAME2+"/src/org/eclipse/gemoc/sample/legacyfsm/xsfsm/language/XSFSM.melange"
	
	
	@BeforeClass
	def static void beforeClass() throws Exception {
		bot = new SWTWorkbenchBot()
		SWTBotPreferences.TIMEOUT = WorkspaceTestHelper.SWTBotPreferencesTIMEOUT_4_GEMOC;
		bot.resetWorkbench
	}
	
	@Rule
    public TailWorkspaceLogToStderrRule workspaceLogRule = new TailWorkspaceLogToStderrRule();
    
	@Before
	override setUp() {
		helper.setTargetPlatform
		super.setUp
		helper.init
		IResourcesSetupUtil::cleanWorkspace
		IResourcesSetupUtil::reallyWaitForAutoBuild
		
		// try to respect build order in order to ease compilation, this will speed up the test
		helper.deployProject(PROJECT_NAME+".model",BASE_FOLDER_NAME+"/"+PROJECT_NAME+".model.zip")
		helper.deployProject(PROJECT_NAME+".k3dsa",BASE_FOLDER_NAME+"/"+PROJECT_NAME+".k3dsa.zip")
		melangeProject = helper.deployProject(PROJECT_NAME,BASE_FOLDER_NAME+"/"+PROJECT_NAME+".zip")
		//helper.deployProject(PROJECT_NAME+".design",BASE_FOLDER_NAME+"/"+PROJECT_NAME+".design.zip")
		//helper.deployProject(PROJECT_NAME+".model.edit",BASE_FOLDER_NAME+"/"+PROJECT_NAME+".model.edit.zip")
		//helper.deployProject(PROJECT_NAME+".model.editor",BASE_FOLDER_NAME+"/"+PROJECT_NAME+".model.editor.zip")
		
		
		melangeProject2 = helper.deployProject(PROJECT_NAME2,BASE_FOLDER_NAME+"/"+PROJECT_NAME2+".zip")
		//helper.deployProject(PROJECT_NAME2+".design",BASE_FOLDER_NAME+"/"+PROJECT_NAME2+".design.zip")
		
		IResourcesSetupUtil::reallyWaitForAutoBuild
		WorkspaceTestHelper::reallyWaitForJobs(4)
		melangeHelper.cleanAll(MELANGE_FILE)
		melangeHelper.cleanAll(MELANGE_FILE2)
		IResourcesSetupUtil::fullBuild
		IResourcesSetupUtil::reallyWaitForAutoBuild
		WorkspaceTestHelper::reallyWaitForJobs(4)
		
		val ArrayList<Throwable> thrownException = newArrayList()
		Display.^default.syncExec([
			try {
				melangeHelper.openEditor(MELANGE_FILE)
				melangeHelper.openEditor(MELANGE_FILE2)
			} catch (Exception e) { thrownException.add(e) }
		])
		thrownException.forall[e| throw new Exception(e)] // rethrown exception that was executed in the ui thread
	}

	@After
	override tearDown() {
		// Nope
	}
	
	@Test
	def void test01_GenerateAllMelange_usingDirectCommand_NoErrorsInWorkspace() {
		val ArrayList<Throwable> thrownException = newArrayList()
		Display.^default.syncExec([
			try {
				melangeHelper.generateAll(MELANGE_FILE)
				melangeHelper.generateAll(MELANGE_FILE2)
			} catch (Exception e) {	thrownException.add(e) }
		])
		thrownException.forall[e| throw new Exception(e)] // rethrown exception that was executed in the ui thread
		IResourcesSetupUtil::reallyWaitForAutoBuild
		helper.assertNoMarkers
		
		helper.assertProjectExists(PROJECT_NAME)
		helper.assertProjectExists(PROJECT_NAME2)
		helper.assertProjectExists(PROJECT_NAME2+".xsfsm")
	}	

	@Test
	def void test02_GenerateAllMelange_usingClickOnMelangeFile_NoErrorsInWorkspace() {
		var projExplorerBot = bot.viewByTitle("Project Explorer").bot
		//bot.viewByTitle("Project Explorer").
		projExplorerBot.tree().getTreeItem(PROJECT_NAME).expand();
		projExplorerBot.tree().getTreeItem(PROJECT_NAME).getNode("src").expand();
		projExplorerBot.tree().getTreeItem(PROJECT_NAME).getNode("src").getNode(PROJECT_NAME).expand();
		var SWTBotTreeItem melangeFileItem = bot.tree().getTreeItem(PROJECT_NAME).getNode("src").getNode(PROJECT_NAME)
				.getNode("FSM.melange").select();
		melangeFileItem.contextMenu("Melange").menu("Generate All").click();

		// Melange "Generate all is a bit special as it trigger several jobs one after the other
		// retry in order to make sure they all have been done 
		WorkspaceTestHelper::reallyWaitForJobs(50)
		IResourcesSetupUtil::reallyWaitForAutoBuild
		
		projExplorerBot = bot.viewByTitle("Project Explorer").bot
		//bot.viewByTitle("Project Explorer").
		projExplorerBot.tree().getTreeItem(PROJECT_NAME2).expand();
		projExplorerBot.tree().getTreeItem(PROJECT_NAME2).getNode("src").expand();
		projExplorerBot.tree().getTreeItem(PROJECT_NAME2).getNode("src").getNode(PROJECT_NAME2+".language").expand();
		melangeFileItem = bot.tree().getTreeItem(PROJECT_NAME2).getNode("src").getNode(PROJECT_NAME2+".language")
				.getNode("XSFSM.melange").select();
		melangeFileItem.contextMenu("Melange").menu("Generate All").click();
		
		
		WorkspaceTestHelper::reallyWaitForJobs(50)
		IResourcesSetupUtil::reallyWaitForAutoBuild
		
		helper.assertNoMarkers
		
		helper.assertProjectExists(PROJECT_NAME)
		helper.assertProjectExists(PROJECT_NAME2)
		helper.assertProjectExists(PROJECT_NAME2+".xsfsm")
	}
	
}
