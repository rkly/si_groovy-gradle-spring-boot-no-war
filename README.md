groovy-gradle-spring-boot [![Build Status](https://travis-ci.org/lars-gentsch-fhb/groovy-gradle-spring-boot.svg?branch=master)](https://travis-ci.org/lars-gentsch-fhb/groovy-gradle-spring-boot)
=========================

Simple project to demonstrate Spring-Boot with Groovy and Gradle.

Spring-Boot run as WAR:

http://spring.io/guides/gs/convert-jar-to-war/#initial
    
The Gradle jetty-plugin is outdated -> uses Jetty 6.1 but at least Jetty 7 is needed for Servlet-API 3.0 an XML-less web app configuration!

So this project uses the [gradle-jetty-eclipse-plugin](https://github.com/Khoulaiz/gradle-jetty-eclipse-plugin) instead.
