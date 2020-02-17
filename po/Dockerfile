FROM openjdk:8-jdk-alpine
EXPOSE 8080
ADD target/po-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT exec java -jar /app.jar