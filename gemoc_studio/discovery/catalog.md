---
layout: default
title: GEMOC Component Discovery Catalog


discoveryBaseURL: https://github.com/gemoc/gemoc-studio/raw/master/gemoc_studio/discovery/
langSeq: <img title="The domain language can be executed with a sequential engine (Java)." src="gallery/icons/IconeGemocLanguage-Sequential-48.png" alt="Sequential Language" width="16" height="16">
langCon: <img title="The domain language can be executed with a concurrent engine (ccsljava)." src="gallery/icons/IconeGemocLanguage-Concurrent-48.png" alt="Concurrent Language" width="16" height="16">
bcoolLangCoord: <img title="Models of this domain language can be coordinated with other models (of the same language or other languages)." src="gallery/icons/bcool-icon-32.png" width="16" height="16">
download: <img title="the language is available through the GEMOC discovery service." src="gallery/icons/download_gemoc_studio.png" width="16">
pkg: <img title="the language is available as sample in the GEMOC Studio." src="gallery/icons/gemoc_eclipse_package.png" width="16" height="16">
moliz: <img title="The domain language can be executed with an xMOF engine." src="gallery/icons/xmof_moliz_ico.png" alt="" width="16" height="16">
---

# GEMOC Component Discovery Catalog

Categories:
- [GEMOC Language](#gemoc-language)
- [GEMOC Coordination](#gemoc-coordination)
- [Alternative GEMOC based Engines](#alternativegemoc-based-engines)
- [Exhaustive Exploration](#exhaustive-exploration)
- [Modeler](#modeler)
- [Alternative Tools](#alternative-tools)

All these components can be installed from a GEMOC Studio. Simply click on <i>Help &gt; Install Additional GEMOC Components</i>

## GEMOC Language
Languages designed using GEMOC.

<!-- ActivityDiagram Languages (Sequential/Concurrent)(Incubation)  -->
<div class="row">    
    <div class="col-md-8 col-md-push-4">    	
        <h3><img src="{{ page.discoveryBaseURL }}images/IconeGemocLanguagePlusModel-32.png" alt="">
         ActivityDiagram Languages (Sequential/Concurrent)(Incubation) <small>by GEMOC</small></h3>
        <p>Deployer that installs the project sources for Concurrent and/or Sequential version of the Activitydiagram Language and sample models.</p>
        <p>Deployer that installs the project sources for two versions of the Activitydiagram Language developped using GEMOC. One version will run using the GEMOC Sequential engine, the second using Concurrent engine.  The deployer also provides sample models.
        <a href="http://github.com/gemoc/activitydiagram">Learn more</a></p>

        <h4>Update site</h4>
        <ul>
            <li><a href="https://ci.inria.fr/gemoc/job/ActivityDiagram_updatesite/lastSuccessfulBuild/artifact/dev/releng/org.gemoc.activitydiagram.repository/target/repository/">https://ci.inria.fr/gemoc/job/ActivityDiagram_updatesite/lastSuccessfulBuild/artifact/dev/releng/org.gemoc.activitydiagram.repository/target/repository/</a></li>            
        </ul>
    </div>
    <div class="col-md-4 col-md-pull-8">
        <img class="img-responsive img-hover" src="{{ page.discoveryBaseURL }}images/activitydiagram_sequential-screenshot-320x240.png" alt="">        
    </div>
</div>

<!-- ArduinoModeling Languages (Sequential/Concurrent)(Incubation)  -->
<div class="row">    
    <div class="col-md-8 col-md-push-4">    	
        <h3><img src="{{ page.discoveryBaseURL }}images/IconeGemocLanguagePlusModel-32.png" alt="">
         ArduinoModeling Languages (Sequential/Concurrent)(Incubation) <small>by GEMOC</small></h3>
        <p>Deployer that installs the project sources for Sequential and Concurrent  versions of the ArduinoModeling Language and sample models.</p>
        <p>Deployer that installs the project sources for two versions of the ArduinoModeling Language developped using GEMOC.  One version run using the GEMOC Sequential engine, the second using the Concurrent engine. The deployer also provides some sample models.
        <a href="http://github.com/gemoc/arduinomodeling">Learn more</a></p>

        <h4>Update site</h4>
        <ul>
            <li><a href="https://ci.inria.fr/gemoc/job/ArduinoModeling_updatesite/lastSuccessfulBuild/artifact/dev/releng/org.gemoc.arduinomodeling.repository/target/repository/">https://ci.inria.fr/gemoc/job/ArduinoModeling_updatesite/lastSuccessfulBuild/artifact/dev/releng/org.gemoc.arduinomodeling.repository/target/repository/</a></li>            
        </ul>
    </div>
    <div class="col-md-4 col-md-pull-8">
        <img class="img-responsive img-hover" src="{{ page.discoveryBaseURL }}images/arduinomodeling_sequential-screenshot-320x240.png" alt="">        
    </div>
</div>

<!-- Markedgraph Language (Concurrent)(Incubation)  -->
<div class="row">    
    <div class="col-md-8 col-md-push-4">    	
        <h3><img src="{{ page.discoveryBaseURL }}images/IconeGemocLanguagePlusModel-32.png" alt="">
         Markedgraph Language (Concurrent)(Incubation) <small>by GEMOC</small></h3>
        <p>Deployer that installs the project sources for the concurrent version of the Markedgraph Language and sample models.</p>
        <p>Deployer that installs the project sources for the Markedgraph Language developped using GEMOC.  This version runs using the GEMOC Concurrent engine. The deployer also provides some sample models. This is the result of the GEMOC tutorial available in the eclipse help.
        <a href="http://gemoc.github.io/gemoc-studio/publish/tutorial_markedgraph/html_single/GuideTutorialMarkedGraph.html">Learn more</a></p>

        <h4>Update site</h4>
        <ul>
            <li><a href="https://ci.inria.fr/gemoc/job/Markedgraph_updatesite/lastSuccessfulBuild/artifact/sample/markedgraph/releng/org.gemoc.sample.markedgraph.repository/target/repository/">https://ci.inria.fr/gemoc/job/Markedgraph_updatesite/lastSuccessfulBuild/artifact/sample/markedgraph/releng/org.gemoc.sample.markedgraph.repository/target/repository/</a></li>            
        </ul>
    </div>
    <div class="col-md-4 col-md-pull-8">
        <img class="img-responsive img-hover" src="{{ page.discoveryBaseURL }}images/markedgraph_sequential-screenshot-320x240.png" alt="">        
    </div>
</div>


## GEMOC Coordination
Language coordination operators designed using GEMOC.

<!-- Operator for TFSM and ActivityDiagram (Incubation)  -->
<div class="row">    
    <div class="col-md-8 col-md-push-4">    	
        <h3><img src="{{ page.discoveryBaseURL }}images/bcool-icon-32.png" alt="">
         Operator for TFSM and ActivityDiagram (Incubation) <small>by I3S</small></h3>
        <p>Deployer that installs the project sources for the coordination operator for TFSM and ActivityDiagram concurrent languages and sample models.</p>
        <p>Deployer that installs the project sources for the coordination operator for TFSM and ActivityDiagram concurrent languages developped using GEMOC. The deployer also provides some sample models.
        <a href="http://timesquare.inria.fr/BCOoL/">Learn more</a></p>

        <h4>Update site</h4>
        <ul>
            <li><a href="https://ci.inria.fr/gemoc/job/gemoc-studio_official_samples_deployer/lastSuccessfulBuild/artifact/official_samples/sample.deployers/releng/org.gemoc.official_samples.deployers.repository/target/repository/">https://ci.inria.fr/gemoc/job/gemoc-studio_official_samples_deployer/lastSuccessfulBuild/artifact/official_samples/sample.deployers/releng/org.gemoc.official_samples.deployers.repository/target/repository/</a></li>            
        </ul>
    </div>
    <div class="col-md-4 col-md-pull-8">
        <img class="img-responsive img-hover" src="{{ page.discoveryBaseURL }}images/bcool-tfsm-activity-320x240.png" alt="">        
    </div>
</div>

## Alternative GEMOC based Engines
Engines and tools proposing alternative approaches (based on GEMOC execution framework)

<!-- GEMOC xMOF Engine  -->
<div class="row">    
    <div class="col-md-8 col-md-push-4">    	
        <h3><img src="{{ page.discoveryBaseURL }}images/xmof-icon-30x30.png" alt="">
         GEMOC xMOF Engine <small>by Vienna University of Technology</small></h3>
        <p>xMOF allows you to define the execution semantics of your language with UML activity diagrams.</p>
        <p>The xMOF language allows you to define the execution semantics of your language with UML activity diagrams. This component provides the xMOF language, editor and execution engine, as well as wizards helping you to setup your xMOF projects.
        <a href="https://github.com/moliz/moliz.xmof">Learn more</a></p>

        <h4>Update site</h4>
        <ul>
            <li><a href="http://moliz.github.io/moliz.gemoc/updatesite/nightly/">http://moliz.github.io/moliz.gemoc/updatesite/nightly/</a></li>            
        </ul>
    </div>
    <div class="col-md-4 col-md-pull-8">
        <img class="img-responsive img-hover" src="{{ page.discoveryBaseURL }}images/xmof-figure-320x240.png" alt="">        
    </div>
</div>

## Exhaustive Exploration
Tools for Exhaustive Exploration.

<!-- Clocksystem  -->
<div class="row">    
    <div class="col-md-8 col-md-push-4">    	
        <h3><img src="{{ page.discoveryBaseURL }}images/clocksystem_logo_32x32.png" alt="">
         Clocksystem <small>by ENSTA</small></h3>
        <p>Multiform Time Constraints.</p>
        <p>Clocksystem is meta-described clock-constraint engine, which embeds a formal model of logical time into the Smalltalk general-purpose language and environment.</p>
        
        <h4>Update site</h4>
        <ul>
            <li><a href="https://ci.inria.fr/gemoc/job/concurrency_exploration/lastSuccessfulBuild/artifact/exploration/releng/org.gemoc.mocc.clocksystem.features.updatesite/target/repository">https://ci.inria.fr/gemoc/job/concurrency_exploration/lastSuccessfulBuild/artifact/exploration/releng/org.gemoc.mocc.clocksystem.features.updatesite/target/repository</a></li>
        </ul>
    </div>
    <div class="col-md-4 col-md-pull-8">
        <a href="{{ page.discoveryBaseURL }}images/cs_screenshot_320x240.png">
            <img class="img-responsive img-hover" src="{{ page.discoveryBaseURL }}images/cs_screenshot_320x240.png" alt="">
        </a>
    </div>
</div>

## Modeler
Modeling environment tools.

<!-- UML Designer  -->
<div class="row">    
    <div class="col-md-8 col-md-push-4">    	
        <h3><img src="{{ page.discoveryBaseURL }}images/umldesigner.png" alt="">
         UML Designer <small>by Obeo</small></h3>
        <p>Graphical tooling to edit and visualize UML models.</p>
        <p>UML Designer provides a set of common diagrams to work with UML 2.5 models. The intent is to provide an easy way to make the transition from UML to domain specific modeling. This way users can continue to manipulate legacy UML models and start working with DSL. Users can even re-use the provided representations and work in a total transparence on both UML and DSL models at the same time.
        <a href="http://www.umldesigner.org/">Learn more</a></p>

        <h4>Update site</h4>
        <ul>
            <li><a href="http://download.eclipse.org/releases/luna/201502271000">http://download.eclipse.org/releases/luna/201502271000</a></li>
            <li><a href="http://download.eclipse.org/sirius/updates/nightly/3.0.x/luna<">http://download.eclipse.org/sirius/updates/nightly/3.0.x/luna</a></li>
            <li><a href="http://releases.umldesigner.org/5.0.1/repository/">http://releases.umldesigner.org/5.0.1/repository/</a></li>
        </ul>
    </div>
    <div class="col-md-4 col-md-pull-8">
        <a href="{{ page.discoveryBaseURL }}images/umldesigner-screenshot-320x240.png">
            <img class="img-responsive img-hover" src="{{ page.discoveryBaseURL }}images/umldesigner-screenshot-320x240.png" alt="">
        </a>
    </div>
</div>

## Alternative Tools
Engines and tools proposing alternative approaches (may not directly use GEMOC execution framework)

<!-- ALE  -->
<div class="row">    
    <div class="col-md-8 col-md-push-4">    	
        <h3><img src="{{ page.discoveryBaseURL }}images/modeling32.png" alt="">
          ALE <small>by Inria and Obeo</small></h3>
        <p>Action Language for EMF.</p>
        <p>Ale is a language to define behaviors on the top of Ecore models. It is intended to be distributed in EcoreTools and will be an alternative to K3.
        <a href="http://gemoc.org/ale-lang/">Learn more</a></p>

        <h4>Update site</h4>
        <ul>
            <li><a href="https://ci.inria.fr/gemoc/job/ale-lang/lastSuccessfulBuild/artifact/releng/org.eclipse.emf.ecoretools.ale.updatesite/target/repository/">https://ci.inria.fr/gemoc/job/ale-lang/lastSuccessfulBuild/artifact/releng/org.eclipse.emf.ecoretools.ale.updatesite/target/repository/</a></li>            
        </ul>
    </div>
    <div class="col-md-4 col-md-pull-8">
        <!-- <img class="img-responsive img-hover" src="{{ page.discoveryBaseURL }}images/tesl-screenshot-320x240.png" alt=""> -->        
    </div>
</div>

<!-- TESL Engine and Editor  -->
<div class="row">    
    <div class="col-md-8 col-md-push-4">    	
        <h3>TESL Engine and Editor <small>by CentraleSup&#xe9;lec/LRI</small></h3>
        <p>The Tagged Event Specification Language allows the specification of timed systems by modeling events as clocks and occurrences of an event as ticks on its clock.</p>
        <p>The Tagged Event Specification Language allows the specification of timed systems by modeling events as clocks and occurrences of an event as ticks on its clock.
        <a href="http://wwwdi.supelec.fr/software/TESL/">Learn more</a></p>

        <h4>Update site</h4>
        <ul>
            <li><a href="http://wwwdi.supelec.fr/tesl-update-site">http://wwwdi.supelec.fr/tesl-update-site</a></li>            
        </ul>
    </div>
    <div class="col-md-4 col-md-pull-8">
        <img class="img-responsive img-hover" src="{{ page.discoveryBaseURL }}images/tesl-screenshot-320x240.png" alt="">        
    </div>
</div>