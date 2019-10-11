package org.eclipse.gemoc.commons.eclipse.jdt.autosrcfolder;

import org.eclipse.ui.IStartup;

public class Startup implements IStartup {

	@Override
	public void earlyStartup() {
		new AutoSrcFolderCreator().start();
	}

}
