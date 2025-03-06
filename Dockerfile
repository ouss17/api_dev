# FROM maven:3-amazoncorretto-17-alpine

# WORKDIR /app

# EXPOSE 8080

# CMD ["mvn", "spring-boot:run"]

FROM openjdk:17-slim

RUN apt-get update && apt-get install -y maven

WORKDIR /app

CMD [ "mvn", "spring-boot:run" ]