FROM amazoncorretto:21-alpine-jdk
LABEL authors="win"
COPY target/category.jar category.jar
EXPOSE 8082
ENTRYPOINT ["java", "-jar", "category.jar"]