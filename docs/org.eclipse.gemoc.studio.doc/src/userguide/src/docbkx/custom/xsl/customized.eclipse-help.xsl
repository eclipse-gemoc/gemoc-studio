<?xml version='1.0'?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                xmlns:fo="http://www.w3.org/1999/XSL/Format"
                version='1.0'>


<xsl:import href="@ant.docbook.styler.fileuri@/docbook/modified_xsl/eclipse/eclipse.xsl" />
<!-- <xsl:import href="../../../../docbook-xsl-1.74.0/eclipse/eclipse.xsl" />-->

<!-- support for highlighting and other custom html. see docbook/xsl/html/highlight.xsl for sample of coloration for html document-->
<xsl:include href="@ant.docbook.styler.fileuri@/custom-styles/docbook/plain/xsl/customized.html-base.xsl"/>



<!-- specific to eclipse help -->
<xsl:param name="manifest.in.base.dir" select="1"></xsl:param>
<xsl:param name="manifest.root.dir"></xsl:param>
<xsl:param name="deployed.eclipse.html.dir">build/eclipse.help/</xsl:param>
<xsl:param name="to.html.dir.relative.path">build/eclipse.help/</xsl:param>
<xsl:param name="toc.dir">build/eclipse.help/</xsl:param>
<xsl:param name="base.dir">help/html/</xsl:param>

<!-- html presentation -->
<xsl:param name="table.borders.with.css" select="1"/>
<xsl:param name="html.stylesheet">css/docbook.css</xsl:param>
<xsl:param name="html.stylesheet.type">text/css</xsl:param>        
<xsl:param name="section.label.includes.component.label" select="1" />         
<xsl:param name="section.autolabel" select="1" />
<xsl:param name="generate.toc"></xsl:param> 
<xsl:param name="callout.graphics" select="1" />
<xsl:param name="callout.graphics.path">gfx/admonitions/callouts/</xsl:param>
<xsl:param name="callout.graphics.extension">.gif</xsl:param>
<xsl:param name="admon.graphics" select="1"/>
<xsl:param name="admon.graphics.path">gfx/admonitions/</xsl:param>
<xsl:param name="admon.graphics.extension">.gif</xsl:param>
<xsl:param name="admonition.title.properties">text-align: left</xsl:param>

<xsl:param name="formal.title.placement">
figure after
example after
equation after
table after
procedure after
task after
</xsl:param>

</xsl:stylesheet>


