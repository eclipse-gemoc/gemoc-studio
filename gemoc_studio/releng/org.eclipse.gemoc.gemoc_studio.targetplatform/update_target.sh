#!/bin/bash

#set -o xtrace

export ECLIPSE_PLATFORM_ARCHIVE=eclipse-platform-4.22-linux-gtk-x86_64.tar.gz
export ECLIPSE_PLATFORM_URL="https://www.eclipse.org/downloads/download.php?file=/eclipse/downloads/drops4/R-4.22-202111241800/eclipse-platform-4.22-linux-gtk-x86_64.tar.gz&r=1"


if [[ ! -d eclipse ]]
then
  rm -rf $ECLIPSE_PLATFORM_ARCHIVE
  echo "Downloading eclipse platform..."
  wget -nv -O $ECLIPSE_PLATFORM_ARCHIVE  "$ECLIPSE_PLATFORM_URL" 

  echo "Extracting eclipse platform..."
  tar -xzf $ECLIPSE_PLATFORM_ARCHIVE

  echo "Installing TPD tool in eclipse platform..."
  ./eclipse/eclipse -nosplash -application org.eclipse.equinox.p2.director \
    -repository http://download.eclipse.org/cbi/tpd/3.0.0-SNAPSHOT/,http://download.eclipse.org/releases/2021-12/ \
    -destination ./eclipse/ \
    -installIU org.eclipse.cbi.targetplatform-feature.feature.group
else
   echo "Eclipse platform already installed, skipping platform download"
fi

echo "Updating gemoc_studio.target from gemoc_studio.tpd definition..."
#use eclipse app to update the target
./eclipse/eclipse -nosplash -application org.eclipse.cbi.targetplatform.tpd.converter gemoc_studio.tpd