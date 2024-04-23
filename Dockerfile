FROM openjdk:21-jdk

WORKDIR /src

COPY target/your-java-app.jar /app/your-java-app.jar

CMD ["java", "-jar", "your-java-app.jar"]