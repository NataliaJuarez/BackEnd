FROM amazoncorretto:17

MAINTAINER Natalia

COPY target/SpringBoot-0.0.1-SNAPSHOT.jar SpringBoot-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/SpringBoot-0.0.1-SNAPSHOT.jar"]