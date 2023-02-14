# infinspan-spring-boot-demo
[![License](http://img.shields.io/:license-apache-blue.svg)](http://www.apache.org/licenses/LICENSE-2.0.html)

This is a spring boot application integrate with embedded infinipsan caching, it exposes REST APIs to insert, get by id and get all data from cache. You can run multiple nodes by changing NODE_ID and PORT.

## Requirements
For building and running the application you need:

- [JDK 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- [Maven 3.8.4](https://maven.apache.org)

## Run
You need to build the project by running ```mvn clean package```
* Once successfully built, you can run the service by one of these two methods:
```
        java -jar -DNODE_ID=1 -DPORT=8080 target/infinspan-spring-boot-demo-0.0.1-SNAPSHOT
or
        mvn spring-boot:run -jar -DNODE_ID=1 -DPORT=8080
```

After the application start successfully, you can access the Swagger UI to execute the REST APIs here [swagger-ui](http://localhost:8080/webjars/swagger-ui/index.html)
