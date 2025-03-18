#FROM openjdk:21-ea-17-jdk-slim AS build
#EXPOSE 8080
#ADD target/pesa-lock-backend.jar pesa-lock-backend.jar
#ENTRYPOINT ["java","-jar","pesa-lock-backend.jar"]

FROM maven:3.9.6-eclipse-temurin-21-alpine AS build
WORKDIR /app
ARG SERVER_PORT
COPY pom.xml /app
COPY .mvn .
COPY ./src ./src
COPY . /app
RUN mvn package -DskipTests -X

FROM openjdk:21
COPY --from=build /app/target/*.jar app.jar
EXPOSE ${SERVER_PORT}
CMD ["java", "-jar", "app.jar"]