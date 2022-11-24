// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/metastore/v1/metastore.proto

package com.google.cloud.metastore.v1;

/**
 * <pre>
 * Telemetry Configuration for the Dataproc Metastore service.
 * </pre>
 *
 * Protobuf type {@code google.cloud.metastore.v1.TelemetryConfig}
 */
public final class TelemetryConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.metastore.v1.TelemetryConfig)
    TelemetryConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TelemetryConfig.newBuilder() to construct.
  private TelemetryConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TelemetryConfig() {
    logFormat_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TelemetryConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.metastore.v1.MetastoreProto.internal_static_google_cloud_metastore_v1_TelemetryConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.metastore.v1.MetastoreProto.internal_static_google_cloud_metastore_v1_TelemetryConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.metastore.v1.TelemetryConfig.class, com.google.cloud.metastore.v1.TelemetryConfig.Builder.class);
  }

  /**
   * Protobuf enum {@code google.cloud.metastore.v1.TelemetryConfig.LogFormat}
   */
  public enum LogFormat
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * The LOG_FORMAT is not set.
     * </pre>
     *
     * <code>LOG_FORMAT_UNSPECIFIED = 0;</code>
     */
    LOG_FORMAT_UNSPECIFIED(0),
    /**
     * <pre>
     * Logging output uses the legacy `textPayload` format.
     * </pre>
     *
     * <code>LEGACY = 1;</code>
     */
    LEGACY(1),
    /**
     * <pre>
     * Logging output uses the `jsonPayload` format.
     * </pre>
     *
     * <code>JSON = 2;</code>
     */
    JSON(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * The LOG_FORMAT is not set.
     * </pre>
     *
     * <code>LOG_FORMAT_UNSPECIFIED = 0;</code>
     */
    public static final int LOG_FORMAT_UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * Logging output uses the legacy `textPayload` format.
     * </pre>
     *
     * <code>LEGACY = 1;</code>
     */
    public static final int LEGACY_VALUE = 1;
    /**
     * <pre>
     * Logging output uses the `jsonPayload` format.
     * </pre>
     *
     * <code>JSON = 2;</code>
     */
    public static final int JSON_VALUE = 2;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static LogFormat valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static LogFormat forNumber(int value) {
      switch (value) {
        case 0: return LOG_FORMAT_UNSPECIFIED;
        case 1: return LEGACY;
        case 2: return JSON;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<LogFormat>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        LogFormat> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<LogFormat>() {
            public LogFormat findValueByNumber(int number) {
              return LogFormat.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.cloud.metastore.v1.TelemetryConfig.getDescriptor().getEnumTypes().get(0);
    }

    private static final LogFormat[] VALUES = values();

    public static LogFormat valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private LogFormat(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.metastore.v1.TelemetryConfig.LogFormat)
  }

  public static final int LOG_FORMAT_FIELD_NUMBER = 1;
  private int logFormat_;
  /**
   * <pre>
   * The output format of the Dataproc Metastore service's logs.
   * </pre>
   *
   * <code>.google.cloud.metastore.v1.TelemetryConfig.LogFormat log_format = 1;</code>
   * @return The enum numeric value on the wire for logFormat.
   */
  @java.lang.Override public int getLogFormatValue() {
    return logFormat_;
  }
  /**
   * <pre>
   * The output format of the Dataproc Metastore service's logs.
   * </pre>
   *
   * <code>.google.cloud.metastore.v1.TelemetryConfig.LogFormat log_format = 1;</code>
   * @return The logFormat.
   */
  @java.lang.Override public com.google.cloud.metastore.v1.TelemetryConfig.LogFormat getLogFormat() {
    @SuppressWarnings("deprecation")
    com.google.cloud.metastore.v1.TelemetryConfig.LogFormat result = com.google.cloud.metastore.v1.TelemetryConfig.LogFormat.valueOf(logFormat_);
    return result == null ? com.google.cloud.metastore.v1.TelemetryConfig.LogFormat.UNRECOGNIZED : result;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (logFormat_ != com.google.cloud.metastore.v1.TelemetryConfig.LogFormat.LOG_FORMAT_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, logFormat_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (logFormat_ != com.google.cloud.metastore.v1.TelemetryConfig.LogFormat.LOG_FORMAT_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, logFormat_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.cloud.metastore.v1.TelemetryConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.metastore.v1.TelemetryConfig other = (com.google.cloud.metastore.v1.TelemetryConfig) obj;

    if (logFormat_ != other.logFormat_) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + LOG_FORMAT_FIELD_NUMBER;
    hash = (53 * hash) + logFormat_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.metastore.v1.TelemetryConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.metastore.v1.TelemetryConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.metastore.v1.TelemetryConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.metastore.v1.TelemetryConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.metastore.v1.TelemetryConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.metastore.v1.TelemetryConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.metastore.v1.TelemetryConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.metastore.v1.TelemetryConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.metastore.v1.TelemetryConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.metastore.v1.TelemetryConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.metastore.v1.TelemetryConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.metastore.v1.TelemetryConfig parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.cloud.metastore.v1.TelemetryConfig prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Telemetry Configuration for the Dataproc Metastore service.
   * </pre>
   *
   * Protobuf type {@code google.cloud.metastore.v1.TelemetryConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.metastore.v1.TelemetryConfig)
      com.google.cloud.metastore.v1.TelemetryConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.metastore.v1.MetastoreProto.internal_static_google_cloud_metastore_v1_TelemetryConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.metastore.v1.MetastoreProto.internal_static_google_cloud_metastore_v1_TelemetryConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.metastore.v1.TelemetryConfig.class, com.google.cloud.metastore.v1.TelemetryConfig.Builder.class);
    }

    // Construct using com.google.cloud.metastore.v1.TelemetryConfig.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      logFormat_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.metastore.v1.MetastoreProto.internal_static_google_cloud_metastore_v1_TelemetryConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.metastore.v1.TelemetryConfig getDefaultInstanceForType() {
      return com.google.cloud.metastore.v1.TelemetryConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.metastore.v1.TelemetryConfig build() {
      com.google.cloud.metastore.v1.TelemetryConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.metastore.v1.TelemetryConfig buildPartial() {
      com.google.cloud.metastore.v1.TelemetryConfig result = new com.google.cloud.metastore.v1.TelemetryConfig(this);
      result.logFormat_ = logFormat_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.metastore.v1.TelemetryConfig) {
        return mergeFrom((com.google.cloud.metastore.v1.TelemetryConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.metastore.v1.TelemetryConfig other) {
      if (other == com.google.cloud.metastore.v1.TelemetryConfig.getDefaultInstance()) return this;
      if (other.logFormat_ != 0) {
        setLogFormatValue(other.getLogFormatValue());
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              logFormat_ = input.readEnum();

              break;
            } // case 8
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int logFormat_ = 0;
    /**
     * <pre>
     * The output format of the Dataproc Metastore service's logs.
     * </pre>
     *
     * <code>.google.cloud.metastore.v1.TelemetryConfig.LogFormat log_format = 1;</code>
     * @return The enum numeric value on the wire for logFormat.
     */
    @java.lang.Override public int getLogFormatValue() {
      return logFormat_;
    }
    /**
     * <pre>
     * The output format of the Dataproc Metastore service's logs.
     * </pre>
     *
     * <code>.google.cloud.metastore.v1.TelemetryConfig.LogFormat log_format = 1;</code>
     * @param value The enum numeric value on the wire for logFormat to set.
     * @return This builder for chaining.
     */
    public Builder setLogFormatValue(int value) {
      
      logFormat_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The output format of the Dataproc Metastore service's logs.
     * </pre>
     *
     * <code>.google.cloud.metastore.v1.TelemetryConfig.LogFormat log_format = 1;</code>
     * @return The logFormat.
     */
    @java.lang.Override
    public com.google.cloud.metastore.v1.TelemetryConfig.LogFormat getLogFormat() {
      @SuppressWarnings("deprecation")
      com.google.cloud.metastore.v1.TelemetryConfig.LogFormat result = com.google.cloud.metastore.v1.TelemetryConfig.LogFormat.valueOf(logFormat_);
      return result == null ? com.google.cloud.metastore.v1.TelemetryConfig.LogFormat.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The output format of the Dataproc Metastore service's logs.
     * </pre>
     *
     * <code>.google.cloud.metastore.v1.TelemetryConfig.LogFormat log_format = 1;</code>
     * @param value The logFormat to set.
     * @return This builder for chaining.
     */
    public Builder setLogFormat(com.google.cloud.metastore.v1.TelemetryConfig.LogFormat value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      logFormat_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The output format of the Dataproc Metastore service's logs.
     * </pre>
     *
     * <code>.google.cloud.metastore.v1.TelemetryConfig.LogFormat log_format = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearLogFormat() {
      
      logFormat_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.metastore.v1.TelemetryConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.metastore.v1.TelemetryConfig)
  private static final com.google.cloud.metastore.v1.TelemetryConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.metastore.v1.TelemetryConfig();
  }

  public static com.google.cloud.metastore.v1.TelemetryConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TelemetryConfig>
      PARSER = new com.google.protobuf.AbstractParser<TelemetryConfig>() {
    @java.lang.Override
    public TelemetryConfig parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<TelemetryConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TelemetryConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.metastore.v1.TelemetryConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

