FROM amazoncorretto:21
WORKDIR api
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} api.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "api.jar"]


