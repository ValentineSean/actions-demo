FROM openjdk:17-slim-buster as builder

RUN apt-get update && apt-get install -y curl

EXPOSE 8085

ADD target/*.jar /opt/api.jar

WORKDIR /opt

CMD ["java", "-jar", "api.jar"]