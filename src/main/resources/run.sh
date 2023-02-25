#!/bin/sh

java -Djboss.default.jgroups.stack=kubernetes \
-Djgroups.dns.query=infinispan-cluster.develop.svc.cluster.local \
--spring.config.location=/config \
-jar infinspan-spring-boot-demo.jar