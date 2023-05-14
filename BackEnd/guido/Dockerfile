FROM maven:3.8.4-openjdk-17 AS build
COPY . .
RUN mvn clean package

FROM openjdk:17-jdk-slim
COPY --from=build target/guido-0.0.1-SNAPSHOT guido.jar
ENTRYPOINT ["java","-jar","/guido.jar"]
