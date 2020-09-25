FROM openjdk:8
EXPOSE 8080
ADD target/spring-docker-service.jar spring-docker-service.jar
ENTRYPOINT ["java","-jar","spring-docker-service.jar"]