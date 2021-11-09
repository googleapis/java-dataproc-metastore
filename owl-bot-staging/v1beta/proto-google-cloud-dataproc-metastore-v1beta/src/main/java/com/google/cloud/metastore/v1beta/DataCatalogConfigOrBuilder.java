// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/metastore/v1beta/metastore.proto

package com.google.cloud.metastore.v1beta;

public interface DataCatalogConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.metastore.v1beta.DataCatalogConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Defines whether the metastore metadata should be synced to Data Catalog.
   * The default value is to disable syncing metastore metadata to Data Catalog.
   * </pre>
   *
   * <code>bool enabled = 2;</code>
   * @return The enabled.
   */
  boolean getEnabled();
}
