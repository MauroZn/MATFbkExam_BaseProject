FROM maven:3.9.8-eclipse-temurin-21 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

FROM openjdk:21
WORKDIR /app
COPY --from=build /app/target/ShopEurekaServer-0.0.1-SNAPSHOT.jar .
CMD ["java", "-jar", "ShopEurekaServer-0.0.1-SNAPSHOT.jar"]
EXPOSE 8761