package estimator;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import java.io.IOException;
import java.util.Random;
import estimator.Estimator.MachineInfo;
import estimator.Estimator.RemainingLifetime;
import estimator.LifetimeEstimatorGrpc;

public final class EstimatorServer {
  public static void main(String[] args) throws IOException, InterruptedException {
    int port = 50052;

    final Server server = ServerBuilder.forPort(port)
        .addService(new LifetimeEstimatorImpl())
        .build()
        .start();

    System.out.println("Listening on port " + port);

    server.awaitTermination();
  }

  public static final class LifetimeEstimatorImpl extends LifetimeEstimatorGrpc.LifetimeEstimatorImplBase {
    private static final Random random = new Random();

    @Override
    public void estimateRemainingLifetime(MachineInfo req, StreamObserver<RemainingLifetime> responseObserver) {
      int remainingLifetime = random.nextInt(10000); // Gere um valor aleatório entre 0 e 9999

      RemainingLifetime reply = RemainingLifetime.newBuilder()
          .setId(req.getId())
          .setLifetime(remainingLifetime)
          .build();

      responseObserver.onNext(reply);
      responseObserver.onCompleted();
    }
  }
}