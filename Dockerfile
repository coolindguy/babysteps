FROM openjdk:8-jre-alpine
COPY ./target/spicekeyspa-0.0.1-SNAPSHOT.jar  /Users/aastha/git2/spicekeyspa/
WORKDIR /Users/aastha/git2/spicekeyspa/
EXPOSE 8080
CMD ["java", "-jar", "spicekeyspa-0.0.1-SNAPSHOT.jar"]
