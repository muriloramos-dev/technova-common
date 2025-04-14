FROM maven:latest AS build

WORKDIR /app

COPY pom.xml .
COPY src ./src

RUN mvn clean install -DskipTests

FROM openjdk:17

WORKDIR /app

COPY --from=build /app/target/technova-common-1.0-SNAPSHOT.jar /app/technova-common-1.0-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "technova-common-1.0-SNAPSHOT.jar"]