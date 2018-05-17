<?xml version='1.0'?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                xmlns:fo="http://www.w3.org/1999/XSL/Format"    
                xmlns:sbhl="java:net.sf.xslthl.ConnectorSaxonB"
                version='1.0'
                xmlns:xslthl="http://xslthl.sf.net"
                extension-element-prefixes="sbhl xslthl">
                <!-- exclude-result-prefixes="xslthl">
    			<!- -xmlns:xslthl="http://xslthl.sf.net"
    			extension-element-prefixes="s6hl xslthl">-->
                  

  <xsl:import href="urn:docbkx:stylesheet"/>
  <xsl:import href="urn:docbkx:stylesheet/highlight.xsl"/>
  <!--  <xsl:import href="urn:docbkx:stylesheet"/>
	<xsl:include href="./common.xsl"/>
	<xsl:include href="./highlight.xsl"/>
	<xsl:param name="highlight.xslthl.config">file:////C:/Users/dvojtise/workspaces/kermetaV2_scala/org.kermeta.language.documentation/src/docbkx/custom/highlighters/xslthl-config.xml</xsl:param>
  -->
  
<xsl:param name="table.borders.with.css" select="1"/>
<xsl:param name="html.stylesheet">css/docbook.css</xsl:param>
<xsl:param name="html.stylesheet.type">text/css</xsl:param>        
<xsl:param name="section.label.includes.component.label" select="1" />         
<xsl:param name="section.autolabel" select="1" />
<xsl:param name="generate.toc">book toc,title,figure</xsl:param>   
<xsl:param name="toc.section.depth">4</xsl:param>      
<xsl:param name="make.graphic.viewport" select="0"/>
<xsl:param name="callout.graphics" select="1" />
<xsl:param name="callout.graphics.path">gfx/callouts/</xsl:param>
<xsl:param name="callout.graphics.extension">.gif</xsl:param>
<xsl:param name="admon.graphics" select="1"/>
<!-- <xsl:param name="admon.graphics.path">gfx/admonitions/</xsl:param>-->
<xsl:param name="admon.graphics.path">
    <xsl:if test="$img.src.path != ''">
        <xsl:value-of select="$img.src.path"/>
    </xsl:if>
    <xsl:text>images/community/docbook/</xsl:text>
</xsl:param>
    <!--
        From: xhtml/admon.xsl
        Reason: remove tables
    -->
    <xsl:template name="graphical.admonition">
        <xsl:variable name="admon.type">
            <xsl:choose>
                <xsl:when test="local-name(.)='note'">Note</xsl:when>
                <xsl:when test="local-name(.)='warning'">Warning</xsl:when>
                <xsl:when test="local-name(.)='caution'">Caution</xsl:when>
                <xsl:when test="local-name(.)='tip'">Tip</xsl:when>
                <xsl:when test="local-name(.)='important'">Important</xsl:when>
                <xsl:otherwise>Note</xsl:otherwise>
            </xsl:choose>
        </xsl:variable>

        <xsl:variable name="alt">
            <xsl:call-template name="gentext">
                <xsl:with-param name="key" select="$admon.type"/>
            </xsl:call-template>
        </xsl:variable>

        <div xmlns="http://www.w3.org/1999/xhtml">
            <xsl:apply-templates select="." mode="class.attribute"/>
            <xsl:if test="$admon.style != ''">
                <xsl:attribute name="style">
                    <xsl:value-of select="$admon.style"/>
                </xsl:attribute>
            </xsl:if>

            <xsl:call-template name="anchor"/>
            <xsl:if test="$admon.textlabel != 0"> <!--  or d:title"> -->
                <h2>
                    <xsl:apply-templates select="." mode="object.title.markup"/>
                </h2>
            </xsl:if>
            <xsl:apply-templates/>
        </div>
    </xsl:template>
<!-- <xsl:param name="admon.graphics.extension">.gif</xsl:param>
<xsl:param name="admonition.title.properties">text-align: left</xsl:param> -->



<!-- <xsl:param name="chunk.section.depth" select="0"/>
<xsl:param name="chunk.first.sections" select="1"/>-->

<xsl:param name="chunker.output.encoding">utf-8</xsl:param>

<xsl:param name="formal.title.placement">
figure after
example before
equation after
table after
procedure after
task after
</xsl:param>
           
<!-- support for highlighting . see docbook/xsl/html/highlight.xsl for sample of coloration for html document-->
<xsl:param name="highlight.source" select="1"/>


<!-- <xsl:template match="xslthl:comment"  mode="xslthl">
    <i class="hl-comment"><xsl:apply-templates/></i>
</xsl:template>
<xsl:template match="xslthl:multiline-comment"  mode="xslthl">
    <i class="hl-comment"><xsl:apply-templates/></i>
</xsl:template>  
<xsl:template match="xslthl:oneline-comment"  mode="xslthl">
    <i class="hl-comment"><xsl:apply-templates/></i>
</xsl:template>--> 
  
<xsl:template match='xslthl:keyword'  mode="xslthl">
  <b class="hl-keyword" style="color:darkblue"><xsl:apply-templates/></b>
</xsl:template>
<xsl:template match='xslthl:filekeyword'  mode="xslthl"> 
  <b class="hl-keyword" style="color: darkred"><xsl:apply-templates/></b>
</xsl:template>
<xsl:template match='xslthl:annotation'  mode="xslthl"> 
  <b class="hl-keyword" style="color: darkred"><xsl:apply-templates/></b>
</xsl:template>
<xsl:template match='xslthl:specialoperation'  mode="xslthl"> 
  <i class="hl-keyword" ><xsl:apply-templates/></i>
</xsl:template>

<xsl:template match='xslthl:string'  mode="xslthl">
  <i style="color:blue" class="hl-string"><xsl:apply-templates/></i>
</xsl:template>
<xsl:template match='xslthl:comment'  mode="xslthl">
  <i class="hl-comment" style="color: darkgreen"><xsl:apply-templates/></i>
</xsl:template>
<xsl:template match='xslthl:doccomment'  mode="xslthl">
  <i class="hl-comment" style="color: darkblue"><xsl:apply-templates/></i>
</xsl:template>

</xsl:stylesheet>
