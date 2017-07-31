# Compilation of the complete GEMOC Studio

## Introduction

The source code of the [GEMOC Studio](http://gemoc.org/studio/) is currently spread among different git repositories in different github organizations.

This project relies on the presence of the correct git repositories (cloned with the correct name) to locally build a working studio.


## Usage

First checkout the git repositories :

~~~
git clone  https://github.com/gemoc/gemoc-studio
git clone  https://github.com/gemoc/concurrency
git clone  https://github.com/gemoc/coordination
git clone  https://github.com/gemoc/gemoc-studio.wiki
git clone  https://github.com//SiriusLab/ModelDebugging
~~~

Then compile using maven:

~~~
cd gemoc-studio/dev_support/full_build
mvn package -Dmaven.repo.local=$PWD/localm2 -P 'ignore_CI_repositories,!use_CI_repositories'
~~~

We use two options:

- `-Dmaven.repo.local=$PWD/localm2`: use a folder called *localm2* to cache all the external dependencies of the studio, instead of using the user local maven repository. Since the GEMOC Studio has around 1GB of dependencies, this avoids using this much space in a hidden folder of the user home dir.
- `-P 'ignore_CI_repositories,!use_CI_repositories'`: enables the maven profile `ignore_CI_repositories` and disables the profile `use_CI_repositories`, to disable the use of the update sites provided by GEMOC and to make sure that only local content is used.

If you prefer to use your own local maven repository (ie. in <HOME>/.m2/repository), remove the use of `-Dmaven.repo.local`, ie. use this command:

~~~
mvn package -P 'ignore_CI_repositories,!use_CI_repositories'
~~~

If you already compiled and resolved all dependencies at least once (ie. if you filled your local maven repository with everything needed for the build), add the option `-o` to perform an offline only build, which is signficantly faster since it skips checking all maven repositories online. 

In the end, the result can then be found in `gemoc_studio/releng/org.gemoc.gemoc_studio.product/target/products/`, with one studio zip per platform.
