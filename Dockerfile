    FROM openjdk:8



    EXPOSE 8080



    ADD ./target/swagger-spring-1.0.0.jar ejecutable.jar



    ENTRYPOINT ["java", "-jar", "/ejecutable.jar"]


