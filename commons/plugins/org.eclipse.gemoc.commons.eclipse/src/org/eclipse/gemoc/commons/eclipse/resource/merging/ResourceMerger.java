/*******************************************************************************
 * Copyright (c) 2017 Inria and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Inria - initial API and implementation
 *******************************************************************************/
package org.eclipse.gemoc.commons.eclipse.resource.merging;

import java.io.IOException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class ResourceMerger {

	private ResourcesMergerContext _context;
	
	protected ResourceMerger(ResourcesMergerContext context) {
		_context = context;
	}

	public void merge() throws IOException {
		EList<Resource> resources = getResources();
		URI outputURI = URI.createPlatformResourceURI(_context.getOutputFile().getFullPath().toString(), true);
		merge(resources, outputURI);
	}

	private EList<Resource> getResources() {
		ResourceSet rs = new ResourceSetImpl();
		URI inputURI = URI.createPlatformResourceURI(_context.getInputFile().getFullPath().toString(), true);
		Resource r = rs.getResource(inputURI, true);
		EcoreUtil.resolveAll(r);
		EcoreUtil.resolveAll(rs); // result in the load of several resources
		return rs.getResources();
	}

	private void merge(EList<Resource> resources, URI outputURI) throws IOException {
		ResourceSet rs = new ResourceSetImpl();
		Resource uniqueResource = rs.createResource(outputURI);
		for(Resource r : resources) 
		{
			uniqueResource.getContents().addAll(r.getContents());
		}
		for(IBeforeSavingAction action : _context.getBeforeSavingActions()) {
			ActionContext c = new ActionContext(uniqueResource);
			action.run(c);
		}
		uniqueResource.save(null);
	}

}
