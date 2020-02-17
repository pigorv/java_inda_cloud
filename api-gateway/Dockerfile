FROM openjdk:8-jdk-alpine
ADD target/api-gateway-0.0.1-SNAPSHOT.jar app-gateway.jar
EXPOSE 8080
ENTRYPOINT exec java -jar /app-gateway.jar