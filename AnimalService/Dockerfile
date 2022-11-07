FROM openjdk:11
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} animalService.jar
ENTRYPOINT ["java","-jar","/AnimalService-0.0.1-SNAPSHOT.jar"]