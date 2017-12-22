package org.eclipse.gemoc;

import org.eclipse.xtext.conversion.impl.AbstractDeclarativeValueConverterService;
import org.eclipse.xtext.conversion.ValueConverter
import org.eclipse.xtext.conversion.IValueConverter

public class ValueConverterService extends AbstractDeclarativeValueConverterService {
	
    @ValueConverter(rule = "MULTILINE")
    def IValueConverter<String> getMyRuleNameConverter() {
        return new DslValueConverter
    }
}
