#!/bin/bash

#echo 'Updating /etc/hosts file...'
#HOSTNAME=$(hostname)
#echo "127.0.1.1\t$HOSTNAME" >> /etc/hosts

export USER=`whoami`
echo "USER=$USER"

echo "Starting VNC server at $RESOLUTION..."
vncserver -kill $DISPLAY || true
vncserver -geometry $RESOLUTION -depth 16 $DISPLAY &
