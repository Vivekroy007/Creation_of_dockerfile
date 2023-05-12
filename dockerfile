From openjdk:17
EXPOSE 8080
ADD target/practice2.jar practice2.jar
ENTRYPOINT ["java","-jar","/practice2.jar"]
