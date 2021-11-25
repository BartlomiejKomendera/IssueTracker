FROM adoptopenjdk/openjdk15:ubi
ADD target/IssueTracker-0.0.1-SNAPSHOT.jar /
EXPOSE 8080
ENTRYPOINT ["java","-jar","IssueTracker-0.0.1-SNAPSHOT.jar"]