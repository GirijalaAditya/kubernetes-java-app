FROM maven:3.9.6-amazoncorretto-11 as BUILD
COPY . .
RUN mvn clean package

FROM amazoncorretto:11-alpine
COPY --from=BUILD target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT [ "sh", "-c", "java -jar /app.jar" ]