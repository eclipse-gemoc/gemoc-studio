# building documentation


In most cases, you can directly call maven to build the documentation:

```
mvn clean package
```

The result is in _target/publish_


In some cases, the compilation may not provide the expected results and the `mvn clean package` command doesn't work correctly on your system. For example, current version of plantuml doesn't work well with latest versions of dot/graphviz (>=2.39) and must use 2.38. (see http://forum.plantuml.net/5425/relation-long-with-graphviz-using-labels-relations-namespace )
For this case, we provide a docker configuration that can be used to compile the documentation in a reproductible environment.

## Docker environment for documentation build

from the `docker` folder, run:

```
docker-compose down && docker-compose up
```

The output is the same: the result is in _target/publish_. 


### Description of the docker env
The _Dockerfile_ defines a docker image with maven and graphviz. It embeds an `entrypoint.sh` script that calls the maven command.
The _docker-compose.yml_ will mount the folder containing all gemoc repositories (ie. the place where you've done `git clone`) 
It also mounts a _cache-m2_ folder in order to speed up the compilation.  

