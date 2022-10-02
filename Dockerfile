FROM openjdk:8



ADD target/NMS_Cinemas_BE-0.0.1-SNAPSHOT.jar NMS_Cinemas_BE-0.0.1-SNAPSHOT.jar



EXPOSE 8080



ENTRYPOINT ["java","-jar","NMS_Cinemas_BE-0.0.1-SNAPSHOT.jar"]

