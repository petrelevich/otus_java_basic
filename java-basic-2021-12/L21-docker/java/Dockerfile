FROM openjdk:16-alpine3.13
# https://hub.docker.com/_/openjdk

ADD HelloWorld.java .
RUN javac HelloWorld.java
CMD ["java", "HelloWorld"]

# Сборка образа:
# docker build -t java-hello-docker:demo .

# Просмотр образов:
# docker images

# Запуск образа:
# docker run java-hello-docker:demo