FROM openjdk:8-jdk-alpine
ARG JAR_FILE
ADD target/${JAR_FILE} app.jar
EXPOSE 8764
ENTRYPOINT ["java", "-jar", "/app.jar"]