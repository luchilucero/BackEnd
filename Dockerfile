FROM amazoncorretto:11-alpine-jdk 
MAINTAINER Luciana 
COPY target/llf-0.0.1-SNAPSHOT.jar llf-app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/llf-app.jar"]
