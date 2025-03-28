FROM eclipse-temurin:17
COPY target/kafkatask.jar kafkatask.jar
CMD [ "java","-jar","kafkatask.jar" ]