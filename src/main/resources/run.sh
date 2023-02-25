#!/bin/sh

java -Djboss.default.jgroups.stack=kubernetes \
-Djgroups.dns.query=infinispan-cluster.develop.svc.cluster.local \
-jar infinspan-spring-boot-demo.jar