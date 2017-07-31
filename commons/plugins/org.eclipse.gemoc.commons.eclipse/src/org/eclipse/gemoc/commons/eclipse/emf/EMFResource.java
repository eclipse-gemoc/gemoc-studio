/*******************************************************************************
 * Copyright (c) 2013, 2017 Obeo. All Rights Reserved.
 *
 * This software and the attached documentation are the exclusive ownership
 * of its authors and was conceded to the profit of Obeo SARL.
 * This software and the attached documentation are protected under the rights
 * of intellectual ownership, including the section "Titre II  Droits des auteurs (Articles L121-1 L123-12)"
 * By installing this software, you acknowledge being aware of this rights and
 * accept them, and as a consequence you must:
 * - be in possession of a valid license of use conceded by Obeo only.
 * - agree that you have read, understood, and will comply with the license terms and conditions.
 * - agree not to do anything that could conflict with intellectual ownership owned by Obeo or its beneficiaries
 * or the authors of this software
 *
 * Should you not agree with these terms, you must stop to use this software and give it back to its legitimate owner.
 *
 *******************************************************************************/
package org.eclipse.gemoc.commons.eclipse.emf;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

public final class EMFResource {

	private EMFResource() {

	}

	public static Object getFirstContent(IFile xmiFile) {
		return getFirstContent(getResource(xmiFile));
	}

	public static Object getFirstContent(String uriAsString) {
		return getFirstContent(getResource(uriAsString));
	}

	public static Object getFirstContent(URI uri) {
		return getFirstContent(getResource(uri));
	}

	private static Object getFirstContent(Resource resource) {
		if (resource.getContents().size() > 0) {
			return resource.getContents().get(0);
		} else {
			return null;
		}
	}

	public static Resource getResource(String uriAsString) {
		URI uri = URI.createURI(uriAsString);
		return getResource(uri);
	}

	public static Resource getResource(IFile file) {
		URI uri = URI.createURI(file.getLocationURI().toString());
		return getResource(uri);
	}

	public static Resource getResource(URI uri) {
		final ResourceSet resourceSet = new ResourceSetImpl();
		final Resource r = resourceSet.getResource(uri, true);
		return r;
	}

	/**
	 * search for the Resources related to the given resource This will help
	 * finding resources in a big ResourceSet
	 * 
	 * @param res
	 * @return Resources related to the given resource including the input
	 *         resource
	 */
	public static Set<Resource> getRelatedResources(Resource res) {
		Set<Resource> result = new HashSet<Resource>();
		result.addAll(getRelatedResources(res, result));
		return result;
	}

	protected static Set<Resource> getRelatedResources(Resource res,
			Set<Resource> result) {
		if (result.contains(res))
			return result;
		result.add(res);
		Map<EObject, Collection<EStructuralFeature.Setting>> crossRefs = EcoreUtil.ExternalCrossReferencer
				.find(res);
		for (Map.Entry<EObject, Collection<EStructuralFeature.Setting>> entry : crossRefs
				.entrySet()) {
			EObject proxyEObject = entry.getKey();
			result.addAll(getRelatedResources(proxyEObject.eResource(), result));
		}
		return result;
	}

	/**
	 * Getting an IFile from an EObject
	 * 
	 * @param eObject
	 * @return
	 */
	public static IFile getIFile(EObject eObject) {
		return getIFile(eObject.eResource());
	}

	/**
	 * Getting an IFile from an EMF Resource
	 * 
	 * @param eObject
	 * @return
	 */
	public static IFile getIFile(Resource res) {
		URI uri = res.getURI();
		String filePath = uri.toPlatformString(true);
		IFile ifile = ResourcesPlugin.getWorkspace().getRoot()
				.getFile(new Path(filePath));
		return ifile;
	}
}
