FROM openjdk:8-jdk-alpine
ADD target/eureka-0.0.1-SNAPSHOT.jar eureka.jar
EXPOSE 8080
ENTRYPOINT exec java -jar /eureka.jar