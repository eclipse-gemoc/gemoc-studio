FROM eclipsecbi/jiro-agent-centos-8:remoting-3107.v665000b_51092
# based on https://github.com/eclipse-cbi/jiro-agents/blob/master/centos-8/Dockerfile

ARG MAVEN_VERSION=3.9.8
ARG MAVEN_BASE_URL=https://apache.osuosl.org/maven/maven-3/${MAVEN_VERSION}/binaries


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
    java-17-openjdk-devel \
    nodejs \
    unzip \
    zip \
  && dnf clean all

RUN alternatives --install /usr/bin/java java /usr/lib/jvm/java-17-openjdk/bin/java 1000 --family java-17-openjdk.x86_64 \
  && alternatives --set java /usr/lib/jvm/java-17-openjdk/bin/java
RUN alternatives --install /usr/bin/javac javac /usr/lib/jvm/java-17-openjdk/bin/javac 1000 --family java-17-openjdk.x86_64 \
  && alternatives --set javac /usr/lib/jvm/java-17-openjdk/bin/javac
  
# Define commonly used JAVA_HOME variable
ENV JAVA_HOME /usr/lib/jvm/java-17-openjdk/

RUN wget https://download2.gluonhq.com/openjfx/17.0.2/openjfx-17.0.2_linux-x64_bin-sdk.zip  -O ${HOME}/openjfx-17.0.2_linux-x64_bin-sdk.zip 
RUN unzip ${HOME}/openjfx-17.0.2_linux-x64_bin-sdk.zip -d /usr/share/
RUN rm ${HOME}/openjfx-17.0.2_linux-x64_bin-sdk.zip 

ENV JAVAFX_HOME=/usr/share/javafx-sdk-17.0.2

# install maven (not used in jenkins due to toolchain.xml)
RUN mkdir -p /usr/share/maven /usr/share/maven/ref \
 && curl -fsSL -o /tmp/apache-maven.tar.gz ${MAVEN_BASE_URL}/apache-maven-${MAVEN_VERSION}-bin.tar.gz \
 && tar -xzf /tmp/apache-maven.tar.gz -C /usr/share/maven --strip-components=1 \
 && rm -f /tmp/apache-maven.tar.gz \
 && ln -s /usr/share/maven/bin/mvn /usr/bin/mvn
ENV MAVEN_HOME /usr/share/maven

# install memory monitor script file
COPY scripts/memory-monitor/memory-monitor-per-process.py ${HOME}/memory-monitor-per-process.py
RUN python3 -m pip install psutil
RUN chmod 755 ${HOME}/memory-monitor-per-process.py

# switch to jenkins user
USER 10001:0

