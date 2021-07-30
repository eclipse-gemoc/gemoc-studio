FROM centos:7

### user name recognition at runtime w/ an arbitrary uid - for OpenShift deployments
COPY scripts/uid_entrypoint /usr/local/bin/uid_entrypoint
RUN chmod u+x /usr/local/bin/uid_entrypoint && \
    chgrp 0 /usr/local/bin/uid_entrypoint && \
    chmod g=u /usr/local/bin/uid_entrypoint /etc/passwd

# https://github.com/jenkinsci/remoting/blob/master/CHANGELOG.md
ARG REMOTING_VERSION=3.29

# https://github.com/jenkinsci/docker-jnlp-slave/
ARG JNLP_AGENT_SCRIPT_VERSION=3.29-1

RUN curl --create-dirs -sSLo /usr/share/jenkins/slave.jar https://repo.jenkins-ci.org/public/org/jenkins-ci/main/remoting/${REMOTING_VERSION}/remoting-${REMOTING_VERSION}.jar \
  && chmod 755 /usr/share/jenkins \
  && chmod 644 /usr/share/jenkins/slave.jar

ADD https://raw.githubusercontent.com/jenkinsci/docker-jnlp-slave/${JNLP_AGENT_SCRIPT_VERSION}/jenkins-slave /usr/local/bin/jenkins-slave
RUN chmod 555 /usr/local/bin/jenkins-slave && \
  chgrp 0 /usr/local/bin/jenkins-slave && \
  mkdir -p /home/jenkins/.jenkins && \
  mkdir -p /home/jenkins/agent

ENTRYPOINT [ "uid_entrypoint", "jenkins-slave" ]

# Required for python36u
RUN yum install -y yum-utils && \
  yum install -y https://repo.ius.io/ius-release-el7.rpm

# https://linuxize.com/post/how-to-install-ffmpeg-on-centos-7/
RUN rpm -v --import http://li.nux.ro/download/nux/RPM-GPG-KEY-nux.ro
RUN rpm -Uvh http://li.nux.ro/download/nux/dextop/el7/x86_64/nux-dextop-release-0-5.el7.nux.noarch.rpm


RUN yum update -y \
  && yum install -y \
  autoconf \
  automake \
  blas \
  blas-devel \
  createrepo \
  e2fsprogs-devel \
  ffmpeg \
  ffmpeg-devel \
  git \
  graphviz \
  gtk3 \
  ImageMagick \
  ImageMagick-devel \
  lapack \
  lapack-devel \
  libclang \
  libgtk-vnc-2.0-0 \
  libtool \
  libXtst \
  mailx \
  make \
  makeinfo \
  mariadb-libs \
  metacity \
  mutter \
  net-snmp-devel.x86_64 \
  java-11-openjdk-devel \
  openssl-devel.x86_64 \
  patch \
  perl \
  perl-LDAP \
  python-gtk-vnc \
  python36u python36u-libs python36u-devel python36u-pip\
  rpm-build \
  strace \
  subversion \
  sysstat \
  tcl \
  tcpdump \
  tcsh \
  telnet \
  tigervnc \
  tigervnc-server \
  tk \
  unrar \
  unzip \
  vino \
  webkitgtk \
  webkitgtk3 \
  wget \
  xmlstarlet \
  xorg-x11-apps.x86_64 \
  xorg-x11-drv-dummy.x86_64 \
  xorg-x11-drv-evdev.x86_64 \
  xorg-x11-drv-fbdev.x86_64 \
  xorg-x11-drv-keyboard.x86_64 \
  xorg-x11-drv-mouse.x86_64 \
  xorg-x11-drv-synaptics.x86_64 \
  xorg-x11-drv-vmmouse.x86_64 \
  xorg-x11-drv-void.x86_64 \
  xorg-x11-server-Xvfb.x86_64 \
  xterm \
  zip \
  zsh \
  && yum clean all

