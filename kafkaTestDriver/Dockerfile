# Use a base image with OpenJDK 17 (or your app's Java version)
FROM openjdk:17-jdk-slim

# Create a working directory for the application
WORKDIR /app

# Copy the built JAR file from the target folder to the container
ARG JAR_FILE=target/kafkaTestDriver-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar

# Expose the port on which the app will run (default is 8080)
EXPOSE 8082

# Define the command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]