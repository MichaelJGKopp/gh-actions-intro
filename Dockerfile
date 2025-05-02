FROM openjdk:21
EXPOSE 8080
ADD target/gh-actions-intro.jar gh-actions-intro.jar
ENTRYPOINT ["java", "-jar", "/gh-actions-intro.jar"]