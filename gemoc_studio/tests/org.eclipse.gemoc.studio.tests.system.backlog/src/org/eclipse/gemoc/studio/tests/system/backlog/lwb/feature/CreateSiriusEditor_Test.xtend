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
package org.eclipse.gemoc.studio.tests.system.backlog.lwb.feature

import com.google.inject.Inject
import org.eclipse.core.resources.IProject
import org.eclipse.xtext.junit4.AbstractXtextTests
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.ui.util.IResourcesSetupUtil
import org.junit.After
import org.junit.Before
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.MethodSorters
import org.eclipse.gemoc.xdsmlframework.test.lib.MelangeWorkspaceTestHelper
import org.eclipse.gemoc.xdsmlframework.test.lib.MelangeUiInjectorProvider
import org.eclipse.swt.widgets.Display
import org.eclipse.gemoc.xdsmlframework.test.lib.WorkspaceTestHelper
import java.util.ArrayList
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTreeItem
import org.junit.BeforeClass
import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot

/**
 * Checks that studio provides ways to create Sirius editors (typically for a GEMOC Language)
 * (do not confuse with Sirius animator)
 */
@RunWith(XtextRunner)
@InjectWith(MelangeUiInjectorProvider)
@FixMethodOrder(MethodSorters::NAME_ASCENDING)
public class CreateSiriusEditor_Test extends AbstractXtextTests
{
	static WorkspaceTestHelper helper = new WorkspaceTestHelper
	
	private static SWTWorkbenchBot	bot;
	
	IProject melangeProject
	//IProject melangeProject2
	static final String BASE_FOLDER_NAME = "tests-inputs-gen/SequentialFSM"
	static final String BASE_PROJECT_NAME = "org.eclipse.gemoc.sample.legacyfsm"
	static final String PROJECT_NAME = BASE_PROJECT_NAME+".fsm"
	static final String MELANGE_FILE = PROJECT_NAME+"/src/org/eclipse/gemoc/sample/legacyfsm/fsm/FSM.melange"
	static final String PROJECT_NAME2 = BASE_PROJECT_NAME+".xsfsm"
	static final String MELANGE_FILE2 = PROJECT_NAME2+"/src/org/eclipse/gemoc/sample/legacyfsm/xsfsm/language/XSFSM.melange"
	
	@BeforeClass
	def static void beforeClass() throws Exception {
		bot = new SWTWorkbenchBot()
		IResourcesSetupUtil::cleanWorkspace
		helper.init

	}
	
	@Before
	override setUp() {
		helper.setTargetPlatform
		super.setUp
		helper.init
		IResourcesSetupUtil::cleanWorkspace
		
		// try to respect build order in order to ease compilation, this will speed up the test
		helper.deployProject(PROJECT_NAME+".model",BASE_FOLDER_NAME+"/"+PROJECT_NAME+".model.zip")
		melangeProject = helper.deployProject(PROJECT_NAME,BASE_FOLDER_NAME+"/"+PROJECT_NAME+".zip")
		//helper.deployProject(PROJECT_NAME+".design",BASE_FOLDER_NAME+"/"+PROJECT_NAME+".design.zip")
		//helper.deployProject(PROJECT_NAME+".model.edit",BASE_FOLDER_NAME+"/"+PROJECT_NAME+".model.edit.zip")
		//helper.deployProject(PROJECT_NAME+".model.editor",BASE_FOLDER_NAME+"/"+PROJECT_NAME+".model.editor.zip")
		
		
		//melangeProject2 = helper.deployProject(PROJECT_NAME2,BASE_FOLDER_NAME+"/"+PROJECT_NAME2+".zip")
		//melangeProject2 = helper.deployProject(PROJECT_NAME2+".xsfsm",BASE_FOLDER_NAME+"/"+PROJECT_NAME2+".xsfsm.zip")
		//helper.deployProject(PROJECT_NAME2+".design",BASE_FOLDER_NAME+"/"+PROJECT_NAME2+".design.zip")
		
		IResourcesSetupUtil::reallyWaitForAutoBuild
	}

	@After
	override tearDown() {
		// Nope
	}
	
	
	
	@Test
	def void test01_CreateEditorProject_usingGemocMenuOnProject() {
	
		val SWTBotTreeItem projectItem = bot.tree().getTreeItem(PROJECT_NAME).select();
		projectItem.contextMenu("GEMOC Language").menu("Create Sirius Editor Project for language").click();
		bot.button("OK").click();
		
		helper.assertProjectExists(PROJECT_NAME + ".design");
		
		bot.editorByTitle("xfsm.odesign").show();
		bot.tree().getTreeItem("platform:/resource/"+PROJECT_NAME+".design/description/xfsm.odesign").expand();
		// TODO recreate a basic representation in the default layer
		

		helper.assertNoMarkers();
	}
	
	
	@Test
	def void test02_CreateEditorProject_usingDropDownMenuNew(){
		bot.toolbarDropDownButtonWithTooltip("New").menuItem("Viewpoint Specification Project").click();		
		bot.textWithLabel("&Project name:").setText(PROJECT_NAME + ".design");
		bot.button("Next >").click();
		bot.button("Finish").click();
		helper.assertProjectExists(PROJECT_NAME + ".design");
		bot.editorByTitle("fsm.odesign").show();
		
	}
	
	
}
