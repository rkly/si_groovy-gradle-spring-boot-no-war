groovy-gradle-spring-boot [![Build Status](https://travis-ci.org/lars-gentsch-fhb/groovy-gradle-spring-boot-no-war.svg?branch=master)](https://travis-ci.org/lars-gentsch-fhb/groovy-gradle-spring-boot-no-war)
=========================

Simple project to demonstrate Spring-Boot with Groovy and Gradle.

The project has a component test phase. Spring Boot itself is started out of the tests.
    
$ gradle build


FROM ubuntu:latest
MAINTAINER docker@fhb.de

RUN apt-get update
RUN apt-get install openjdk-7-jre-headless -y

ADD ./target/libs/groovy-gradle-spring-boot-no-war-1.0.jar /service.jar

ENV JAVA_HOME /usr/lib/jvm/java-7-oracle

EXPOSE 8080
ENTRYPOINT java -jar /service.jar


Docker statement for Oracle Java 7 installation:

RUN sed 's/main$/main universe/' -i /etc/apt/sources.list
RUN apt-get update && apt-get install -y software-properties-common python-software-properties
RUN add-apt-repository ppa:webupd8team/java -y

RUN apt-get update
RUN echo oracle-java8-installer shared/accepted-oracle-license-v1-1 select true | /usr/bin/debconf-set-selections

RUN apt-get install -y oracle-java8-installer
RUN update-alternatives --config java

ADD ./target/libs/groovy-gradle-spring-boot-no-war-1.0.jar /service.jar

ENV JAVA_HOME /usr/lib/jvm/java-7-oracle


