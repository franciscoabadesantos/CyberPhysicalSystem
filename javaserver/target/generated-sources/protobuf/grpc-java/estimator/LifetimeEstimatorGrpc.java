package estimator;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.54.1)",
    comments = "Source: estimator.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class LifetimeEstimatorGrpc {

  private LifetimeEstimatorGrpc() {}

  public static final String SERVICE_NAME = "estimator.LifetimeEstimator";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<estimator.Estimator.MachineInfo,
      estimator.Estimator.RemainingLifetime> getEstimateRemainingLifetimeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "estimateRemainingLifetime",
      requestType = estimator.Estimator.MachineInfo.class,
      responseType = estimator.Estimator.RemainingLifetime.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<estimator.Estimator.MachineInfo,
      estimator.Estimator.RemainingLifetime> getEstimateRemainingLifetimeMethod() {
    io.grpc.MethodDescriptor<estimator.Estimator.MachineInfo, estimator.Estimator.RemainingLifetime> getEstimateRemainingLifetimeMethod;
    if ((getEstimateRemainingLifetimeMethod = LifetimeEstimatorGrpc.getEstimateRemainingLifetimeMethod) == null) {
      synchronized (LifetimeEstimatorGrpc.class) {
        if ((getEstimateRemainingLifetimeMethod = LifetimeEstimatorGrpc.getEstimateRemainingLifetimeMethod) == null) {
          LifetimeEstimatorGrpc.getEstimateRemainingLifetimeMethod = getEstimateRemainingLifetimeMethod =
              io.grpc.MethodDescriptor.<estimator.Estimator.MachineInfo, estimator.Estimator.RemainingLifetime>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "estimateRemainingLifetime"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  estimator.Estimator.MachineInfo.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  estimator.Estimator.RemainingLifetime.getDefaultInstance()))
              .setSchemaDescriptor(new LifetimeEstimatorMethodDescriptorSupplier("estimateRemainingLifetime"))
              .build();
        }
      }
    }
    return getEstimateRemainingLifetimeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LifetimeEstimatorStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LifetimeEstimatorStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LifetimeEstimatorStub>() {
        @java.lang.Override
        public LifetimeEstimatorStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LifetimeEstimatorStub(channel, callOptions);
        }
      };
    return LifetimeEstimatorStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LifetimeEstimatorBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LifetimeEstimatorBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LifetimeEstimatorBlockingStub>() {
        @java.lang.Override
        public LifetimeEstimatorBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LifetimeEstimatorBlockingStub(channel, callOptions);
        }
      };
    return LifetimeEstimatorBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LifetimeEstimatorFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LifetimeEstimatorFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LifetimeEstimatorFutureStub>() {
        @java.lang.Override
        public LifetimeEstimatorFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LifetimeEstimatorFutureStub(channel, callOptions);
        }
      };
    return LifetimeEstimatorFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void estimateRemainingLifetime(estimator.Estimator.MachineInfo request,
        io.grpc.stub.StreamObserver<estimator.Estimator.RemainingLifetime> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEstimateRemainingLifetimeMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service LifetimeEstimator.
   */
  public static abstract class LifetimeEstimatorImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return LifetimeEstimatorGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service LifetimeEstimator.
   */
  public static final class LifetimeEstimatorStub
      extends io.grpc.stub.AbstractAsyncStub<LifetimeEstimatorStub> {
    private LifetimeEstimatorStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LifetimeEstimatorStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LifetimeEstimatorStub(channel, callOptions);
    }

    /**
     */
    public void estimateRemainingLifetime(estimator.Estimator.MachineInfo request,
        io.grpc.stub.StreamObserver<estimator.Estimator.RemainingLifetime> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEstimateRemainingLifetimeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service LifetimeEstimator.
   */
  public static final class LifetimeEstimatorBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<LifetimeEstimatorBlockingStub> {
    private LifetimeEstimatorBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LifetimeEstimatorBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LifetimeEstimatorBlockingStub(channel, callOptions);
    }

    /**
     */
    public estimator.Estimator.RemainingLifetime estimateRemainingLifetime(estimator.Estimator.MachineInfo request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEstimateRemainingLifetimeMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service LifetimeEstimator.
   */
  public static final class LifetimeEstimatorFutureStub
      extends io.grpc.stub.AbstractFutureStub<LifetimeEstimatorFutureStub> {
    private LifetimeEstimatorFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LifetimeEstimatorFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LifetimeEstimatorFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<estimator.Estimator.RemainingLifetime> estimateRemainingLifetime(
        estimator.Estimator.MachineInfo request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEstimateRemainingLifetimeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ESTIMATE_REMAINING_LIFETIME = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ESTIMATE_REMAINING_LIFETIME:
          serviceImpl.estimateRemainingLifetime((estimator.Estimator.MachineInfo) request,
              (io.grpc.stub.StreamObserver<estimator.Estimator.RemainingLifetime>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getEstimateRemainingLifetimeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              estimator.Estimator.MachineInfo,
              estimator.Estimator.RemainingLifetime>(
                service, METHODID_ESTIMATE_REMAINING_LIFETIME)))
        .build();
  }

  private static abstract class LifetimeEstimatorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LifetimeEstimatorBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return estimator.Estimator.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LifetimeEstimator");
    }
  }

  private static final class LifetimeEstimatorFileDescriptorSupplier
      extends LifetimeEstimatorBaseDescriptorSupplier {
    LifetimeEstimatorFileDescriptorSupplier() {}
  }

  private static final class LifetimeEstimatorMethodDescriptorSupplier
      extends LifetimeEstimatorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LifetimeEstimatorMethodDescriptorSupplier(String methodName) {
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
      synchronized (LifetimeEstimatorGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LifetimeEstimatorFileDescriptorSupplier())
              .addMethod(getEstimateRemainingLifetimeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
