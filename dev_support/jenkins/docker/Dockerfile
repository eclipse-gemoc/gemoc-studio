FROM eclipsecbi/jiro-agent-centos-8:remoting-3107.v665000b_51092
# based on https://github.com/eclipse-cbi/jiro-agents/blob/master/centos-8/Dockerfile

# Switch to root user
USER root


ENV HOME=/home/jenkins
WORKDIR /home/jenkins

# Node JS 20 cf. https://github.com/nodesource/distributions/blob/master/README.md#debinstall
RUN curl -sL https://rpm.nodesource.com/setup_20.x | bash -


# https://linuxize.com/post/how-to-install-ffmpeg-on-centos-8/
# add repo https://negativo17.org/repos/epel-multimedia.repo

RUN dnf config-manager --add-repo https://negativo17.org/repos/epel-multimedia.repo \
  && dnf install -y \
    ffmpeg \
    nodejs \
    unzip \
    zip \
  && dnf clean all


RUN wget https://download2.gluonhq.com/openjfx/17.0.2/openjfx-17.0.2_linux-x64_bin-sdk.zip  -O ${HOME}/openjfx-17.0.2_linux-x64_bin-sdk.zip 
RUN unzip ${HOME}/openjfx-17.0.2_linux-x64_bin-sdk.zip -d /usr/share/
RUN rm ${HOME}/openjfx-17.0.2_linux-x64_bin-sdk.zip 

ENV JAVAFX_HOME=/usr/share/javafx-sdk-17.0.2

# install memory monitor script file
COPY scripts/memory-monitor/memory-monitor-per-process.py ${HOME}/memory-monitor-per-process.py
RUN python3 -m pip install psutil
RUN chmod 755 ${HOME}/memory-monitor-per-process.py

# switch to jenkins user
USER 10001:0

