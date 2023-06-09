FROM maven:3.9.2-amazoncorretto-17 as build
WORKDIR /app
COPY ./excel-to-sql/src /app/src
COPY ./excel-to-sql/pom.xml /app
RUN mvn -f /app/pom.xml clean package

FROM openjdk:17-jdk-alpine
expose 8080
COPY --from=build /app/target/*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]