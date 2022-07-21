# AS <NAME> to name this stage as maven
FROM maven:3.6.3 AS maven

WORKDIR /usr/src/app
COPY . /usr/src/app

WORKDIR /usr/src/app

EXPOSE 8080

ENTRYPOINT ["mvn","clean","spring-boot:run"]