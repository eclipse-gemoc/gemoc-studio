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
package org.eclipse.gemoc.commons.messagingsystem.api.reference;

import java.net.URL;

public class TextReference extends org.eclipse.gemoc.commons.messagingsystem.api.reference.FileReference {

		/**
	 * 
	 */
	private static final long serialVersionUID = 3641018507706926300L;
		protected Integer beginOffset = 0;
		protected Integer endOffset = 0;
		protected Integer beginLine = 0;
		protected Integer endLine = 0;
		
			
		public TextReference(URL fileURL, Integer beginOffset, Integer endOffset) {
			super(fileURL);
			this.beginOffset = beginOffset;
			this.endOffset = endOffset;
		}
		
		// getters and setters
		public Integer getBeginOffset() {
			return beginOffset;
		}
		public void setBeginOffset(Integer beginOffset) {
			this.beginOffset = beginOffset;
		}
		public Integer getEndOffset() {
			return endOffset;
		}
		public void setEndOffset(Integer endOffset) {
			this.endOffset = endOffset;
		}
		public Integer getBeginLine() {
			return beginLine;
		}

		public void setBeginLine(Integer beginLine) {
			this.beginLine = beginLine;
		}

		public Integer getEndLine() {
			return endLine;
		}

		public void setEndLine(Integer endLine) {
			this.endLine = endLine;
		}

		@Override
		public String toString() {
			
			return this.getClass().getCanonicalName()+"("+fileURL+",offset["+beginOffset+","+endOffset+"],line["+beginLine+","+endLine+"])";
		}	
		
	}

	
