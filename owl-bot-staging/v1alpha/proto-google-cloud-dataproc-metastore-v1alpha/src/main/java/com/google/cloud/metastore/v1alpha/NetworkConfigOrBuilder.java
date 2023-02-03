// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/metastore/v1alpha/metastore.proto

package com.google.cloud.metastore.v1alpha;

public interface NetworkConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.metastore.v1alpha.NetworkConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The consumer-side network configuration for the Dataproc
   * Metastore instance.
   * </pre>
   *
   * <code>repeated .google.cloud.metastore.v1alpha.NetworkConfig.Consumer consumers = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  java.util.List<com.google.cloud.metastore.v1alpha.NetworkConfig.Consumer> 
      getConsumersList();
  /**
   * <pre>
   * Immutable. The consumer-side network configuration for the Dataproc
   * Metastore instance.
   * </pre>
   *
   * <code>repeated .google.cloud.metastore.v1alpha.NetworkConfig.Consumer consumers = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.cloud.metastore.v1alpha.NetworkConfig.Consumer getConsumers(int index);
  /**
   * <pre>
   * Immutable. The consumer-side network configuration for the Dataproc
   * Metastore instance.
   * </pre>
   *
   * <code>repeated .google.cloud.metastore.v1alpha.NetworkConfig.Consumer consumers = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  int getConsumersCount();
  /**
   * <pre>
   * Immutable. The consumer-side network configuration for the Dataproc
   * Metastore instance.
   * </pre>
   *
   * <code>repeated .google.cloud.metastore.v1alpha.NetworkConfig.Consumer consumers = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  java.util.List<? extends com.google.cloud.metastore.v1alpha.NetworkConfig.ConsumerOrBuilder> 
      getConsumersOrBuilderList();
  /**
   * <pre>
   * Immutable. The consumer-side network configuration for the Dataproc
   * Metastore instance.
   * </pre>
   *
   * <code>repeated .google.cloud.metastore.v1alpha.NetworkConfig.Consumer consumers = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.cloud.metastore.v1alpha.NetworkConfig.ConsumerOrBuilder getConsumersOrBuilder(
      int index);
}
