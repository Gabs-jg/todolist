FROM ubuntu:latest AS build

WORKDIR /app

RUN apt-get update
RUN apt-get install -y openjdk-21-jdk maven

COPY . .

RUN mvn clean install

FROM openjdk:21-jdk-slim

WORKDIR /app

EXPOSE 8080

COPY --from=build /app/target/todolist-1.0.0.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]