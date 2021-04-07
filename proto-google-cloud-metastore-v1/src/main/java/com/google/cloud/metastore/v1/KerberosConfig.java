/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/metastore/v1/metastore.proto

package com.google.cloud.metastore.v1;

/**
 *
 *
 * <pre>
 * Configuration information for a Kerberos principal.
 * </pre>
 *
 * Protobuf type {@code google.cloud.metastore.v1.KerberosConfig}
 */
public final class KerberosConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.metastore.v1.KerberosConfig)
    KerberosConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use KerberosConfig.newBuilder() to construct.
  private KerberosConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private KerberosConfig() {
    principal_ = "";
    krb5ConfigGcsUri_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new KerberosConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private KerberosConfig(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              com.google.cloud.metastore.v1.Secret.Builder subBuilder = null;
              if (keytab_ != null) {
                subBuilder = keytab_.toBuilder();
              }
              keytab_ =
                  input.readMessage(
                      com.google.cloud.metastore.v1.Secret.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(keytab_);
                keytab_ = subBuilder.buildPartial();
              }

              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              principal_ = s;
              break;
            }
          case 26:
            {
              java.lang.String s = input.readStringRequireUtf8();

              krb5ConfigGcsUri_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.metastore.v1.MetastoreProto
        .internal_static_google_cloud_metastore_v1_KerberosConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.metastore.v1.MetastoreProto
        .internal_static_google_cloud_metastore_v1_KerberosConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.metastore.v1.KerberosConfig.class,
            com.google.cloud.metastore.v1.KerberosConfig.Builder.class);
  }

  public static final int KEYTAB_FIELD_NUMBER = 1;
  private com.google.cloud.metastore.v1.Secret keytab_;
  /**
   *
   *
   * <pre>
   * A Kerberos keytab file that can be used to authenticate a service principal
   * with a Kerberos Key Distribution Center (KDC).
   * </pre>
   *
   * <code>.google.cloud.metastore.v1.Secret keytab = 1;</code>
   *
   * @return Whether the keytab field is set.
   */
  @java.lang.Override
  public boolean hasKeytab() {
    return keytab_ != null;
  }
  /**
   *
   *
   * <pre>
   * A Kerberos keytab file that can be used to authenticate a service principal
   * with a Kerberos Key Distribution Center (KDC).
   * </pre>
   *
   * <code>.google.cloud.metastore.v1.Secret keytab = 1;</code>
   *
   * @return The keytab.
   */
  @java.lang.Override
  public com.google.cloud.metastore.v1.Secret getKeytab() {
    return keytab_ == null ? com.google.cloud.metastore.v1.Secret.getDefaultInstance() : keytab_;
  }
  /**
   *
   *
   * <pre>
   * A Kerberos keytab file that can be used to authenticate a service principal
   * with a Kerberos Key Distribution Center (KDC).
   * </pre>
   *
   * <code>.google.cloud.metastore.v1.Secret keytab = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.metastore.v1.SecretOrBuilder getKeytabOrBuilder() {
    return getKeytab();
  }

  public static final int PRINCIPAL_FIELD_NUMBER = 2;
  private volatile java.lang.Object principal_;
  /**
   *
   *
   * <pre>
   * A Kerberos principal that exists in the both the keytab the KDC
   * to authenticate as. A typical principal is of the form
   * `primary/instance&#64;REALM`, but there is no exact format.
   * </pre>
   *
   * <code>string principal = 2;</code>
   *
   * @return The principal.
   */
  @java.lang.Override
  public java.lang.String getPrincipal() {
    java.lang.Object ref = principal_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      principal_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * A Kerberos principal that exists in the both the keytab the KDC
   * to authenticate as. A typical principal is of the form
   * `primary/instance&#64;REALM`, but there is no exact format.
   * </pre>
   *
   * <code>string principal = 2;</code>
   *
   * @return The bytes for principal.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getPrincipalBytes() {
    java.lang.Object ref = principal_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      principal_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int KRB5_CONFIG_GCS_URI_FIELD_NUMBER = 3;
  private volatile java.lang.Object krb5ConfigGcsUri_;
  /**
   *
   *
   * <pre>
   * A Cloud Storage URI that specifies the path to a
   * krb5.conf file. It is of the form `gs://{bucket_name}/path/to/krb5.conf`,
   * although the file does not need to be named krb5.conf explicitly.
   * </pre>
   *
   * <code>string krb5_config_gcs_uri = 3;</code>
   *
   * @return The krb5ConfigGcsUri.
   */
  @java.lang.Override
  public java.lang.String getKrb5ConfigGcsUri() {
    java.lang.Object ref = krb5ConfigGcsUri_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      krb5ConfigGcsUri_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * A Cloud Storage URI that specifies the path to a
   * krb5.conf file. It is of the form `gs://{bucket_name}/path/to/krb5.conf`,
   * although the file does not need to be named krb5.conf explicitly.
   * </pre>
   *
   * <code>string krb5_config_gcs_uri = 3;</code>
   *
   * @return The bytes for krb5ConfigGcsUri.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getKrb5ConfigGcsUriBytes() {
    java.lang.Object ref = krb5ConfigGcsUri_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      krb5ConfigGcsUri_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (keytab_ != null) {
      output.writeMessage(1, getKeytab());
    }
    if (!getPrincipalBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, principal_);
    }
    if (!getKrb5ConfigGcsUriBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, krb5ConfigGcsUri_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (keytab_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getKeytab());
    }
    if (!getPrincipalBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, principal_);
    }
    if (!getKrb5ConfigGcsUriBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, krb5ConfigGcsUri_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.metastore.v1.KerberosConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.metastore.v1.KerberosConfig other =
        (com.google.cloud.metastore.v1.KerberosConfig) obj;

    if (hasKeytab() != other.hasKeytab()) return false;
    if (hasKeytab()) {
      if (!getKeytab().equals(other.getKeytab())) return false;
    }
    if (!getPrincipal().equals(other.getPrincipal())) return false;
    if (!getKrb5ConfigGcsUri().equals(other.getKrb5ConfigGcsUri())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasKeytab()) {
      hash = (37 * hash) + KEYTAB_FIELD_NUMBER;
      hash = (53 * hash) + getKeytab().hashCode();
    }
    hash = (37 * hash) + PRINCIPAL_FIELD_NUMBER;
    hash = (53 * hash) + getPrincipal().hashCode();
    hash = (37 * hash) + KRB5_CONFIG_GCS_URI_FIELD_NUMBER;
    hash = (53 * hash) + getKrb5ConfigGcsUri().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.metastore.v1.KerberosConfig parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.metastore.v1.KerberosConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.metastore.v1.KerberosConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.metastore.v1.KerberosConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.metastore.v1.KerberosConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.metastore.v1.KerberosConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.metastore.v1.KerberosConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.metastore.v1.KerberosConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.metastore.v1.KerberosConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.metastore.v1.KerberosConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.metastore.v1.KerberosConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.metastore.v1.KerberosConfig parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.cloud.metastore.v1.KerberosConfig prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Configuration information for a Kerberos principal.
   * </pre>
   *
   * Protobuf type {@code google.cloud.metastore.v1.KerberosConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.metastore.v1.KerberosConfig)
      com.google.cloud.metastore.v1.KerberosConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.metastore.v1.MetastoreProto
          .internal_static_google_cloud_metastore_v1_KerberosConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.metastore.v1.MetastoreProto
          .internal_static_google_cloud_metastore_v1_KerberosConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.metastore.v1.KerberosConfig.class,
              com.google.cloud.metastore.v1.KerberosConfig.Builder.class);
    }

    // Construct using com.google.cloud.metastore.v1.KerberosConfig.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (keytabBuilder_ == null) {
        keytab_ = null;
      } else {
        keytab_ = null;
        keytabBuilder_ = null;
      }
      principal_ = "";

      krb5ConfigGcsUri_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.metastore.v1.MetastoreProto
          .internal_static_google_cloud_metastore_v1_KerberosConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.metastore.v1.KerberosConfig getDefaultInstanceForType() {
      return com.google.cloud.metastore.v1.KerberosConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.metastore.v1.KerberosConfig build() {
      com.google.cloud.metastore.v1.KerberosConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.metastore.v1.KerberosConfig buildPartial() {
      com.google.cloud.metastore.v1.KerberosConfig result =
          new com.google.cloud.metastore.v1.KerberosConfig(this);
      if (keytabBuilder_ == null) {
        result.keytab_ = keytab_;
      } else {
        result.keytab_ = keytabBuilder_.build();
      }
      result.principal_ = principal_;
      result.krb5ConfigGcsUri_ = krb5ConfigGcsUri_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.metastore.v1.KerberosConfig) {
        return mergeFrom((com.google.cloud.metastore.v1.KerberosConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.metastore.v1.KerberosConfig other) {
      if (other == com.google.cloud.metastore.v1.KerberosConfig.getDefaultInstance()) return this;
      if (other.hasKeytab()) {
        mergeKeytab(other.getKeytab());
      }
      if (!other.getPrincipal().isEmpty()) {
        principal_ = other.principal_;
        onChanged();
      }
      if (!other.getKrb5ConfigGcsUri().isEmpty()) {
        krb5ConfigGcsUri_ = other.krb5ConfigGcsUri_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.metastore.v1.KerberosConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.metastore.v1.KerberosConfig) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.metastore.v1.Secret keytab_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.metastore.v1.Secret,
            com.google.cloud.metastore.v1.Secret.Builder,
            com.google.cloud.metastore.v1.SecretOrBuilder>
        keytabBuilder_;
    /**
     *
     *
     * <pre>
     * A Kerberos keytab file that can be used to authenticate a service principal
     * with a Kerberos Key Distribution Center (KDC).
     * </pre>
     *
     * <code>.google.cloud.metastore.v1.Secret keytab = 1;</code>
     *
     * @return Whether the keytab field is set.
     */
    public boolean hasKeytab() {
      return keytabBuilder_ != null || keytab_ != null;
    }
    /**
     *
     *
     * <pre>
     * A Kerberos keytab file that can be used to authenticate a service principal
     * with a Kerberos Key Distribution Center (KDC).
     * </pre>
     *
     * <code>.google.cloud.metastore.v1.Secret keytab = 1;</code>
     *
     * @return The keytab.
     */
    public com.google.cloud.metastore.v1.Secret getKeytab() {
      if (keytabBuilder_ == null) {
        return keytab_ == null
            ? com.google.cloud.metastore.v1.Secret.getDefaultInstance()
            : keytab_;
      } else {
        return keytabBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * A Kerberos keytab file that can be used to authenticate a service principal
     * with a Kerberos Key Distribution Center (KDC).
     * </pre>
     *
     * <code>.google.cloud.metastore.v1.Secret keytab = 1;</code>
     */
    public Builder setKeytab(com.google.cloud.metastore.v1.Secret value) {
      if (keytabBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        keytab_ = value;
        onChanged();
      } else {
        keytabBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * A Kerberos keytab file that can be used to authenticate a service principal
     * with a Kerberos Key Distribution Center (KDC).
     * </pre>
     *
     * <code>.google.cloud.metastore.v1.Secret keytab = 1;</code>
     */
    public Builder setKeytab(com.google.cloud.metastore.v1.Secret.Builder builderForValue) {
      if (keytabBuilder_ == null) {
        keytab_ = builderForValue.build();
        onChanged();
      } else {
        keytabBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * A Kerberos keytab file that can be used to authenticate a service principal
     * with a Kerberos Key Distribution Center (KDC).
     * </pre>
     *
     * <code>.google.cloud.metastore.v1.Secret keytab = 1;</code>
     */
    public Builder mergeKeytab(com.google.cloud.metastore.v1.Secret value) {
      if (keytabBuilder_ == null) {
        if (keytab_ != null) {
          keytab_ =
              com.google.cloud.metastore.v1.Secret.newBuilder(keytab_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          keytab_ = value;
        }
        onChanged();
      } else {
        keytabBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * A Kerberos keytab file that can be used to authenticate a service principal
     * with a Kerberos Key Distribution Center (KDC).
     * </pre>
     *
     * <code>.google.cloud.metastore.v1.Secret keytab = 1;</code>
     */
    public Builder clearKeytab() {
      if (keytabBuilder_ == null) {
        keytab_ = null;
        onChanged();
      } else {
        keytab_ = null;
        keytabBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * A Kerberos keytab file that can be used to authenticate a service principal
     * with a Kerberos Key Distribution Center (KDC).
     * </pre>
     *
     * <code>.google.cloud.metastore.v1.Secret keytab = 1;</code>
     */
    public com.google.cloud.metastore.v1.Secret.Builder getKeytabBuilder() {

      onChanged();
      return getKeytabFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * A Kerberos keytab file that can be used to authenticate a service principal
     * with a Kerberos Key Distribution Center (KDC).
     * </pre>
     *
     * <code>.google.cloud.metastore.v1.Secret keytab = 1;</code>
     */
    public com.google.cloud.metastore.v1.SecretOrBuilder getKeytabOrBuilder() {
      if (keytabBuilder_ != null) {
        return keytabBuilder_.getMessageOrBuilder();
      } else {
        return keytab_ == null
            ? com.google.cloud.metastore.v1.Secret.getDefaultInstance()
            : keytab_;
      }
    }
    /**
     *
     *
     * <pre>
     * A Kerberos keytab file that can be used to authenticate a service principal
     * with a Kerberos Key Distribution Center (KDC).
     * </pre>
     *
     * <code>.google.cloud.metastore.v1.Secret keytab = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.metastore.v1.Secret,
            com.google.cloud.metastore.v1.Secret.Builder,
            com.google.cloud.metastore.v1.SecretOrBuilder>
        getKeytabFieldBuilder() {
      if (keytabBuilder_ == null) {
        keytabBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.metastore.v1.Secret,
                com.google.cloud.metastore.v1.Secret.Builder,
                com.google.cloud.metastore.v1.SecretOrBuilder>(
                getKeytab(), getParentForChildren(), isClean());
        keytab_ = null;
      }
      return keytabBuilder_;
    }

    private java.lang.Object principal_ = "";
    /**
     *
     *
     * <pre>
     * A Kerberos principal that exists in the both the keytab the KDC
     * to authenticate as. A typical principal is of the form
     * `primary/instance&#64;REALM`, but there is no exact format.
     * </pre>
     *
     * <code>string principal = 2;</code>
     *
     * @return The principal.
     */
    public java.lang.String getPrincipal() {
      java.lang.Object ref = principal_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        principal_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A Kerberos principal that exists in the both the keytab the KDC
     * to authenticate as. A typical principal is of the form
     * `primary/instance&#64;REALM`, but there is no exact format.
     * </pre>
     *
     * <code>string principal = 2;</code>
     *
     * @return The bytes for principal.
     */
    public com.google.protobuf.ByteString getPrincipalBytes() {
      java.lang.Object ref = principal_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        principal_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A Kerberos principal that exists in the both the keytab the KDC
     * to authenticate as. A typical principal is of the form
     * `primary/instance&#64;REALM`, but there is no exact format.
     * </pre>
     *
     * <code>string principal = 2;</code>
     *
     * @param value The principal to set.
     * @return This builder for chaining.
     */
    public Builder setPrincipal(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      principal_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A Kerberos principal that exists in the both the keytab the KDC
     * to authenticate as. A typical principal is of the form
     * `primary/instance&#64;REALM`, but there is no exact format.
     * </pre>
     *
     * <code>string principal = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPrincipal() {

      principal_ = getDefaultInstance().getPrincipal();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A Kerberos principal that exists in the both the keytab the KDC
     * to authenticate as. A typical principal is of the form
     * `primary/instance&#64;REALM`, but there is no exact format.
     * </pre>
     *
     * <code>string principal = 2;</code>
     *
     * @param value The bytes for principal to set.
     * @return This builder for chaining.
     */
    public Builder setPrincipalBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      principal_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object krb5ConfigGcsUri_ = "";
    /**
     *
     *
     * <pre>
     * A Cloud Storage URI that specifies the path to a
     * krb5.conf file. It is of the form `gs://{bucket_name}/path/to/krb5.conf`,
     * although the file does not need to be named krb5.conf explicitly.
     * </pre>
     *
     * <code>string krb5_config_gcs_uri = 3;</code>
     *
     * @return The krb5ConfigGcsUri.
     */
    public java.lang.String getKrb5ConfigGcsUri() {
      java.lang.Object ref = krb5ConfigGcsUri_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        krb5ConfigGcsUri_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A Cloud Storage URI that specifies the path to a
     * krb5.conf file. It is of the form `gs://{bucket_name}/path/to/krb5.conf`,
     * although the file does not need to be named krb5.conf explicitly.
     * </pre>
     *
     * <code>string krb5_config_gcs_uri = 3;</code>
     *
     * @return The bytes for krb5ConfigGcsUri.
     */
    public com.google.protobuf.ByteString getKrb5ConfigGcsUriBytes() {
      java.lang.Object ref = krb5ConfigGcsUri_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        krb5ConfigGcsUri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A Cloud Storage URI that specifies the path to a
     * krb5.conf file. It is of the form `gs://{bucket_name}/path/to/krb5.conf`,
     * although the file does not need to be named krb5.conf explicitly.
     * </pre>
     *
     * <code>string krb5_config_gcs_uri = 3;</code>
     *
     * @param value The krb5ConfigGcsUri to set.
     * @return This builder for chaining.
     */
    public Builder setKrb5ConfigGcsUri(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      krb5ConfigGcsUri_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A Cloud Storage URI that specifies the path to a
     * krb5.conf file. It is of the form `gs://{bucket_name}/path/to/krb5.conf`,
     * although the file does not need to be named krb5.conf explicitly.
     * </pre>
     *
     * <code>string krb5_config_gcs_uri = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearKrb5ConfigGcsUri() {

      krb5ConfigGcsUri_ = getDefaultInstance().getKrb5ConfigGcsUri();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A Cloud Storage URI that specifies the path to a
     * krb5.conf file. It is of the form `gs://{bucket_name}/path/to/krb5.conf`,
     * although the file does not need to be named krb5.conf explicitly.
     * </pre>
     *
     * <code>string krb5_config_gcs_uri = 3;</code>
     *
     * @param value The bytes for krb5ConfigGcsUri to set.
     * @return This builder for chaining.
     */
    public Builder setKrb5ConfigGcsUriBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      krb5ConfigGcsUri_ = value;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.metastore.v1.KerberosConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.metastore.v1.KerberosConfig)
  private static final com.google.cloud.metastore.v1.KerberosConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.metastore.v1.KerberosConfig();
  }

  public static com.google.cloud.metastore.v1.KerberosConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<KerberosConfig> PARSER =
      new com.google.protobuf.AbstractParser<KerberosConfig>() {
        @java.lang.Override
        public KerberosConfig parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new KerberosConfig(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<KerberosConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<KerberosConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.metastore.v1.KerberosConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
