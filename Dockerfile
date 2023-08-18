FROM openjdk:11

MAINTAINER AshokReddy <paguntaashokreddy@gmail.com>

COPY target/sb_with_rest-api-0.0.1-SNAPSHOT.jar  /usr/app/

WORKDIR /usr/app/

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "sb_with_rest-api-0.0.1-SNAPSHOT.jar"]
