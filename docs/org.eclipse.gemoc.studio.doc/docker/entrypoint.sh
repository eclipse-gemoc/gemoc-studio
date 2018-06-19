#!/bin/bash

# compile documentation
mvn -f /root/src/gemoc-studio/docs/org.eclipse.gemoc.studio.doc/pom.xml clean package

# set owner to default system user
chown 1000:1000 -R /root/src/gemoc-studio/docs/org.eclipse.gemoc.studio.doc/target