#!/bin/bash

echo arguments seen: $1

cd $HOME/src/gemoc-studio-modeldebugging/protocols/generators/ts/JSONSchema2APIProtocolGenerator

pwd

if [ -z "$1" ]
then
	echo "---------- generate protocols classes -----------"
	npm config ls
	npm install
	npm run build
	npm run generate
else
	case $1 in
	"full") 
		echo "-------- compile full gemoc studio (and install in .m2) --------"
		npm config ls
		npm install
		npm run build
		npm run generate;;
	*)		
		echo "command $1 not recognized, possible arguments: full" ;;
	esac
fi

