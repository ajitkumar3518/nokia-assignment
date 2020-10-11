FROM openjdk:8
RUN apt-get update 
RUN apt-get install -y default-jre
COPY ./target/file-store-service.jar file-store-service.jar
EXPOSE 8081:8081
RUN ls -la
CMD ["java","-jar","file-store-service.jar"]
