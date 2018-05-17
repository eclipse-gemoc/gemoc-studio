<?xml version='1.0'?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                xmlns:fo="http://www.w3.org/1999/XSL/Format"
                version='1.0'>

<xsl:param name="body.font.family" select="'QuasiBookmanTTF'" />
<xsl:param name="title.font.family" select="'QuasiBookmanTTF'" />
<xsl:param name="dingbat.font.family" select="''" />

<xsl:param name="monospace.font.family" select="'QuasiCourierTTF'" />
<xsl:param name="sans.font.family" select="'QuasiSwissTTF'" /> 


<xsl:param name="section.label.includes.component.label" select="1" />
<xsl:param name="section.autolabel" select="1" />
<xsl:param name="generate.toc">book toc,figure</xsl:param>

<xsl:param name="callout.graphics" select="'0'" />
<xsl:param name="callout.unicode" select="'1'" />
<xsl:param name="callout.graphics.path">gfx/admonitions/callouts/</xsl:param>
<xsl:param name="callout.graphics.extension">.gif</xsl:param>

<xsl:param name="admon.graphics" select="0"/>
<xsl:param name="admon.graphics.path">gfx/admonitions/</xsl:param>
<xsl:param name="admon.graphics.extension">.gif</xsl:param>

<xsl:param name="draft.mode">no</xsl:param>

<xsl:param name="ulink.footnotes" select="0"/>
<xsl:param name="ulink.show" select="0"/>

<xsl:param name="formal.title.placement">
figure after
example after
equation after
table after
procedure after
task after
</xsl:param>


<xsl:attribute-set name="admonition.properties">
    <xsl:attribute name="font-size">90%</xsl:attribute>
    <xsl:attribute name="border-left-style">solid</xsl:attribute>
    <xsl:attribute name="border-left-color">black</xsl:attribute>
    <xsl:attribute name="border-left-width">1pt</xsl:attribute>
    <xsl:attribute name="padding-left">2em</xsl:attribute>
    <xsl:attribute name="margin-left">2em</xsl:attribute>
</xsl:attribute-set>

<xsl:attribute-set name="admonition.title.properties">
	<xsl:attribute name="font-family">QuasiSwissTTF</xsl:attribute>
    <xsl:attribute name="font-size">90%</xsl:attribute>
    <xsl:attribute name="font-weight">bold</xsl:attribute>

    <xsl:attribute name="border-left-style">solid</xsl:attribute>
    <xsl:attribute name="border-left-color">black</xsl:attribute>
    <xsl:attribute name="border-left-width">1pt</xsl:attribute>
    <xsl:attribute name="padding-left">2em</xsl:attribute>
    <xsl:attribute name="margin-left">2em</xsl:attribute>

    <xsl:attribute name="space-after">0pt</xsl:attribute>
</xsl:attribute-set>

<xsl:attribute-set name="formal.title.properties">
  <xsl:attribute name="font-weight">bold</xsl:attribute>
  <xsl:attribute name="font-size">
    <xsl:value-of select="$body.font.master * 0.9"/>
    <xsl:text>pt</xsl:text>
  </xsl:attribute>
  <xsl:attribute name="hyphenate">false</xsl:attribute>
  <xsl:attribute name="space-after.minimum">0.4em</xsl:attribute>
  <xsl:attribute name="space-after.optimum">0.6em</xsl:attribute>
  <xsl:attribute name="space-after.maximum">0.8em</xsl:attribute>
</xsl:attribute-set> 

<xsl:attribute-set name="section.title.properties">
  <xsl:attribute name="text-align">left</xsl:attribute>
</xsl:attribute-set>

<xsl:attribute-set name="verbatim.properties">
  <xsl:attribute name="font-size">
    <xsl:value-of select="$body.font.master * 0.8"/>
    <xsl:text>pt</xsl:text>
  </xsl:attribute>
  <xsl:attribute name="space-before.minimum">0.8em</xsl:attribute>
  <xsl:attribute name="space-before.optimum">1em</xsl:attribute>
  <xsl:attribute name="space-before.maximum">1.2em</xsl:attribute>
  <xsl:attribute name="space-after.minimum">0.8em</xsl:attribute>
  <xsl:attribute name="space-after.optimum">1em</xsl:attribute>
  <xsl:attribute name="space-after.maximum">1.2em</xsl:attribute>
  <xsl:attribute name="padding">3pt</xsl:attribute>
</xsl:attribute-set>

<xsl:param name="shade.verbatim" select="1"/>

<xsl:attribute-set name="shade.verbatim.style">
  <xsl:attribute name="background-color">#f0f0f0</xsl:attribute>
</xsl:attribute-set>

 
</xsl:stylesheet>

