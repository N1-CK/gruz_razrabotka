FROM openjdk:21-jdk
FROM ubuntu:latest

# Install maven
RUN apt-get update && apt-get install -y maven

WORKDIR /demo
COPY . .
RUN mvn clean -X install

CMD ["mvn", "spring-boot:run"]