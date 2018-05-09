FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD ./target/spicekeyspa-0.0.1-SNAPSHOT.jar  SpiceKey.jar
RUN sh -c 'touch /SpiceKey.jar'
ENV JAVA_OPTS="-Xdebug -Xrunjdwp:server=y,transport=dt_socket,address=8787,suspend=n"
EXPOSE 8080
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -Dspring.profiles.active=docker -jar /SpiceKey.jar" ]
