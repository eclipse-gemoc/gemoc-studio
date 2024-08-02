#!/bin/bash

echo arguments seen: $1

#Xvfb :99 &
#export DISPLAY=:99

#$HOME/.vnc/xstartup.sh

$HOME/start-vnc.sh


cd $HOME/src/gemoc-studio/dev_support/tycho_full_compilation/

pwd

if [ -z "$1" ]
then
	echo "---------- compile full gemoc studio (clean verify) -----------"
	mvn clean verify --errors  --show-version
else
	case $1 in
	"full") 
		echo "-------- compile full gemoc studio (and install in .m2) --------"
		mvn clean install --errors  --show-version;;
	"clean") 
		echo "-------- clean --------"
		mvn clean --errors  --show-version;;
	"linux") 
		echo "-------- compile gemoc studio for linux only in online (and install in .m2)  --------"
		mvn -P test_linux clean install --errors  --show-version --batch-mode;;
	"linux_no_system_test") 
		echo "-------- compile gemoc studio for linux only no system tests, online (and install in .m2) --------"
		mvn -P test_linux --projects !../../gemoc_studio/tests/org.eclipse.gemoc.studio.tests.system.lwb,!../../gemoc_studio/tests/org.eclipse.gemoc.studio.tests.system.mwb  \
									-Djava.awt.headless=true \
									clean install \
									--errors  --show-version --batch-mode;;	
    "linux_no_system_test_offline") 
		echo "-------- compile gemoc studio for linux only no system tests, offline, install in .m2 --------"
		mvn -o -P test_linux --projects !../../gemoc_studio/tests/org.eclipse.gemoc.studio.tests.system.lwb,!../../gemoc_studio/tests/org.eclipse.gemoc.studio.tests.system.mwb  \
									-Djava.awt.headless=true \
									clean install \
									--errors  --show-version;;	
	"linux_offline") 
		echo "-------- compile gemoc studio for linux only (offline) (install in .m2) --------"
		mvn -o -P test_linux clean install --errors  --show-version;;
	"linux_system_test_only") 
		echo "-------- running system tests only ------------"
		mvn -P test_linux -Dmaven.test.failure.ignore --projects ../../gemoc_studio/tests/org.eclipse.gemoc.studio.tests.system.lwb,../../gemoc_studio/tests/org.eclipse.gemoc.studio.tests.system.mwb,../../gemoc_studio/releng/org.eclipse.gemoc.gemoc_studio.targetplatform clean verify --errors  --show-version;;
	"tycho_dependencies") 
		echo "-------- show tycho dependencies  ------------"
		mvn -P test_linux org.eclipse.tycho:tycho-p2-plugin:dependency-tree;;
	*)		
		echo "command $1 not recognized, possible arguments: full, clean, linux, linux_system_test_only, linux_no_system_test, linux_no_system_test_offline, linux_offline, tycho_dependencies" ;;
	esac
fi

