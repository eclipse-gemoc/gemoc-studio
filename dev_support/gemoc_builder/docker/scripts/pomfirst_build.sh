#!/bin/bash

echo arguments seen: $1

id -a
echo HOME=$HOME

cd $HOME/src/gemoc-studio/dev_support/pomfirst_full_compilation/

pwd

if [ -z "$1" ]
then
	echo "---------- compile gemoc pomfirst (clean verify) -----------"
	mvn clean verify --errors  --show-version
else
	case $1 in
	"full") 
		echo "-------- compile gemoc pomfirst (and install in .m2) --------"
		mvn -Dmaven.test.failure.ignore \
			dependency:tree dependency:analyze dependency:analyze-dep-mgt \
			clean install \
			--errors --show-version --batch-mode;;
	"clean") 
		echo "-------- clean --------"
		mvn clean --errors  --show-version  --batch-mode;;
	*)		
		echo "command $1 not recognized, possible arguments: full, clean" ;;
	esac
fi

