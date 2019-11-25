#!/bin/bash

echo arguments seen: $1

Xvfb :99 &
export DISPLAY=:99

#$HOME/.vnc/xstartup.sh

cd $HOME/src/gemoc-studio/dev_support/full_compilation/

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
	"linux") 
		echo "-------- compile gemoc studio for linux only in online (install in .m2) --------"
		mvn -P test_linux clean install --errors  --show-version;;
	"linux_no_system_test") 
		echo "-------- compile gemoc studio for linux only no system tests, online, install in .m2 --------"
		mvn -P test_linux --projects !../../gemoc_studio/tests/org.eclipse.gemoc.studio.tests.system.lwb,!../../gemoc_studio/tests/org.eclipse.gemoc.studio.tests.system.mwb    clean install --errors  --show-version;;	
    "linux_no_system_test_offline") 
		echo "-------- compile gemoc studio for linux only no system tests, offline, install in .m2 --------"
		mvn -o -P test_linux --projects !../../gemoc_studio/tests/org.eclipse.gemoc.studio.tests.system.lwb,!../../gemoc_studio/tests/org.eclipse.gemoc.studio.tests.system.mwb  clean install --errors  --show-version;;	
	"linux_offline") 
		echo "-------- compile gemoc studio for linux only (offline) (install in .m2) --------"
		mvn -o -P test_linux clean install --errors  --show-version;;
	"linux_system_test_only") 
		echo "-------- running system tests only ------------"
		mvn -P test_linux --projects ../../gemoc_studio/tests/org.eclipse.gemoc.studio.tests.system.lwb,../../gemoc_studio/tests/org.eclipse.gemoc.studio.tests.system.mwb verify --errors  --show-version;;
	*)		
		echo "command $1 not recognized, possible arguments: linux_system_test_only, linux_no_system_test, linux_no_system_test_offline, full, linux_offline" ;;
	esac
fi

