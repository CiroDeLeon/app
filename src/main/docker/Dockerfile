FROM frolvlad/alpine-oraclejdk8:slim
MAINTAINER ciro.deleon@itac.co
ADD app-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]