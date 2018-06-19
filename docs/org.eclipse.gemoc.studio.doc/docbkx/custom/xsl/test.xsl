<xsl:stylesheet 
    xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:xslthl="http://xslthl.sf.net"
    exclude-result-prefixes="xslthl"
    version="1.0">

  <xsl:import href="urn:docbkx:stylesheet"/>
<!-- <xsl:import href="urn:docbkx:stylesheet/highlight.xsl"/> -->
  
  
  
  <xsl:template match="xslthl:comment">
    <i class="hl-comment"><xsl:apply-templates/></i>
  </xsl:template>
  <xsl:template match='xslthl:keyword'>
  <b class="hl-keyword" style="color:darkblue"><xsl:apply-templates/></b>
</xsl:template>
<xsl:template match='xslthl:filekeyword'> 
  <b class="hl-keyword" style="color: darkred"><xsl:apply-templates/></b>
</xsl:template>
<xsl:template match='xslthl:annotation'> 
  <b class="hl-keyword" style="color: darkred"><xsl:apply-templates/></b>
</xsl:template>
<xsl:template match='xslthl:specialoperation'> 
  <i class="hl-keyword" ><xsl:apply-templates/></i>
</xsl:template>

<xsl:template match='xslthl:string'>
  <i style="color:blue" class="hl-string"><xsl:apply-templates/></i>
</xsl:template>
<xsl:template match='xslthl:comment'>
  <i class="hl-comment" style="color: darkgreen"><xsl:apply-templates/></i>
</xsl:template>
<xsl:template match='xslthl:doccomment'>
  <i class="hl-comment" style="color: darkblue"><xsl:apply-templates/></i>
</xsl:template>
  
</xsl:stylesheet>