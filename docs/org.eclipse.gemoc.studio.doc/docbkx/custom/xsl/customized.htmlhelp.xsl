<?xml version='1.0'?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                xmlns:fo="http://www.w3.org/1999/XSL/Format"
                version='1.0'>

<xsl:import href="@ant.docbook.styler.fileuri@/docbook/xsl/htmlhelp/htmlhelp.xsl" />

<!-- support for highlighting and other custom html. see docbook/xsl/html/highlight.xsl for sample of coloration for html document-->
<xsl:include href="@ant.docbook.styler.fileuri@/custom-styles/docbook/plain/xsl/customized.html-base.xsl"/>

<!-- (MM20040315) base.dir and root.filename are coming from the ant-build-docbook.xml -->
<!--<xsl:param name="base.dir">@base.dir@/</xsl:param>
<xsl:param name="root.filename">@root.filename@</xsl:param>-->



</xsl:stylesheet>


