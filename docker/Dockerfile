FROM openjdk:8-jdk-alpine
RUN apk update && apk upgrade && apk add netcat-openbsd
ADD ../MarketplaceService/target/marketplaceservice-0.0.1-SNAPSHOT.jar .
EXPOSE 8080
CMD java -jar marketplaceservice-0.0.1-SNAPSHOT.jar
