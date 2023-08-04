-------------
This repository is part of a serie of repositories related to [GEMOC Studio](http://eclipse.org/gemoc) :
- https://github.com/eclipse/gemoc-studio
- https://github.com/eclipse/gemoc-studio-modeldebugging
- https://github.com/eclipse/gemoc-studio-execution-ale
- https://github.com/eclipse/gemoc-studio-execution-java
- https://github.com/eclipse/gemoc-studio-execution-moccml
- https://github.com/eclipse/gemoc-studio-moccml
- https://github.com/eclipse/gemoc-studio-commons
-------------

Gemoc Studio
============

This repository contains the code for assembling the [GEMOC Studio](http://gemoc.org/studio.html) hosted in the Eclipse foundation (see [GEMOC project @ Eclipse](http://www.eclipse.org/gemoc)).

It can be downloaded from [gemoc.org/download.html](http://gemoc.org/download.html). (Older builds are available).

Getting help
============
The [contact page](https://projects.eclipse.org/projects/modeling.gemoc/contact) lists all the various ways to interact in the context of the GEMOC Studio. 
As a user of the GEMOC Studio you'll probably be interested by the [![](https://img.shields.io/matrix/xtext:matrix.eclipse.org) matrix channel](https://chat.eclipse.org/#/room/#gemoc-studio:matrix.eclipse.org) , 
the [GEMOC User mailing list](https://dev.eclipse.org/mailman/listinfo/gemoc-users), or the [forum](https://www.eclipse.org/forums/index.php/f/369/).

Reporting issues
============
In case of trouble with the studio, you can use one the issue trackers of the Studio. Since the Studio is an assembly of various tools and components, the precise tracker will depend on the involved component.

* https://github.com/eclipse/gemoc-studio/issues : Main/Global tracker, use this tracker if this is an assembly problem or if you don't know which precise component is affected.
* https://github.com/eclipse/gemoc-studio-modeldebugging/issues : Tracker for issues related to the main framework, to the definition of Sequential languages and to the sequential engine.

(Please note that some older issues are still in the old repositories in the GEMOC github organization https://github.com/gemoc)

Some additional trackers may be used on the repositories of the [GEMOC github organization](https://github.com/gemoc) : typically those related to a given example ( [ActitivityDiagram](https://github.com/gemoc/activitydiagram/issues), [ArduinoModeling](https://github.com/gemoc/arduinomodeling/issues), [ardurobotmodeling](https://github.com/gemoc/ardurobotmodeling/issues))


Contributing
============
If you wish to contribute to the project, you'll find some guidance and tip and tricks on the [project github wiki pages](https://github.com/eclipse/gemoc-studio/wiki).

Development
============
A dedicated section is available in the [documentation](http://download.eclipse.org/gemoc/docs/nightly/_contributing.html).
- Instructions about how to build locally the eclipse studio are available in this readme page https://github.com/eclipse/gemoc-studio/tree/master/dev_support/tycho_full_compilation (or in the [documentation](http://download.eclipse.org/gemoc/docs/nightly/_contributing.html#_compilation_of_the_complete_gemoc_studio)).
- Instructions about how to build locally the pomfirst components are available in this readme page https://github.com/eclipse/gemoc-studio/tree/master/dev_support/pomfirst_full_compilation (or in the [documentation](https://download.eclipse.org/gemoc/docs/nightly/_contributing.html#_compilation_of_the_pom_first_jar)).
- Continuous integration on [Eclipse CI](https://ci.eclipse.org/gemoc/job/gemoc-studio/)
 

