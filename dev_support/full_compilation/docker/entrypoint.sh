#!/bin/bash

# compile full gemoc studio
xvfb-run mvn -f /root/src/gemoc-studio/dev_support/full_compilation/pom.xml clean verify --errors -X

# set owner to default system user
chown 1000:1000 -R /root/src/gemoc-studio
chown 1000:1000 -R /root/src/gemoc-studio-modeldebugging