RUN alternatives --set java /usr/lib/jvm/java-11-openjdk-11.0.12.0.7-0.el7_9.x86_64/bin/java \
  && alternatives --set javac /usr/lib/jvm/java-11-openjdk-11.0.12.0.7-0.el7_9.x86_64/bin/javac
ENV JAVA_HOME /usr/lib/jvm/java-11-openjdk-11.0.12.0.7-0.el7_9.x86_64


# Setting Maven Version that needs to be installed
ARG MAVEN_VERSION=3.8.1 

# Maven
RUN curl -fsSL https://archive.apache.org/dist/maven/maven-3/$MAVEN_VERSION/binaries/apache-maven-$MAVEN_VERSION-bin.tar.gz | tar xzf - -C /usr/share \
  && mv /usr/share/apache-maven-$MAVEN_VERSION /usr/share/maven \
  && ln -s /usr/share/maven/bin/mvn /usr/bin/mvn
ENV M2_HOME /usr/share/maven

ENV HOME=/home/jenkins

RUN wget https://gluonhq.com/download/javafx-11-0-2-sdk-linux  -O ${HOME}/javafx-11-0-2-sdk-linux.zip 
RUN unzip ${HOME}/javafx-11-0-2-sdk-linux.zip -d ${HOME}
RUN rm ${HOME}/javafx-11-0-2-sdk-linux.zip 

ENV JAVAFX_HOME=${HOME}/javafx-sdk-11.0.2

RUN ln -s /usr/bin/git /usr/local/bin/git \
  && ln -s /bin/bash /usr/local/bin/hipp_shell \
  && if [ ! -a /etc/machine-id ] || [ ! -s /etc/machine-id ]; then dbus-uuidgen > /etc/machine-id; fi

ENV DISPLAY :0

RUN mkdir -p ${HOME}/.vnc && chmod -R 775 ${HOME} \
  && echo "123456" | vncpasswd -f > ${HOME}/.vnc/passwd \
  && chmod 644 ${HOME}/.vnc/passwd

# Create a custom vnc xstartup file
COPY scripts/xstartup_mutter.sh ${HOME}/.vnc/xstartup.sh
RUN chmod 755 ${HOME}/.vnc/xstartup.sh

# install memory monitor script file
COPY scripts/memory-monitor/memory-monitor-per-process.py ${HOME}/memory-monitor-per-process.py
RUN python3 -m pip install psutil
RUN chmod 755 ${HOME}/memory-monitor-per-process.py

# explicitly set locale
ENV LANG=en_US.UTF-8

ENV JENKINS_AGENT_WORKDIR=${HOME}/agent
ENV JAVA_OPTS=""
# org.jenkinsci.plugins.gitclient.CliGitAPIImpl.useSETSID=true to allow git client to ssh clone to use passphrase protected keys
ENV JNLP_PROTOCOL_OPTS="-XshowSettings:vm -Xmx256m -Dsun.zip.disableMemoryMapping=true -Dorg.jenkinsci.remoting.engine.JnlpProtocol3.disabled=true -Dorg.jenkinsci.plugins.gitclient.CliGitAPIImpl.useSETSID=true"

ENV JAVA_TOOL_OPTIONS="-XX:+IgnoreUnrecognizedVMOptions -XX:+UseContainerSupport -XX:+UnlockExperimentalVMOptions -XX:+UseCGroupMemoryLimitForHeap"
ENV OPENJ9_JAVA_OPTIONS="-XX:+IgnoreUnrecognizedVMOptions -XX:+UseContainerSupport -XX:+IdleTuningCompactOnIdle -XX:+IdleTuningGcOnIdle -XX:MaxRAMPercentage=64"
ENV IBM_JAVA_OPTIONS="-XX:+IgnoreUnrecognizedVMOptions -XX:+UseContainerSupport -XX:+IdleTuningCompactOnIdle -XX:+IdleTuningGcOnIdle -XX:MaxRAMPercentage=64"
ENV _JAVA_OPTIONS="-XX:MaxRAMPercentage=64.0"

WORKDIR /home/jenkins

USER 10001:0
