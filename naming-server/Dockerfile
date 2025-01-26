FROM amazoncorretto:21-alpine-jdk
LABEL authors="win"
COPY target/naming-server.jar naming-server.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "naming-server.jar"]