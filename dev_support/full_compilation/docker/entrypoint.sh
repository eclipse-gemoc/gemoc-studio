#!/bin/bash

Xvfb :99 &
export DISPLAY=:99

# compile full gemoc studio
mvn -f /root/src/gemoc-studio/dev_support/full_compilation/pom.xml clean verify --errors -X

# set owner to default system user
chown 1000:1000 -R /root/src/gemoc-studio
chown 1000:1000 -R /root/src/gemoc-studio-modeldebugging
