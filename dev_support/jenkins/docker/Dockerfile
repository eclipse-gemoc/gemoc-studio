FROM eclipsecbi/centos:8
# based on https://github.com/eclipse-cbi/jiro-agents/blob/master/centos-8/Dockerfile

# Mirrors moved to vault.centos.org after EOL on Dec 31st, 2021
RUN sed -i 's/mirrorlist/#mirrorlist/g' /etc/yum.repos.d/CentOS-* \
  && sed -i 's|#baseurl=http://mirror.centos.org|baseurl=http://vault.centos.org|g' /etc/yum.repos.d/CentOS-*

ENV HOME=/home/jenkins
WORKDIR /home/jenkins

# Node JS 17 cf. https://github.com/nodesource/distributions/blob/master/README.md#debinstall
RUN curl -sL https://rpm.nodesource.com/setup_17.x | bash -


# https://linuxize.com/post/how-to-install-ffmpeg-on-centos-8/
# add repo https://negativo17.org/repos/epel-multimedia.repo


# See https://fedoraproject.org/wiki/EPEL
RUN dnf install -y https://dl.fedoraproject.org/pub/epel/epel-release-latest-8.noarch.rpm \ 
  && dnf install -y https://opensource.wandisco.com/centos/8/git/x86_64/wandisco-git-release-8-1.noarch.rpm \ 
  && dnf install -y 'dnf-command(config-manager)' \
  && dnf config-manager --set-enabled powertools \
  && dnf groupinstall -y "Development Tools" \
  && dnf config-manager --add-repo https://negativo17.org/repos/epel-multimedia.repo \
  && dnf install -y \
    coreutils-single \
    cmake \
    cppcheck \
    glibc-langpack-en \
    graphviz \
    gtk3 \
    ffmpeg \
    ImageMagick \
    java-11-openjdk-devel \
    jq \
    lsof \
    mutter \
    pinentry \
    python3 \
    python3-devel \
    rsync \
    tigervnc \
    tigervnc-server \
    unzip \
    webkitgtk4 \
    wget \
    xorg-x11-server-Xvfb.x86_64 \
    xterm \
    xz \
    zip \
    zsh \
  && dnf clean all

RUN alternatives --install /usr/bin/java java /usr/lib/jvm/java-11-openjdk/bin/java 1000 --family java-11-openjdk.x86_64 \
  && alternatives --set java /usr/lib/jvm/java-11-openjdk/bin/java

RUN wget https://download2.gluonhq.com/openjfx/17.0.2/openjfx-17.0.2_linux-x64_bin-sdk.zip  -O ${HOME}/openjfx-17.0.2_linux-x64_bin-sdk.zip 
RUN unzip ${HOME}/openjfx-17.0.2_linux-x64_bin-sdk.zip -d /usr/share/
RUN rm ${HOME}/openjfx-17.0.2_linux-x64_bin-sdk.zip 

ENV JAVAFX_HOME=/usr/share/javafx-sdk-17.0.2

RUN ln -s /usr/bin/git /usr/local/bin/git \
  && ln -s /bin/bash /usr/local/bin/hipp_shell \
  && if [ ! -a /etc/machine-id ] || [ ! -s /etc/machine-id ]; then dbus-uuidgen > /etc/machine-id; fi

ENV DISPLAY :0

RUN mkdir -p ${HOME}/.vnc && chmod -R 775 ${HOME} \
  && echo "123456" | vncpasswd -f > ${HOME}/.vnc/passwd \
  && chmod 600 ${HOME}/.vnc/passwd

# Create a custom vnc xstartup file
COPY scripts/xstartup_mutter.sh ${HOME}/.vnc/xstartup.sh
RUN chmod 755 ${HOME}/.vnc/xstartup.sh

# install memory monitor script file
COPY scripts/memory-monitor/memory-monitor-per-process.py ${HOME}/memory-monitor-per-process.py
RUN python3 -m pip install psutil
RUN chmod 755 ${HOME}/memory-monitor-per-process.py


# explicitly set locale
ENV LANG=en_US.UTF-8
