# Building this plugin in Eclipse

On first import from git, the external jars are not retrieved yet and you'll have errors in your workspace.
In order to retrieve the jars, simply run the maven command:
```
mvn generate-sources
```
then do a refresh.

This will copy _commons-cli.jar_ and _commons-cli-sources.jar_ in the appropriate folders.