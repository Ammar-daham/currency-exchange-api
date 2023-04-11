FROM openjdk:17-jdk-alpine

EXPOSE 8080

ADD target/exchange-rest-api-docker.jar exchange-rest-api-docker.jar

ENTRYPOINT ["java", "-jar", "/exchange-rest-api-docker.jar"]