package org.eclipse.gemoc.commons.eclipse.jdt.autosrcfolder.ui;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gemoc.commons.eclipse.jdt.autosrcfolder.AutoSrcFolderCreator;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

public class WorkbenchPreferencePage extends PreferencePage implements IWorkbenchPreferencePage {

	
	private List<Button> fCheckBoxes = new ArrayList<Button>();

	public WorkbenchPreferencePage() {
		setPreferenceStore(AutoSrcFolderCreator.preferenceStore);
	}

	public WorkbenchPreferencePage(String title) {
		super(title);
		// TODO Auto-generated constructor stub
	}

	public WorkbenchPreferencePage(String title, ImageDescriptor image) {
		super(title, image);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void init(IWorkbench workbench) {
		// TODO Auto-generated method stub

	}

	@Override
	protected Control createContents(Composite parent) {
		initializeDialogUnits(parent);
		Composite result = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		result.setLayout(layout);
		addCheckBox(result, "Enable automatic missing source folder creation.", AutoSrcFolderCreator.ENABLE_KEY);
		return result;
	}

	private Button addCheckBox(Composite parent, String label, String key) {
		GridData gd = new GridData(GridData.HORIZONTAL_ALIGN_FILL);

		Button button = new Button(parent, SWT.CHECK);
		button.setText(label);
		button.setData(key);
		button.setLayoutData(gd);

		button.setSelection(getPreferenceStore().getBoolean(key));

		fCheckBoxes.add(button);
		return button;
	}

	@Override
	public boolean performOk() {
		for (int i = 0; i < fCheckBoxes.size(); i++) {
			Button button = fCheckBoxes.get(i);
			String key = (String) button.getData();
			getPreferenceStore().setValue(key, button.getSelection());
		}
		return super.performOk();
	}

}
