<?xml version='1.0'?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                xmlns:fo="http://www.w3.org/1999/XSL/Format"
                version='1.0'>

<xsl:import href="@ant.docbook.styler.fileuri@/docbook/xsl/html/chunk.xsl" />

<!-- support for highlighting and other custom html. see docbook/xsl/html/highlight.xsl for sample of coloration for html document-->
<xsl:include href="@ant.docbook.styler.fileuri@/custom-styles/docbook/plain/xsl/customized.html-base.xsl"/>

<!-- (MM20040315) xsl parameters moved from ant-build-docbook.xml to here -->
<xsl:param name="table.borders.with.css" select="1"/>
<xsl:param name="html.stylesheet">css/docbook.css</xsl:param>
<xsl:param name="html.stylesheet.type">text/css</xsl:param>        
<xsl:param name="section.label.includes.component.label" select="1" />         
<xsl:param name="section.autolabel" select="1" />
<xsl:param name="generate.toc">book toc,title,figure</xsl:param>         
<xsl:param name="make.graphic.viewport" select="0"/>
<xsl:param name="callout.graphics" select="1" />
<xsl:param name="callout.graphics.path">gfx/admonitions/callouts/</xsl:param>
<xsl:param name="callout.graphics.extension">.gif</xsl:param>
<xsl:param name="admon.graphics" select="1"/>
<xsl:param name="admon.graphics.path">gfx/admonitions/</xsl:param>
<xsl:param name="admon.graphics.extension">.gif</xsl:param>
<xsl:param name="admonition.title.properties">text-align: left</xsl:param>
<xsl:param name="chunk.section.depth" select="0"/>
<xsl:param name="chunk.first.sections" select="1"/>

<xsl:param name="chunker.output.encoding">utf-8</xsl:param>

<xsl:param name="formal.title.placement">
figure after
example after
equation after
table after
procedure after
task after
</xsl:param>

<!-- (MM20040315) base.dir and root.filename are coming from the ant-build-docbook.xml -->
<xsl:param name="base.dir">@base.dir@/</xsl:param>
<xsl:param name="root.filename">@root.filename@</xsl:param>


<!-- convert url-only references to a format that is wrappable -->

<xsl:template match="ulink" name="ulink">
  <xsl:choose>
  <xsl:when test="count(child::node())=0">
  <a>
      <xsl:if test="@id">
        <xsl:attribute name="name">
          <xsl:value-of select="@id"/>
        </xsl:attribute>
      </xsl:if>
      <xsl:attribute name="href"><xsl:value-of select="@url"/></xsl:attribute>
      <xsl:if test="$ulink.target != ''">
        <xsl:attribute name="target">
          <xsl:value-of select="$ulink.target"/>
        </xsl:attribute>
      </xsl:if> 
    <xsl:if test="count(child::node())=0">
        <xsl:call-template name="insertInvisibleBreaks">
            <xsl:with-param name="url" select="@url" />
            <xsl:with-param name="breakat" select="translate(@url, '/-_:', '____')" />
        </xsl:call-template>
    </xsl:if>
  </a>
  </xsl:when>
  <xsl:otherwise>
  <xsl:apply-imports/>
  </xsl:otherwise>
  </xsl:choose>
</xsl:template> 

<xsl:template name="insertInvisibleBreaks">
    <xsl:param name="url" />
    <xsl:param name="breakat" />
    <!-- <xsl:message><xsl:value-of select="concat('param:', $url, $breakat)" /></xsl:message> -->
    <xsl:choose>
        <xsl:when test="contains($breakat, '_')">
            <xsl:value-of select="substring($url, 1, string-length(substring-before($breakat, '_'))+1)" /><wbr/>
            <xsl:call-template name="insertInvisibleBreaks">
                <xsl:with-param name="url" select="substring($url, string-length(substring-before($breakat, '_'))+2)"/>
                <xsl:with-param name="breakat" select="substring($breakat, string-length(substring-before($breakat, '_'))+2)"/>
            </xsl:call-template>
        </xsl:when>
        <xsl:otherwise>
            <xsl:value-of select="$url" />
        </xsl:otherwise>
    </xsl:choose>
</xsl:template>

</xsl:stylesheet>


