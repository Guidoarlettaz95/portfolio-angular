FROM maven:3.6.2-amazoncorretto-11 AS build
COPY . .
RUN mvn clean package

FROM amazoncorretto:11-alpine-jdk
COPY  target/guido-0.0.1-SNAPSHOT.jar guido.jar

ENTRYPOINT ["java","-jar","guido.jar"]
