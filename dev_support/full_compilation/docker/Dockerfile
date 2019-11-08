FROM ubuntu:xenial
RUN apt-get update ; \
	apt-get install -y software-properties-common python-software-properties xvfb maven graphviz libswt-gtk-3-jni libswt-gtk-3-java;\ 
	add-apt-repository ppa:webupd8team/java ; \
	apt-get update ; \
	echo oracle-java7-installer shared/accepted-oracle-license-v1-1 select true | /usr/bin/debconf-set-selections && \
	apt-get install -y oracle-java8-installer
COPY entrypoint.sh .
ENTRYPOINT ["bash", "./entrypoint.sh"]
