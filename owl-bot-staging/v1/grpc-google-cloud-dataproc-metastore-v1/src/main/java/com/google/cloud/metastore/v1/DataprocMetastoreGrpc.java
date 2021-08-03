package com.google.cloud.metastore.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Configures and manages metastore services.
 * Metastore services are fully managed, highly available, auto-scaled,
 * auto-healing, OSS-native deployments of technical metadata management
 * software. Each metastore service exposes a network endpoint through which
 * metadata queries are served. Metadata queries can originate from a variety
 * of sources, including Apache Hive, Apache Presto, and Apache Spark.
 * The Dataproc Metastore API defines the following resource model:
 * * The service works with a collection of Google Cloud projects, named:
 * `/projects/&#42;`
 * * Each project has a collection of available locations, named: `/locations/&#42;`
 *   (a location must refer to a Google Cloud `region`)
 * * Each location has a collection of services, named: `/services/&#42;`
 * * Dataproc Metastore services are resources with names of the form:
 *   `/projects/{project_number}/locations/{location_id}/services/{service_id}`.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/cloud/metastore/v1/metastore.proto")
public final class DataprocMetastoreGrpc {

  private DataprocMetastoreGrpc() {}

  public static final String SERVICE_NAME = "google.cloud.metastore.v1.DataprocMetastore";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.cloud.metastore.v1.ListServicesRequest,
      com.google.cloud.metastore.v1.ListServicesResponse> getListServicesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListServices",
      requestType = com.google.cloud.metastore.v1.ListServicesRequest.class,
      responseType = com.google.cloud.metastore.v1.ListServicesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.cloud.metastore.v1.ListServicesRequest,
      com.google.cloud.metastore.v1.ListServicesResponse> getListServicesMethod() {
    io.grpc.MethodDescriptor<com.google.cloud.metastore.v1.ListServicesRequest, com.google.cloud.metastore.v1.ListServicesResponse> getListServicesMethod;
    if ((getListServicesMethod = DataprocMetastoreGrpc.getListServicesMethod) == null) {
      synchronized (DataprocMetastoreGrpc.class) {
        if ((getListServicesMethod = DataprocMetastoreGrpc.getListServicesMethod) == null) {
          DataprocMetastoreGrpc.getListServicesMethod = getListServicesMethod =
              io.grpc.MethodDescriptor.<com.google.cloud.metastore.v1.ListServicesRequest, com.google.cloud.metastore.v1.ListServicesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListServices"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.metastore.v1.ListServicesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.metastore.v1.ListServicesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DataprocMetastoreMethodDescriptorSupplier("ListServices"))
              .build();
        }
      }
    }
    return getListServicesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.cloud.metastore.v1.GetServiceRequest,
      com.google.cloud.metastore.v1.Service> getGetServiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetService",
      requestType = com.google.cloud.metastore.v1.GetServiceRequest.class,
      responseType = com.google.cloud.metastore.v1.Service.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.cloud.metastore.v1.GetServiceRequest,
      com.google.cloud.metastore.v1.Service> getGetServiceMethod() {
    io.grpc.MethodDescriptor<com.google.cloud.metastore.v1.GetServiceRequest, com.google.cloud.metastore.v1.Service> getGetServiceMethod;
    if ((getGetServiceMethod = DataprocMetastoreGrpc.getGetServiceMethod) == null) {
      synchronized (DataprocMetastoreGrpc.class) {
        if ((getGetServiceMethod = DataprocMetastoreGrpc.getGetServiceMethod) == null) {
          DataprocMetastoreGrpc.getGetServiceMethod = getGetServiceMethod =
              io.grpc.MethodDescriptor.<com.google.cloud.metastore.v1.GetServiceRequest, com.google.cloud.metastore.v1.Service>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetService"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.metastore.v1.GetServiceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.metastore.v1.Service.getDefaultInstance()))
              .setSchemaDescriptor(new DataprocMetastoreMethodDescriptorSupplier("GetService"))
              .build();
        }
      }
    }
    return getGetServiceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.cloud.metastore.v1.CreateServiceRequest,
      com.google.longrunning.Operation> getCreateServiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateService",
      requestType = com.google.cloud.metastore.v1.CreateServiceRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.cloud.metastore.v1.CreateServiceRequest,
      com.google.longrunning.Operation> getCreateServiceMethod() {
    io.grpc.MethodDescriptor<com.google.cloud.metastore.v1.CreateServiceRequest, com.google.longrunning.Operation> getCreateServiceMethod;
    if ((getCreateServiceMethod = DataprocMetastoreGrpc.getCreateServiceMethod) == null) {
      synchronized (DataprocMetastoreGrpc.class) {
        if ((getCreateServiceMethod = DataprocMetastoreGrpc.getCreateServiceMethod) == null) {
          DataprocMetastoreGrpc.getCreateServiceMethod = getCreateServiceMethod =
              io.grpc.MethodDescriptor.<com.google.cloud.metastore.v1.CreateServiceRequest, com.google.longrunning.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateService"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.metastore.v1.CreateServiceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.longrunning.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new DataprocMetastoreMethodDescriptorSupplier("CreateService"))
              .build();
        }
      }
    }
    return getCreateServiceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.cloud.metastore.v1.UpdateServiceRequest,
      com.google.longrunning.Operation> getUpdateServiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateService",
      requestType = com.google.cloud.metastore.v1.UpdateServiceRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.cloud.metastore.v1.UpdateServiceRequest,
      com.google.longrunning.Operation> getUpdateServiceMethod() {
    io.grpc.MethodDescriptor<com.google.cloud.metastore.v1.UpdateServiceRequest, com.google.longrunning.Operation> getUpdateServiceMethod;
    if ((getUpdateServiceMethod = DataprocMetastoreGrpc.getUpdateServiceMethod) == null) {
      synchronized (DataprocMetastoreGrpc.class) {
        if ((getUpdateServiceMethod = DataprocMetastoreGrpc.getUpdateServiceMethod) == null) {
          DataprocMetastoreGrpc.getUpdateServiceMethod = getUpdateServiceMethod =
              io.grpc.MethodDescriptor.<com.google.cloud.metastore.v1.UpdateServiceRequest, com.google.longrunning.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateService"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.metastore.v1.UpdateServiceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.longrunning.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new DataprocMetastoreMethodDescriptorSupplier("UpdateService"))
              .build();
        }
      }
    }
    return getUpdateServiceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.cloud.metastore.v1.DeleteServiceRequest,
      com.google.longrunning.Operation> getDeleteServiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteService",
      requestType = com.google.cloud.metastore.v1.DeleteServiceRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.cloud.metastore.v1.DeleteServiceRequest,
      com.google.longrunning.Operation> getDeleteServiceMethod() {
    io.grpc.MethodDescriptor<com.google.cloud.metastore.v1.DeleteServiceRequest, com.google.longrunning.Operation> getDeleteServiceMethod;
    if ((getDeleteServiceMethod = DataprocMetastoreGrpc.getDeleteServiceMethod) == null) {
      synchronized (DataprocMetastoreGrpc.class) {
        if ((getDeleteServiceMethod = DataprocMetastoreGrpc.getDeleteServiceMethod) == null) {
          DataprocMetastoreGrpc.getDeleteServiceMethod = getDeleteServiceMethod =
              io.grpc.MethodDescriptor.<com.google.cloud.metastore.v1.DeleteServiceRequest, com.google.longrunning.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteService"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.metastore.v1.DeleteServiceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.longrunning.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new DataprocMetastoreMethodDescriptorSupplier("DeleteService"))
              .build();
        }
      }
    }
    return getDeleteServiceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.cloud.metastore.v1.ListMetadataImportsRequest,
      com.google.cloud.metastore.v1.ListMetadataImportsResponse> getListMetadataImportsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListMetadataImports",
      requestType = com.google.cloud.metastore.v1.ListMetadataImportsRequest.class,
      responseType = com.google.cloud.metastore.v1.ListMetadataImportsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.cloud.metastore.v1.ListMetadataImportsRequest,
      com.google.cloud.metastore.v1.ListMetadataImportsResponse> getListMetadataImportsMethod() {
    io.grpc.MethodDescriptor<com.google.cloud.metastore.v1.ListMetadataImportsRequest, com.google.cloud.metastore.v1.ListMetadataImportsResponse> getListMetadataImportsMethod;
    if ((getListMetadataImportsMethod = DataprocMetastoreGrpc.getListMetadataImportsMethod) == null) {
      synchronized (DataprocMetastoreGrpc.class) {
        if ((getListMetadataImportsMethod = DataprocMetastoreGrpc.getListMetadataImportsMethod) == null) {
          DataprocMetastoreGrpc.getListMetadataImportsMethod = getListMetadataImportsMethod =
              io.grpc.MethodDescriptor.<com.google.cloud.metastore.v1.ListMetadataImportsRequest, com.google.cloud.metastore.v1.ListMetadataImportsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListMetadataImports"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.metastore.v1.ListMetadataImportsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.metastore.v1.ListMetadataImportsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DataprocMetastoreMethodDescriptorSupplier("ListMetadataImports"))
              .build();
        }
      }
    }
    return getListMetadataImportsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.cloud.metastore.v1.GetMetadataImportRequest,
      com.google.cloud.metastore.v1.MetadataImport> getGetMetadataImportMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMetadataImport",
      requestType = com.google.cloud.metastore.v1.GetMetadataImportRequest.class,
      responseType = com.google.cloud.metastore.v1.MetadataImport.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.cloud.metastore.v1.GetMetadataImportRequest,
      com.google.cloud.metastore.v1.MetadataImport> getGetMetadataImportMethod() {
    io.grpc.MethodDescriptor<com.google.cloud.metastore.v1.GetMetadataImportRequest, com.google.cloud.metastore.v1.MetadataImport> getGetMetadataImportMethod;
    if ((getGetMetadataImportMethod = DataprocMetastoreGrpc.getGetMetadataImportMethod) == null) {
      synchronized (DataprocMetastoreGrpc.class) {
        if ((getGetMetadataImportMethod = DataprocMetastoreGrpc.getGetMetadataImportMethod) == null) {
          DataprocMetastoreGrpc.getGetMetadataImportMethod = getGetMetadataImportMethod =
              io.grpc.MethodDescriptor.<com.google.cloud.metastore.v1.GetMetadataImportRequest, com.google.cloud.metastore.v1.MetadataImport>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMetadataImport"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.metastore.v1.GetMetadataImportRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.metastore.v1.MetadataImport.getDefaultInstance()))
              .setSchemaDescriptor(new DataprocMetastoreMethodDescriptorSupplier("GetMetadataImport"))
              .build();
        }
      }
    }
    return getGetMetadataImportMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.cloud.metastore.v1.CreateMetadataImportRequest,
      com.google.longrunning.Operation> getCreateMetadataImportMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateMetadataImport",
      requestType = com.google.cloud.metastore.v1.CreateMetadataImportRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.cloud.metastore.v1.CreateMetadataImportRequest,
      com.google.longrunning.Operation> getCreateMetadataImportMethod() {
    io.grpc.MethodDescriptor<com.google.cloud.metastore.v1.CreateMetadataImportRequest, com.google.longrunning.Operation> getCreateMetadataImportMethod;
    if ((getCreateMetadataImportMethod = DataprocMetastoreGrpc.getCreateMetadataImportMethod) == null) {
      synchronized (DataprocMetastoreGrpc.class) {
        if ((getCreateMetadataImportMethod = DataprocMetastoreGrpc.getCreateMetadataImportMethod) == null) {
          DataprocMetastoreGrpc.getCreateMetadataImportMethod = getCreateMetadataImportMethod =
              io.grpc.MethodDescriptor.<com.google.cloud.metastore.v1.CreateMetadataImportRequest, com.google.longrunning.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateMetadataImport"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.metastore.v1.CreateMetadataImportRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.longrunning.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new DataprocMetastoreMethodDescriptorSupplier("CreateMetadataImport"))
              .build();
        }
      }
    }
    return getCreateMetadataImportMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.cloud.metastore.v1.UpdateMetadataImportRequest,
      com.google.longrunning.Operation> getUpdateMetadataImportMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateMetadataImport",
      requestType = com.google.cloud.metastore.v1.UpdateMetadataImportRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.cloud.metastore.v1.UpdateMetadataImportRequest,
      com.google.longrunning.Operation> getUpdateMetadataImportMethod() {
    io.grpc.MethodDescriptor<com.google.cloud.metastore.v1.UpdateMetadataImportRequest, com.google.longrunning.Operation> getUpdateMetadataImportMethod;
    if ((getUpdateMetadataImportMethod = DataprocMetastoreGrpc.getUpdateMetadataImportMethod) == null) {
      synchronized (DataprocMetastoreGrpc.class) {
        if ((getUpdateMetadataImportMethod = DataprocMetastoreGrpc.getUpdateMetadataImportMethod) == null) {
          DataprocMetastoreGrpc.getUpdateMetadataImportMethod = getUpdateMetadataImportMethod =
              io.grpc.MethodDescriptor.<com.google.cloud.metastore.v1.UpdateMetadataImportRequest, com.google.longrunning.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateMetadataImport"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.metastore.v1.UpdateMetadataImportRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.longrunning.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new DataprocMetastoreMethodDescriptorSupplier("UpdateMetadataImport"))
              .build();
        }
      }
    }
    return getUpdateMetadataImportMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.cloud.metastore.v1.ExportMetadataRequest,
      com.google.longrunning.Operation> getExportMetadataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExportMetadata",
      requestType = com.google.cloud.metastore.v1.ExportMetadataRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.cloud.metastore.v1.ExportMetadataRequest,
      com.google.longrunning.Operation> getExportMetadataMethod() {
    io.grpc.MethodDescriptor<com.google.cloud.metastore.v1.ExportMetadataRequest, com.google.longrunning.Operation> getExportMetadataMethod;
    if ((getExportMetadataMethod = DataprocMetastoreGrpc.getExportMetadataMethod) == null) {
      synchronized (DataprocMetastoreGrpc.class) {
        if ((getExportMetadataMethod = DataprocMetastoreGrpc.getExportMetadataMethod) == null) {
          DataprocMetastoreGrpc.getExportMetadataMethod = getExportMetadataMethod =
              io.grpc.MethodDescriptor.<com.google.cloud.metastore.v1.ExportMetadataRequest, com.google.longrunning.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExportMetadata"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.metastore.v1.ExportMetadataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.longrunning.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new DataprocMetastoreMethodDescriptorSupplier("ExportMetadata"))
              .build();
        }
      }
    }
    return getExportMetadataMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DataprocMetastoreStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DataprocMetastoreStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DataprocMetastoreStub>() {
        @java.lang.Override
        public DataprocMetastoreStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DataprocMetastoreStub(channel, callOptions);
        }
      };
    return DataprocMetastoreStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DataprocMetastoreBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DataprocMetastoreBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DataprocMetastoreBlockingStub>() {
        @java.lang.Override
        public DataprocMetastoreBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DataprocMetastoreBlockingStub(channel, callOptions);
        }
      };
    return DataprocMetastoreBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DataprocMetastoreFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DataprocMetastoreFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DataprocMetastoreFutureStub>() {
        @java.lang.Override
        public DataprocMetastoreFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DataprocMetastoreFutureStub(channel, callOptions);
        }
      };
    return DataprocMetastoreFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Configures and manages metastore services.
   * Metastore services are fully managed, highly available, auto-scaled,
   * auto-healing, OSS-native deployments of technical metadata management
   * software. Each metastore service exposes a network endpoint through which
   * metadata queries are served. Metadata queries can originate from a variety
   * of sources, including Apache Hive, Apache Presto, and Apache Spark.
   * The Dataproc Metastore API defines the following resource model:
   * * The service works with a collection of Google Cloud projects, named:
   * `/projects/&#42;`
   * * Each project has a collection of available locations, named: `/locations/&#42;`
   *   (a location must refer to a Google Cloud `region`)
   * * Each location has a collection of services, named: `/services/&#42;`
   * * Dataproc Metastore services are resources with names of the form:
   *   `/projects/{project_number}/locations/{location_id}/services/{service_id}`.
   * </pre>
   */
  public static abstract class DataprocMetastoreImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Lists services in a project and location.
     * </pre>
     */
    public void listServices(com.google.cloud.metastore.v1.ListServicesRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.metastore.v1.ListServicesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListServicesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets the details of a single service.
     * </pre>
     */
    public void getService(com.google.cloud.metastore.v1.GetServiceRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.metastore.v1.Service> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetServiceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a metastore service in a project and location.
     * </pre>
     */
    public void createService(com.google.cloud.metastore.v1.CreateServiceRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateServiceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the parameters of a single service.
     * </pre>
     */
    public void updateService(com.google.cloud.metastore.v1.UpdateServiceRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateServiceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes a single service.
     * </pre>
     */
    public void deleteService(com.google.cloud.metastore.v1.DeleteServiceRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteServiceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists imports in a service.
     * </pre>
     */
    public void listMetadataImports(com.google.cloud.metastore.v1.ListMetadataImportsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.metastore.v1.ListMetadataImportsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMetadataImportsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets details of a single import.
     * </pre>
     */
    public void getMetadataImport(com.google.cloud.metastore.v1.GetMetadataImportRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.metastore.v1.MetadataImport> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMetadataImportMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a new MetadataImport in a given project and location.
     * </pre>
     */
    public void createMetadataImport(com.google.cloud.metastore.v1.CreateMetadataImportRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMetadataImportMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates a single import.
     * Only the description field of MetadataImport is supported to be updated.
     * </pre>
     */
    public void updateMetadataImport(com.google.cloud.metastore.v1.UpdateMetadataImportRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMetadataImportMethod(), responseObserver);
    }

    /**
     * <pre>
     * Exports metadata from a service.
     * </pre>
     */
    public void exportMetadata(com.google.cloud.metastore.v1.ExportMetadataRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExportMetadataMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListServicesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.metastore.v1.ListServicesRequest,
                com.google.cloud.metastore.v1.ListServicesResponse>(
                  this, METHODID_LIST_SERVICES)))
          .addMethod(
            getGetServiceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.metastore.v1.GetServiceRequest,
                com.google.cloud.metastore.v1.Service>(
                  this, METHODID_GET_SERVICE)))
          .addMethod(
            getCreateServiceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.metastore.v1.CreateServiceRequest,
                com.google.longrunning.Operation>(
                  this, METHODID_CREATE_SERVICE)))
          .addMethod(
            getUpdateServiceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.metastore.v1.UpdateServiceRequest,
                com.google.longrunning.Operation>(
                  this, METHODID_UPDATE_SERVICE)))
          .addMethod(
            getDeleteServiceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.metastore.v1.DeleteServiceRequest,
                com.google.longrunning.Operation>(
                  this, METHODID_DELETE_SERVICE)))
          .addMethod(
            getListMetadataImportsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.metastore.v1.ListMetadataImportsRequest,
                com.google.cloud.metastore.v1.ListMetadataImportsResponse>(
                  this, METHODID_LIST_METADATA_IMPORTS)))
          .addMethod(
            getGetMetadataImportMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.metastore.v1.GetMetadataImportRequest,
                com.google.cloud.metastore.v1.MetadataImport>(
                  this, METHODID_GET_METADATA_IMPORT)))
          .addMethod(
            getCreateMetadataImportMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.metastore.v1.CreateMetadataImportRequest,
                com.google.longrunning.Operation>(
                  this, METHODID_CREATE_METADATA_IMPORT)))
          .addMethod(
            getUpdateMetadataImportMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.metastore.v1.UpdateMetadataImportRequest,
                com.google.longrunning.Operation>(
                  this, METHODID_UPDATE_METADATA_IMPORT)))
          .addMethod(
            getExportMetadataMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.metastore.v1.ExportMetadataRequest,
                com.google.longrunning.Operation>(
                  this, METHODID_EXPORT_METADATA)))
          .build();
    }
  }

  /**
   * <pre>
   * Configures and manages metastore services.
   * Metastore services are fully managed, highly available, auto-scaled,
   * auto-healing, OSS-native deployments of technical metadata management
   * software. Each metastore service exposes a network endpoint through which
   * metadata queries are served. Metadata queries can originate from a variety
   * of sources, including Apache Hive, Apache Presto, and Apache Spark.
   * The Dataproc Metastore API defines the following resource model:
   * * The service works with a collection of Google Cloud projects, named:
   * `/projects/&#42;`
   * * Each project has a collection of available locations, named: `/locations/&#42;`
   *   (a location must refer to a Google Cloud `region`)
   * * Each location has a collection of services, named: `/services/&#42;`
   * * Dataproc Metastore services are resources with names of the form:
   *   `/projects/{project_number}/locations/{location_id}/services/{service_id}`.
   * </pre>
   */
  public static final class DataprocMetastoreStub extends io.grpc.stub.AbstractAsyncStub<DataprocMetastoreStub> {
    private DataprocMetastoreStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataprocMetastoreStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataprocMetastoreStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists services in a project and location.
     * </pre>
     */
    public void listServices(com.google.cloud.metastore.v1.ListServicesRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.metastore.v1.ListServicesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListServicesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets the details of a single service.
     * </pre>
     */
    public void getService(com.google.cloud.metastore.v1.GetServiceRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.metastore.v1.Service> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetServiceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a metastore service in a project and location.
     * </pre>
     */
    public void createService(com.google.cloud.metastore.v1.CreateServiceRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateServiceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the parameters of a single service.
     * </pre>
     */
    public void updateService(com.google.cloud.metastore.v1.UpdateServiceRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateServiceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a single service.
     * </pre>
     */
    public void deleteService(com.google.cloud.metastore.v1.DeleteServiceRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteServiceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists imports in a service.
     * </pre>
     */
    public void listMetadataImports(com.google.cloud.metastore.v1.ListMetadataImportsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.metastore.v1.ListMetadataImportsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMetadataImportsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets details of a single import.
     * </pre>
     */
    public void getMetadataImport(com.google.cloud.metastore.v1.GetMetadataImportRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.metastore.v1.MetadataImport> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMetadataImportMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a new MetadataImport in a given project and location.
     * </pre>
     */
    public void createMetadataImport(com.google.cloud.metastore.v1.CreateMetadataImportRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMetadataImportMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates a single import.
     * Only the description field of MetadataImport is supported to be updated.
     * </pre>
     */
    public void updateMetadataImport(com.google.cloud.metastore.v1.UpdateMetadataImportRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMetadataImportMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Exports metadata from a service.
     * </pre>
     */
    public void exportMetadata(com.google.cloud.metastore.v1.ExportMetadataRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExportMetadataMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Configures and manages metastore services.
   * Metastore services are fully managed, highly available, auto-scaled,
   * auto-healing, OSS-native deployments of technical metadata management
   * software. Each metastore service exposes a network endpoint through which
   * metadata queries are served. Metadata queries can originate from a variety
   * of sources, including Apache Hive, Apache Presto, and Apache Spark.
   * The Dataproc Metastore API defines the following resource model:
   * * The service works with a collection of Google Cloud projects, named:
   * `/projects/&#42;`
   * * Each project has a collection of available locations, named: `/locations/&#42;`
   *   (a location must refer to a Google Cloud `region`)
   * * Each location has a collection of services, named: `/services/&#42;`
   * * Dataproc Metastore services are resources with names of the form:
   *   `/projects/{project_number}/locations/{location_id}/services/{service_id}`.
   * </pre>
   */
  public static final class DataprocMetastoreBlockingStub extends io.grpc.stub.AbstractBlockingStub<DataprocMetastoreBlockingStub> {
    private DataprocMetastoreBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataprocMetastoreBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataprocMetastoreBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists services in a project and location.
     * </pre>
     */
    public com.google.cloud.metastore.v1.ListServicesResponse listServices(com.google.cloud.metastore.v1.ListServicesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListServicesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets the details of a single service.
     * </pre>
     */
    public com.google.cloud.metastore.v1.Service getService(com.google.cloud.metastore.v1.GetServiceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetServiceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a metastore service in a project and location.
     * </pre>
     */
    public com.google.longrunning.Operation createService(com.google.cloud.metastore.v1.CreateServiceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateServiceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the parameters of a single service.
     * </pre>
     */
    public com.google.longrunning.Operation updateService(com.google.cloud.metastore.v1.UpdateServiceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateServiceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a single service.
     * </pre>
     */
    public com.google.longrunning.Operation deleteService(com.google.cloud.metastore.v1.DeleteServiceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteServiceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists imports in a service.
     * </pre>
     */
    public com.google.cloud.metastore.v1.ListMetadataImportsResponse listMetadataImports(com.google.cloud.metastore.v1.ListMetadataImportsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMetadataImportsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets details of a single import.
     * </pre>
     */
    public com.google.cloud.metastore.v1.MetadataImport getMetadataImport(com.google.cloud.metastore.v1.GetMetadataImportRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMetadataImportMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a new MetadataImport in a given project and location.
     * </pre>
     */
    public com.google.longrunning.Operation createMetadataImport(com.google.cloud.metastore.v1.CreateMetadataImportRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMetadataImportMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates a single import.
     * Only the description field of MetadataImport is supported to be updated.
     * </pre>
     */
    public com.google.longrunning.Operation updateMetadataImport(com.google.cloud.metastore.v1.UpdateMetadataImportRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMetadataImportMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Exports metadata from a service.
     * </pre>
     */
    public com.google.longrunning.Operation exportMetadata(com.google.cloud.metastore.v1.ExportMetadataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExportMetadataMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Configures and manages metastore services.
   * Metastore services are fully managed, highly available, auto-scaled,
   * auto-healing, OSS-native deployments of technical metadata management
   * software. Each metastore service exposes a network endpoint through which
   * metadata queries are served. Metadata queries can originate from a variety
   * of sources, including Apache Hive, Apache Presto, and Apache Spark.
   * The Dataproc Metastore API defines the following resource model:
   * * The service works with a collection of Google Cloud projects, named:
   * `/projects/&#42;`
   * * Each project has a collection of available locations, named: `/locations/&#42;`
   *   (a location must refer to a Google Cloud `region`)
   * * Each location has a collection of services, named: `/services/&#42;`
   * * Dataproc Metastore services are resources with names of the form:
   *   `/projects/{project_number}/locations/{location_id}/services/{service_id}`.
   * </pre>
   */
  public static final class DataprocMetastoreFutureStub extends io.grpc.stub.AbstractFutureStub<DataprocMetastoreFutureStub> {
    private DataprocMetastoreFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataprocMetastoreFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataprocMetastoreFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists services in a project and location.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.metastore.v1.ListServicesResponse> listServices(
        com.google.cloud.metastore.v1.ListServicesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListServicesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets the details of a single service.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.metastore.v1.Service> getService(
        com.google.cloud.metastore.v1.GetServiceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetServiceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a metastore service in a project and location.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> createService(
        com.google.cloud.metastore.v1.CreateServiceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateServiceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the parameters of a single service.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> updateService(
        com.google.cloud.metastore.v1.UpdateServiceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateServiceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a single service.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> deleteService(
        com.google.cloud.metastore.v1.DeleteServiceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteServiceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists imports in a service.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.metastore.v1.ListMetadataImportsResponse> listMetadataImports(
        com.google.cloud.metastore.v1.ListMetadataImportsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMetadataImportsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets details of a single import.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.metastore.v1.MetadataImport> getMetadataImport(
        com.google.cloud.metastore.v1.GetMetadataImportRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMetadataImportMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a new MetadataImport in a given project and location.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> createMetadataImport(
        com.google.cloud.metastore.v1.CreateMetadataImportRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMetadataImportMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates a single import.
     * Only the description field of MetadataImport is supported to be updated.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> updateMetadataImport(
        com.google.cloud.metastore.v1.UpdateMetadataImportRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMetadataImportMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Exports metadata from a service.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> exportMetadata(
        com.google.cloud.metastore.v1.ExportMetadataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExportMetadataMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_SERVICES = 0;
  private static final int METHODID_GET_SERVICE = 1;
  private static final int METHODID_CREATE_SERVICE = 2;
  private static final int METHODID_UPDATE_SERVICE = 3;
  private static final int METHODID_DELETE_SERVICE = 4;
  private static final int METHODID_LIST_METADATA_IMPORTS = 5;
  private static final int METHODID_GET_METADATA_IMPORT = 6;
  private static final int METHODID_CREATE_METADATA_IMPORT = 7;
  private static final int METHODID_UPDATE_METADATA_IMPORT = 8;
  private static final int METHODID_EXPORT_METADATA = 9;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DataprocMetastoreImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DataprocMetastoreImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_SERVICES:
          serviceImpl.listServices((com.google.cloud.metastore.v1.ListServicesRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.metastore.v1.ListServicesResponse>) responseObserver);
          break;
        case METHODID_GET_SERVICE:
          serviceImpl.getService((com.google.cloud.metastore.v1.GetServiceRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.metastore.v1.Service>) responseObserver);
          break;
        case METHODID_CREATE_SERVICE:
          serviceImpl.createService((com.google.cloud.metastore.v1.CreateServiceRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_UPDATE_SERVICE:
          serviceImpl.updateService((com.google.cloud.metastore.v1.UpdateServiceRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_DELETE_SERVICE:
          serviceImpl.deleteService((com.google.cloud.metastore.v1.DeleteServiceRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_LIST_METADATA_IMPORTS:
          serviceImpl.listMetadataImports((com.google.cloud.metastore.v1.ListMetadataImportsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.metastore.v1.ListMetadataImportsResponse>) responseObserver);
          break;
        case METHODID_GET_METADATA_IMPORT:
          serviceImpl.getMetadataImport((com.google.cloud.metastore.v1.GetMetadataImportRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.metastore.v1.MetadataImport>) responseObserver);
          break;
        case METHODID_CREATE_METADATA_IMPORT:
          serviceImpl.createMetadataImport((com.google.cloud.metastore.v1.CreateMetadataImportRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_UPDATE_METADATA_IMPORT:
          serviceImpl.updateMetadataImport((com.google.cloud.metastore.v1.UpdateMetadataImportRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_EXPORT_METADATA:
          serviceImpl.exportMetadata((com.google.cloud.metastore.v1.ExportMetadataRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class DataprocMetastoreBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DataprocMetastoreBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.cloud.metastore.v1.MetastoreProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DataprocMetastore");
    }
  }

  private static final class DataprocMetastoreFileDescriptorSupplier
      extends DataprocMetastoreBaseDescriptorSupplier {
    DataprocMetastoreFileDescriptorSupplier() {}
  }

  private static final class DataprocMetastoreMethodDescriptorSupplier
      extends DataprocMetastoreBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DataprocMetastoreMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (DataprocMetastoreGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DataprocMetastoreFileDescriptorSupplier())
              .addMethod(getListServicesMethod())
              .addMethod(getGetServiceMethod())
              .addMethod(getCreateServiceMethod())
              .addMethod(getUpdateServiceMethod())
              .addMethod(getDeleteServiceMethod())
              .addMethod(getListMetadataImportsMethod())
              .addMethod(getGetMetadataImportMethod())
              .addMethod(getCreateMetadataImportMethod())
              .addMethod(getUpdateMetadataImportMethod())
              .addMethod(getExportMetadataMethod())
              .build();
        }
      }
    }
    return result;
  }
}
