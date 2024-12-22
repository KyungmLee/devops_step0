FROM openjdk:17-jdk-slim

# 작업폴더 생성
WORKDIR /app

# 실행한 jar 파일을 app.jar 파일로 복사
COPY build/libs/*SNAPSHOT.jar app.jar

# 외부 노출 포트 설정
EXPOSE 9000

# 실행 명령어를 파라미터 형식으로 전달
ENTRYPOINT ["java", "-jar", "app.jar"]