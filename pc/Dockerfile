FROM openjdk:8-jdk-alpine
EXPOSE 8080
ADD target/pc-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT exec java -jar /app.jar