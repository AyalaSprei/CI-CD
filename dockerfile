FROM ghcr.io/openjdk/openjdk:11
WORKDIR /app
COPY src /app
RUN javac Main.java
CMD ["java", "Main"]