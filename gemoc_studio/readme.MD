# Content
This folder contains the definition of the Eclipse package 
that assembles a full Eclipse application containing GEMOC plugins.

The result of building the pom.xml is an Eclipse application.

# Technical notes
* in order to ease future updates of the Eclipse application, the installed features are referenced as "required" by 
the org.gemoc.gemoc_studio.branding.feature.
* features not strictly part of GEMOC but useful for the studio are referenced in org.gemoc.gemoc_studio.additions.feature.

## How to add a new feature
* add the P2 repository that contains the feature you wish to add to the studio as a repository in the pom.xml.
This must be either in the general Repositories section if the repo is an official distribution or 
in the "use_CI_repositories" profile if the repository is a nightly build (typically build on a Continuous Integration server).
* add the feature as a required dependency  either in org.gemoc.gemoc_studio.branding.feature or org.gemoc.gemoc_studio.additions.feature.
* (Optionnal) if you want to ease the update of this specific feature by the end user, you can also add the repository url to the  gemoc_studio.p2.inf 
file  (in the addRepository part) So the user of the Studio will directly have this repository in the available update site.
