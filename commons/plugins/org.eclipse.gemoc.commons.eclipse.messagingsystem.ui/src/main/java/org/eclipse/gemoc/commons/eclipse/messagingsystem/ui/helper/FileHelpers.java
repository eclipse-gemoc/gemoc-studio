/*******************************************************************************
 * Copyright (c) 2011, 2017 Inria and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Inria - initial API and implementation
 *******************************************************************************/
package org.eclipse.gemoc.commons.eclipse.messagingsystem.ui.helper;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class FileHelpers {
	private static String cleanIfNecessaryPath(String resourcePath) {
		// deal with windows \\ delimiter
		String unifiedSepratorResourcePath = resourcePath.replaceAll("\\\\", "/").replaceAll(" ", "%20");
				
		if(!unifiedSepratorResourcePath.startsWith("file:/") && !unifiedSepratorResourcePath.startsWith("jar:") && !unifiedSepratorResourcePath.startsWith("platform:")){
			if(unifiedSepratorResourcePath.startsWith("/"))
				unifiedSepratorResourcePath = "file:" + unifiedSepratorResourcePath;
			else
				unifiedSepratorResourcePath = "file:/" + unifiedSepratorResourcePath;
		}
			
		return unifiedSepratorResourcePath;
	}
	
	public static URL StringToURL(String url) throws MalformedURLException {
		return new URL(cleanIfNecessaryPath(url));
	}
	
	public static URI StringToURI(String url) throws URISyntaxException {
		return new URI(cleanIfNecessaryPath(url));
	}
	
	public static URL FileToURL(File file) throws MalformedURLException {
		return file.toURI().toURL();
	}
	
	public static String URLToStringWithoutFile(final URL url) {
		return url.getFile();
	}
	
	
	public static void copyFile(File inputFile, File outputFile) throws IOException{
    	outputFile.getParentFile().mkdirs();
    	FileReader in = new FileReader(inputFile);
        FileWriter out = new FileWriter(outputFile);
        int c;

        while ((c = in.read()) != -1)
          out.write(c);

        in.close();
        out.close();
    }
	
	public static void copyDirectory(File inputFolder, File outputFolder) throws IOException{
		
		outputFolder.getParentFile().mkdirs();
		for(File innerFile : inputFolder.listFiles()){
			if(innerFile.isDirectory()){
				copyDirectory(innerFile, new File(outputFolder.getCanonicalPath()+"/"+innerFile.getName()));
			}
			if(innerFile.isFile()){
				copyFile(innerFile, new File(outputFolder.getCanonicalPath()+"/"+innerFile.getName()));
			}
		}
		
    }
	
}
