    FROM openjdk:8

    //Crea una carpeta para que los comandos se ejecuten ahí
    WORCKDIR /app

    //Para copiar el archivo de dependencias hacia la imagen de docker
    //COPY pom*.xml ./


    //Copia todo en la carpeta en donde estoy y lo pega en la imagen que se esta creando
    //COPY . .

    EXPOSE 8080

    //Aqui estoy agregando el archivo ejecutable. Al final se le puede dar un nombre al ejecutable
    ADD . /target/swagger-spring-1.0.0.jar Ejecutable.jar

    //Son los comandos que se van a ejecutar cuando se inicie la imagen
    ENTRYPOINT ["java", "-jar", "/Ejecutable.jar"]


