FROM adoptopenjdk/maven-openjdk11:latest

RUN apt-get update && \
    apt-get install -y git

CMD ["/usr/bin/mvn"]