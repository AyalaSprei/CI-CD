FROM docker.pkg.github.com/ayalasprei/ci-cd/openjdk:11
WORKDIR /app
COPY src /app
RUN javac Main.java
CMD ["java", "Main"]