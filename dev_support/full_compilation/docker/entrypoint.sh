#!/bin/bash

echo arguments seen: $1

Xvfb :99 &
export DISPLAY=:99

if [ -z "$1" ]
then
	echo "---------- compile full gemoc studio -----------"
	mvn -f /root/src/gemoc-studio/dev_support/full_compilation/pom.xml clean install --errors
else
	case $1 in
	"full") 
		echo "-------- compile full gemoc studio --------"
		mvn -f /root/src/gemoc-studio/dev_support/full_compilation/pom.xml clean install --errors ;;
	"linux_offline") 
		echo "-------- compile gemoc studio for linux only in offline --------"
		mvn -o -P lest_linux -f /root/src/gemoc-studio/dev_support/full_compilation/pom.xml clean install --errors ;;
	"system_test_only") 
		echo "-------- running system tests only ------------"
		mvn -f /root/src/gemoc-studio/gemoc_studio/tests/org.eclipse.gemoc.studio.tests.system/ clean verify --errors ;;
	*)		
		echo "command $1 not recognized, possible arguments: system_test_only, full, linux_offline" ;;
	esac
fi
# set owner to default system user
chown 1000:1000 -R /root/src/gemoc-studio
chown 1000:1000 -R /root/src/gemoc-studio-modeldebugging
