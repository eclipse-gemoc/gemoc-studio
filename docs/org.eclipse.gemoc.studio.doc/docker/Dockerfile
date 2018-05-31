FROM ubuntu:xenial
RUN apt-get update && apt-get install -y maven graphviz
COPY entrypoint.sh .
ENTRYPOINT bash ./entrypoint.sh
