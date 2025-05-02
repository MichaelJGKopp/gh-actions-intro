FROM amazoncorretto:21-alpine
EXPOSE 8080
ADD target/gh-actions-intro.jar gh-actions-intro.jar
ENTRYPOINT ["java", "-jar", "/gh-actions-intro.jar"]