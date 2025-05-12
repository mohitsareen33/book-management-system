FROM openjdk:17
WORKDIR /app
COPY target/book-management-system.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
