FROM registry.cn-shanghai.aliyuncs.com/mikoto/blog-web:base
ADD . /app
WORKDIR /app/
RUN mvn clean package
EXPOSE 8080
ENTRYPOINT java -Djava.security.egd=file:/dev/./urandom -jar target/blog-web-latest.jar