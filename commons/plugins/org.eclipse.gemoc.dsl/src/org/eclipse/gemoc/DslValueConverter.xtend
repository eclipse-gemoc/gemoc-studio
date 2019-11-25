package org.eclipse.gemoc;

import org.eclipse.xtext.conversion.IValueConverter
import org.eclipse.xtext.conversion.ValueConverterException
import org.eclipse.xtext.nodemodel.INode

public class DslValueConverter implements IValueConverter {
	
	override toString(Object value) throws ValueConverterException {
		return value.toString()
	}
	
	override toValue(String string, INode node) throws ValueConverterException {
		if(string === null)
			return ""
			
		return string.replaceAll("\\\\\n[ \t]*","")
	}

}
