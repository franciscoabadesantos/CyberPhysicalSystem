# Build stage
FROM maven:3.8.4-openjdk-11 as build

COPY src /usr/src/app/src
COPY pom.xml /usr/src/app
RUN mvn -f /usr/src/app/pom.xml clean package

# Run stage
FROM openjdk:11-jre-slim
COPY --from=build /usr/src/app/target/javaserver-1.0-SNAPSHOT.jar /usr/app/javaserver.jar
EXPOSE 50052
ENTRYPOINT ["java", "-jar", "/usr/app/javaserver.jar"]
