FROM openjdk:8
EXPOSE 8080
ADD target/fargate-app.jar fargate-app.jar
ENTRYPOINT ["java","-jar","fargate-app.jar"]