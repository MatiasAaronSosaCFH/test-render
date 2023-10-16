#IMAGE
FROM openjdk:17-jdk-alpine
#JAR
COPY target/remaster-0.0.1-SNAPSHOT.jar java-app.jar
#COMANDO DE INICIO
ENTRYPOINT ["java", "-jar","java-app.jar"]