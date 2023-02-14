package vn.ifa.study.config;

import org.infinispan.protostream.GeneratedSchema;
import org.infinispan.protostream.annotations.AutoProtoSchemaBuilder;

import vn.ifa.study.protoadapter.CarAdapter;
import vn.ifa.study.protoadapter.OwnerAdapter;

@AutoProtoSchemaBuilder(
                        includeClasses = { OwnerAdapter.class, CarAdapter.class }, 
                        schemaFileName = "cache.proto", 
                        schemaFilePath = "proto/")

public interface CacheSerializationInitializer extends GeneratedSchema {

}
