#!/bin/bash



showBranchForFolder () {
   local originFolder=`pwd`
   cd $1
   echo $1 is on branch `git rev-parse --abbrev-ref HEAD`
#   echo -e "$1 is on branch \t `git branch | grep '*'`"
   cd $originFolder
}

echo "##### BRANCH SUMMARY ####"
cd $1
for D in *; do
    if [ -d "${D}" ]; then
	showBranchForFolder ${D}
    fi
done

