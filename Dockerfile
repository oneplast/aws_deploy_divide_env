FROM gradle:jdk-21-and-23-graal-jammy AS builder

WORKDIR /app

COPY build.gradle.kts .
COPY settings.gradle.kts .

RUN gradle dependencies --no-daemon

COPY src src

RUN gradle build --no-daemon

FROM container-registry.oracle.com/graalvm/jdk:23

WORKDIR /app

COPY --from=builder /app/build/libs/*.jar app.jar

ENTRYPOINT ["java", "-Dspring.profiles.active=prod", "-jar", "app.jar"]