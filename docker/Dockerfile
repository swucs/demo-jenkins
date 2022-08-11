FROM openjdk:11-jre-slim

WORKDIR /app

EXPOSE 8080

COPY build/libs/demo-jenkins-0.0.1-SNAPSHOT.jar demo-jenkins.jar

ENTRYPOINT ["java", "-jar", "/app/demo-jenkins.jar"]