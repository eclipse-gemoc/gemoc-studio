package org.eclipse.gemoc.ui.highlighting

import org.eclipse.swt.graphics.RGB
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor
import org.eclipse.xtext.ui.editor.utils.TextStyle
import org.eclipse.swt.SWT

class DslHighlightingConfiguration extends DefaultHighlightingConfiguration {
	public static final String KEY_ID = "dsl_key"
	public static final String VALUE_ID = "dsl_value"
	public static final String SEPARATOR_ID = "dsl_separator"
	public static final String LINESEPARATOR_ID = "dsl_lineseparator"

	override configure(IHighlightingConfigurationAcceptor acceptor) {
		super.configure(acceptor)
		acceptor.acceptDefaultHighlighting(KEY_ID, "Entry key", keyTextStyle());
		acceptor.acceptDefaultHighlighting(VALUE_ID, "Entry value", valueTextStyle());
		acceptor.acceptDefaultHighlighting(SEPARATOR_ID, "Entry separator", separatorTextStyle());
		acceptor.acceptDefaultHighlighting(LINESEPARATOR_ID, "Line separator", lineSeparatorTextStyle());
	}

	def TextStyle keyTextStyle() {
		val TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(0, 26, 171)); // From org.eclipse.xtext.xbase.ui.highlighting.XbaseHighlightingConfiguration.field()
		// textStyle.setColor(new RGB(171, 48, 0)); // From org.eclipse.xtext.xbase.ui.highlighting.XbaseHighlightingConfiguration.extensionMethodInvocation()
		return textStyle;
	}

	def TextStyle valueTextStyle() {
		val TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setStyle(SWT.ITALIC);
		return textStyle;
	}

	def TextStyle separatorTextStyle() {
		val TextStyle textStyle = defaultTextStyle().copy();
		return textStyle;
	}

	def TextStyle lineSeparatorTextStyle() {
		val TextStyle textStyle = numberTextStyle().copy();
		textStyle.setStyle(SWT.NORMAL);
		return textStyle;
	}
}
