// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/metastore/v1/metastore_federation.proto

package com.google.cloud.metastore.v1;

public final class MetastoreFederationProto {
  private MetastoreFederationProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_metastore_v1_Federation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_metastore_v1_Federation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_metastore_v1_Federation_LabelsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_metastore_v1_Federation_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_metastore_v1_Federation_BackendMetastoresEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_metastore_v1_Federation_BackendMetastoresEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_metastore_v1_BackendMetastore_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_metastore_v1_BackendMetastore_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_metastore_v1_ListFederationsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_metastore_v1_ListFederationsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_metastore_v1_ListFederationsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_metastore_v1_ListFederationsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_metastore_v1_GetFederationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_metastore_v1_GetFederationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_metastore_v1_CreateFederationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_metastore_v1_CreateFederationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_metastore_v1_UpdateFederationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_metastore_v1_UpdateFederationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_metastore_v1_DeleteFederationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_metastore_v1_DeleteFederationRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n4google/cloud/metastore/v1/metastore_fe" +
      "deration.proto\022\031google.cloud.metastore.v" +
      "1\032\034google/api/annotations.proto\032\027google/" +
      "api/client.proto\032\037google/api/field_behav" +
      "ior.proto\032\031google/api/resource.proto\032#go" +
      "ogle/longrunning/operations.proto\032 googl" +
      "e/protobuf/field_mask.proto\032\037google/prot" +
      "obuf/timestamp.proto\"\253\006\n\nFederation\022\021\n\004n" +
      "ame\030\001 \001(\tB\003\340A\005\0224\n\013create_time\030\002 \001(\0132\032.go" +
      "ogle.protobuf.TimestampB\003\340A\003\0224\n\013update_t" +
      "ime\030\003 \001(\0132\032.google.protobuf.TimestampB\003\340" +
      "A\003\022A\n\006labels\030\004 \003(\01321.google.cloud.metast" +
      "ore.v1.Federation.LabelsEntry\022\024\n\007version" +
      "\030\005 \001(\tB\003\340A\005\022X\n\022backend_metastores\030\006 \003(\0132" +
      "<.google.cloud.metastore.v1.Federation.B" +
      "ackendMetastoresEntry\022\031\n\014endpoint_uri\030\007 " +
      "\001(\tB\003\340A\003\022?\n\005state\030\010 \001(\0162+.google.cloud.m" +
      "etastore.v1.Federation.StateB\003\340A\003\022\032\n\rsta" +
      "te_message\030\t \001(\tB\003\340A\003\022\020\n\003uid\030\n \001(\tB\003\340A\003\032" +
      "-\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001" +
      "(\t:\0028\001\032e\n\026BackendMetastoresEntry\022\013\n\003key\030" +
      "\001 \001(\005\022:\n\005value\030\002 \001(\0132+.google.cloud.meta" +
      "store.v1.BackendMetastore:\0028\001\"_\n\005State\022\025" +
      "\n\021STATE_UNSPECIFIED\020\000\022\014\n\010CREATING\020\001\022\n\n\006A" +
      "CTIVE\020\002\022\014\n\010UPDATING\020\003\022\014\n\010DELETING\020\004\022\t\n\005E" +
      "RROR\020\005:j\352Ag\n#metastore.googleapis.com/Fe" +
      "deration\022@projects/{project}/locations/{" +
      "location}/federations/{federation}\"\274\001\n\020B" +
      "ackendMetastore\022\014\n\004name\030\001 \001(\t\022Q\n\016metasto" +
      "re_type\030\002 \001(\01629.google.cloud.metastore.v" +
      "1.BackendMetastore.MetastoreType\"G\n\rMeta" +
      "storeType\022\036\n\032METASTORE_TYPE_UNSPECIFIED\020" +
      "\000\022\026\n\022DATAPROC_METASTORE\020\003\"\262\001\n\026ListFedera" +
      "tionsRequest\022;\n\006parent\030\001 \001(\tB+\340A\002\372A%\022#me" +
      "tastore.googleapis.com/Federation\022\026\n\tpag" +
      "e_size\030\002 \001(\005B\003\340A\001\022\027\n\npage_token\030\003 \001(\tB\003\340" +
      "A\001\022\023\n\006filter\030\004 \001(\tB\003\340A\001\022\025\n\010order_by\030\005 \001(" +
      "\tB\003\340A\001\"\203\001\n\027ListFederationsResponse\022:\n\013fe" +
      "derations\030\001 \003(\0132%.google.cloud.metastore" +
      ".v1.Federation\022\027\n\017next_page_token\030\002 \001(\t\022" +
      "\023\n\013unreachable\030\003 \003(\t\"Q\n\024GetFederationReq" +
      "uest\0229\n\004name\030\001 \001(\tB+\340A\002\372A%\n#metastore.go" +
      "ogleapis.com/Federation\"\313\001\n\027CreateFedera" +
      "tionRequest\022;\n\006parent\030\001 \001(\tB+\340A\002\372A%\022#met" +
      "astore.googleapis.com/Federation\022\032\n\rfede" +
      "ration_id\030\002 \001(\tB\003\340A\002\022>\n\nfederation\030\003 \001(\013" +
      "2%.google.cloud.metastore.v1.FederationB" +
      "\003\340A\002\022\027\n\nrequest_id\030\004 \001(\tB\003\340A\001\"\250\001\n\027Update" +
      "FederationRequest\0224\n\013update_mask\030\001 \001(\0132\032" +
      ".google.protobuf.FieldMaskB\003\340A\002\022>\n\nfeder" +
      "ation\030\002 \001(\0132%.google.cloud.metastore.v1." +
      "FederationB\003\340A\002\022\027\n\nrequest_id\030\003 \001(\tB\003\340A\001" +
      "\"m\n\027DeleteFederationRequest\0229\n\004name\030\001 \001(" +
      "\tB+\340A\002\372A%\n#metastore.googleapis.com/Fede" +
      "ration\022\027\n\nrequest_id\030\002 \001(\tB\003\340A\0012\334\t\n\033Data" +
      "procMetastoreFederation\022\272\001\n\017ListFederati" +
      "ons\0221.google.cloud.metastore.v1.ListFede" +
      "rationsRequest\0322.google.cloud.metastore." +
      "v1.ListFederationsResponse\"@\202\323\344\223\0021\022//v1/" +
      "{parent=projects/*/locations/*}/federati" +
      "ons\332A\006parent\022\247\001\n\rGetFederation\022/.google." +
      "cloud.metastore.v1.GetFederationRequest\032" +
      "%.google.cloud.metastore.v1.Federation\">" +
      "\202\323\344\223\0021\022//v1/{name=projects/*/locations/*" +
      "/federations/*}\332A\004name\022\211\002\n\020CreateFederat" +
      "ion\0222.google.cloud.metastore.v1.CreateFe" +
      "derationRequest\032\035.google.longrunning.Ope" +
      "ration\"\241\001\202\323\344\223\002=\"//v1/{parent=projects/*/" +
      "locations/*}/federations:\nfederation\332A\037p" +
      "arent,federation,federation_id\312A9\n\nFeder" +
      "ation\022+google.cloud.metastore.v1.Operati" +
      "onMetadata\022\213\002\n\020UpdateFederation\0222.google" +
      ".cloud.metastore.v1.UpdateFederationRequ" +
      "est\032\035.google.longrunning.Operation\"\243\001\202\323\344" +
      "\223\002H2:/v1/{federation.name=projects/*/loc" +
      "ations/*/federations/*}:\nfederation\332A\026fe" +
      "deration,update_mask\312A9\n\nFederation\022+goo" +
      "gle.cloud.metastore.v1.OperationMetadata" +
      "\022\355\001\n\020DeleteFederation\0222.google.cloud.met" +
      "astore.v1.DeleteFederationRequest\032\035.goog" +
      "le.longrunning.Operation\"\205\001\202\323\344\223\0021*//v1/{" +
      "name=projects/*/locations/*/federations/" +
      "*}\332A\004name\312AD\n\025google.protobuf.Empty\022+goo" +
      "gle.cloud.metastore.v1.OperationMetadata" +
      "\032L\312A\030metastore.googleapis.com\322A.https://" +
      "www.googleapis.com/auth/cloud-platformB\177" +
      "\n\035com.google.cloud.metastore.v1B\030Metasto" +
      "reFederationProtoP\001ZBgoogle.golang.org/g" +
      "enproto/googleapis/cloud/metastore/v1;me" +
      "tastoreb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.longrunning.OperationsProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_metastore_v1_Federation_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_metastore_v1_Federation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_metastore_v1_Federation_descriptor,
        new java.lang.String[] { "Name", "CreateTime", "UpdateTime", "Labels", "Version", "BackendMetastores", "EndpointUri", "State", "StateMessage", "Uid", });
    internal_static_google_cloud_metastore_v1_Federation_LabelsEntry_descriptor =
      internal_static_google_cloud_metastore_v1_Federation_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_metastore_v1_Federation_LabelsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_metastore_v1_Federation_LabelsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_metastore_v1_Federation_BackendMetastoresEntry_descriptor =
      internal_static_google_cloud_metastore_v1_Federation_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_metastore_v1_Federation_BackendMetastoresEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_metastore_v1_Federation_BackendMetastoresEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_metastore_v1_BackendMetastore_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_metastore_v1_BackendMetastore_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_metastore_v1_BackendMetastore_descriptor,
        new java.lang.String[] { "Name", "MetastoreType", });
    internal_static_google_cloud_metastore_v1_ListFederationsRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_metastore_v1_ListFederationsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_metastore_v1_ListFederationsRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", "Filter", "OrderBy", });
    internal_static_google_cloud_metastore_v1_ListFederationsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_metastore_v1_ListFederationsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_metastore_v1_ListFederationsResponse_descriptor,
        new java.lang.String[] { "Federations", "NextPageToken", "Unreachable", });
    internal_static_google_cloud_metastore_v1_GetFederationRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_metastore_v1_GetFederationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_metastore_v1_GetFederationRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_metastore_v1_CreateFederationRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_metastore_v1_CreateFederationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_metastore_v1_CreateFederationRequest_descriptor,
        new java.lang.String[] { "Parent", "FederationId", "Federation", "RequestId", });
    internal_static_google_cloud_metastore_v1_UpdateFederationRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_metastore_v1_UpdateFederationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_metastore_v1_UpdateFederationRequest_descriptor,
        new java.lang.String[] { "UpdateMask", "Federation", "RequestId", });
    internal_static_google_cloud_metastore_v1_DeleteFederationRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_metastore_v1_DeleteFederationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_metastore_v1_DeleteFederationRequest_descriptor,
        new java.lang.String[] { "Name", "RequestId", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
