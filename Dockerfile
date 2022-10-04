FROM openjdk:8


ADD target/NMS_Cinemas.jar NNMS_Cinemas.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","nms_cinemas.jar"]

