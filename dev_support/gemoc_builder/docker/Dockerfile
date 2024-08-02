###############################################################
# Image content overview:
# - ubuntu 
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


FROM ubuntu:24.04

ARG MAVEN_VERSION=3.9.8
ARG MAVEN_BASE_URL=https://archive.apache.org/dist/maven/maven-3/${MAVEN_VERSION}/binaries

# nvm environment variables
#ENV NVM_DIR=/usr/local/nvm
#ENV NODE_VERSION=20.15.1

ARG DOCKER_USER=ubuntu

# ubuntu user already exists in base image
#RUN groupadd  $DOCKER_USER
#RUN useradd  -ms /bin/bash -d /home/$DOCKER_USER -g $DOCKER_USER $DOCKER_USER

#RUN addgroup "$DOCKER_USER" \
# 	&& adduser "$DOCKER_USER" -G "$DOCKER_USER"
 
RUN apt update && apt upgrade -y && apt install -y  --no-install-recommends \
	gosu

COPY scripts/entrypoint /entrypoint
RUN chmod 0755 /entrypoint \
	&& sed "s/\$DOCKER_USER/$DOCKER_USER/g" -i /entrypoint
#RUN chmod u+x /usr/local/bin/uid_entrypoint && \
#    chgrp 0 /usr/local/bin/uid_entrypoint && \
#    chmod g=u /usr/local/bin/uid_entrypoint /etc/passwd
ENTRYPOINT [ "/entrypoint" ]

#ENV DEBIAN_FRONTEND noninteractive

# 	libgtk-3-0=3.18.* 

RUN apt update && apt upgrade -y && apt install -y  --no-install-recommends\
	language-pack-en-base \
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
	fonts-dejavu-extra \
	moreutils \
	zip \
	unzip \
	curl \
	wget \
	graphviz

# Java

RUN apt-get install -y  --no-install-recommends \
	openjdk-17-jdk \
	openjfx 

RUN wget https://download2.gluonhq.com/openjfx/17.0.2/openjfx-17.0.2_linux-x64_bin-sdk.zip  -O ${HOME}/openjfx-17.0.2_linux-x64_bin-sdk.zip 
RUN unzip ${HOME}/openjfx-17.0.2_linux-x64_bin-sdk.zip -d /usr/share/
RUN rm ${HOME}/openjfx-17.0.2_linux-x64_bin-sdk.zip 

ENV JAVAFX_HOME=/usr/share/javafx-sdk-17.0.2
	
# install maven 
RUN mkdir -p /usr/share/maven /usr/share/maven/ref \
 && curl -fsSL -o /tmp/apache-maven.tar.gz ${MAVEN_BASE_URL}/apache-maven-${MAVEN_VERSION}-bin.tar.gz \
 && tar -xzf /tmp/apache-maven.tar.gz -C /usr/share/maven --strip-components=1 \
 && rm -f /tmp/apache-maven.tar.gz \
 && ln -s /usr/share/maven/bin/mvn /usr/bin/mvn
ENV MAVEN_HOME=/usr/share/maven



# Headless UI Management

RUN apt-get install -y  --no-install-recommends \
	sddm \	
	openbox \
	dbus \
	dbus-x11
	 
# added in an attempt to capture a video of the x display while running UI tests
# cf. https://malinowski.dev/recording-headless-selenium-tests-to-mp4.html
RUN apt update && apt upgrade -y && apt install -y  --no-install-recommends\
	ffmpeg \
	tmux

ENV HOME=/home/$DOCKER_USER


# install NodeJs via nvm
USER $DOCKER_USER
ENV NODE_VERSION=20.16.0
RUN curl -o- https://raw.githubusercontent.com/nvm-sh/nvm/v0.39.7/install.sh | bash 
ENV NVM_DIR=$HOME/.nvm
RUN . "$NVM_DIR/nvm.sh" && nvm install ${NODE_VERSION}
RUN . "$NVM_DIR/nvm.sh" && nvm use v${NODE_VERSION}
RUN . "$NVM_DIR/nvm.sh" && nvm alias default v${NODE_VERSION}
ENV PATH="${HOME}/.nvm/versions/node/v${NODE_VERSION}/bin/:${PATH}"
RUN node --version
RUN npm --version  
USER root

# avoid "library appears to be incorrectly set up; failed to read machine uuid: UUID file '/etc/machine-id' should contain a hex string of length 32" when launching x 
# cf http://www.torkwrench.com/2011/12/16/d-bus-library-appears-to-be-incorrectly-set-up-failed-to-read-machine-uuid-failed-to-open-varlibdbusmachine-id/ and https://github.com/activatedgeek/docker-videostack/issues/1
RUN dbus-uuidgen > /var/lib/dbus/machine-id
RUN mkdir -p ${HOME}/.cache && \
	chmod 1777 ${HOME}/.cache \
    && chown -R $DOCKER_USER:$DOCKER_USER ${HOME}/.cache

# avoid _XSERVTransmkdir: ERROR: euid != 0,directory /tmp/.X11-unix will not be created.
RUN mkdir /tmp/.X11-unix && \
	chmod 1777 /tmp/.X11-unix && \
	chown $DOCKER_USER /tmp/.X11-unix/


# Create an .Xauthority file
RUN touch ${HOME}/.Xauthority \
    && chown -R $DOCKER_USER:$DOCKER_USER ${HOME}/.Xauthority

# Set display resolution (change as needed)
ENV RESOLUTION=1024x780

ENV DISPLAY=:1

# Expose VNC port
EXPOSE 5901

# VNC support
RUN apt update && apt upgrade -y && apt install -y  --no-install-recommends\
    tightvncserver

RUN apt update && apt upgrade -y && apt install -y  --no-install-recommends\
    xterm

# Setup VNC server
RUN mkdir ${HOME}/.vnc \
    && echo "password" | vncpasswd -f > ${HOME}/.vnc/passwd \
    && chmod 600 ${HOME}/.vnc/passwd \
    && chown -R $DOCKER_USER:$DOCKER_USER ${HOME}/.vnc
    
# Copy a script to start the VNC server
COPY scripts/start-vnc.sh ${HOME}/
RUN chmod +x ${HOME}/start-vnc.sh

# additionnal helper build scripts
COPY scripts/tycho_build.sh ${HOME}/
RUN chmod a+x ${HOME}/tycho_build.sh
COPY scripts/pomfirst_build.sh ${HOME}/
RUN chmod a+x ${HOME}/pomfirst_build.sh
COPY scripts/generate_protocols.sh ${HOME}/
RUN chmod a+x ${HOME}/generate_protocols.sh

RUN chown -R $DOCKER_USER:$DOCKER_USER ${HOME}




# some cleanup
RUN apt-get clean && rm -rf /var/lib/apt/lists/* /tmp/* /var/tmp/*

# switch to default user
#USER 1000
WORKDIR ${HOME}

#RUN useradd -u 1000 -ms /bin/bash ci
#RUN useradd -r -u 1000 -g ci ci

# explicitly set locale
ENV LANG=en_US.UTF-8


#USER ci

#ENTRYPOINT ["bash", "./entrypoint.sh"]

