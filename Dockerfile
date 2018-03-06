FROM openjdk:8u111-jre-alpine
MAINTAINER ME

EXPOSE 8080

ADD ./target/docker-demo-0.0.1-SNAPSHOT.jar	app.jar

ENV http_proxy http://proxy.wdf.sap.corp:8080
ENV https_proxy http://proxy.wdf.sap.corp:8080

ENTRYPOINT ["java", "-jar","/app.jar"]

#docker image build -t friendlyhello .
#docker image ls


#docker run -p 4000:80 friendlyhello
#docker container ls
#docker container stop 1fa4ab2cf395
#https://cr.console.aliyun.com/
#https://xxxxxx.mirror.aliyuncs.com