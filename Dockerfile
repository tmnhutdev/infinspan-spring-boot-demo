FROM openjdk:17
COPY target/infinspan-spring-boot-demo/ /opt/infinspan-spring-boot-demo/
WORKDIR /opt/infinspan-spring-boot-demo/
EXPOSE 8080
EXPOSE 7800
EXPOSE 5000
ENTRYPOINT ["/bin/sh", "run.sh"]