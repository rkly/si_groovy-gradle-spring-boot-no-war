FROM ubuntu:latest
MAINTAINER docker@fhb.de

RUN apt-get update
RUN apt-get install openjdk-7-jre-headless -y

ADD ./target/libs/groovy-gradle-spring-boot-no-war-1.0.jar /service.jar

EXPOSE 8080
ENTRYPOINT java -jar /service.jar
