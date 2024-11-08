FROM openjdk:21
ADD target/springboot-mongo-docker.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]