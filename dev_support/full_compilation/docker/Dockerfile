###############################################################
# Image content overview:
# - ubuntu 16.04
# - graphviz
# - openjdk8, openfx, maven 3.6.0
# - Xvfb
# - helper build script for gemoc
# user id support (for correct ownership of produced files)
# the docker file is greatly inspired from images at https://github.com/eclipse-cbi/dockerfiles
###############################################################
# Rationale:
# main goal : be able to be usable both in jenkins (on jenkins.eclipse.org new infrastructure) and locally by developpers
# version selection: 
# - due to bug in recent version of graphviz we must stick to an older version (cf. https://forum.plantuml.net/5425/relation-long-with-graphviz-using-labels-relations-namespace)
#   the quickest workaround was to use an older version of ubuntu that has graphviz 2.39.x
# - use of Xvfb instead of vnc (unlike images from  https://github.com/eclipse-cbi/dockerfiles)
#		this is because ubuntu 16 use tighvnc instead of tigervnc and tighvnc doesn't support the passwordFile option)
# - openjdk8 + openjfx : due to recent change in oracle java distribution license
###############################################################


FROM ubuntu:16.04

### user name recognition at runtime w/ an arbitrary uid - for OpenShift deployments
COPY scripts/uid_entrypoint /usr/local/bin/uid_entrypoint
RUN chmod u+x /usr/local/bin/uid_entrypoint && \
    chgrp 0 /usr/local/bin/uid_entrypoint && \
    chmod g=u /usr/local/bin/uid_entrypoint /etc/passwd
ENTRYPOINT [ "uid_entrypoint" ]

#ENV DEBIAN_FRONTEND noninteractive

RUN apt-get update && apt-get install -y --no-install-recommends \
	libgtk-3-0=3.18.* \
	language-pack-en-base \
	metacity \
	x11-xserver-utils \
	libgl1-mesa-dri \
	xfonts-base \
	xfonts-scalable \
	xfonts-100dpi \
	xfonts-75dpi \
	fonts-liberation \
	fonts-freefont-ttf \
	fonts-dejavu \
	fonts-dejavu-core \
	fonts-dejavu-extra

RUN apt-get update && apt-get install -y --no-install-recommends \
	graphviz \
	xvfb 

RUN apt-get install -y  --no-install-recommends \
	openjdk-8-jdk \
	openjfx \
	maven

RUN apt-get install -y  --no-install-recommends \	
	dbus
	 
# added in an attempt to capture a video of the x display while running UI tests
# cf. https://malinowski.dev/recording-headless-selenium-tests-to-mp4.html
RUN apt-get install -y \
	ffmpeg \
	tmux

# some cleanup
RUN rm -rf /var/lib/apt/lists/*

ENV HOME=/home/jenkins

# avoid "library appears to be incorrectly set up; failed to read machine uuid: UUID file '/etc/machine-id' should contain a hex string of length 32" when launching x 
# cf http://www.torkwrench.com/2011/12/16/d-bus-library-appears-to-be-incorrectly-set-up-failed-to-read-machine-uuid-failed-to-open-varlibdbusmachine-id/ and https://github.com/activatedgeek/docker-videostack/issues/1
RUN dbus-uuidgen > /var/lib/dbus/machine-id
RUN mkdir -p ${HOME}/.cache && \
	chmod 1777 ${HOME}/.cache
# explicitly set locale
ENV LANG=en_US.UTF-8

# avoid _XSERVTransmkdir: ERROR: euid != 0,directory /tmp/.X11-unix will not be created.
RUN mkdir /tmp/.X11-unix && \
	chmod 1777 /tmp/.X11-unix && \
	chown root /tmp/.X11-unix/
# probably not required during image build
RUN Xvfb :99 &
ENV DISPLAY :99



# additionnal helper build scripts
COPY scripts/build_gemoc.sh ${HOME}/
RUN chmod a+x ${HOME}/build_gemoc.sh


# switch to default user
USER 10001
WORKDIR ${HOME}

#RUN useradd -u 1000 -ms /bin/bash ci
#RUN useradd -r -u 1000 -g ci ci

 

#USER ci

#ENTRYPOINT ["bash", "./entrypoint.sh"]

