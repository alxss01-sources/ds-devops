FROM eclipse-temurin:17-jre-alpine

WORKDIR /app

COPY target/ds-devops.jar app.jar

ENTRYPOINT [ "java", "-jar", "app.jar" ]