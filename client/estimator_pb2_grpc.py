# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

import estimator_pb2 as estimator__pb2


class LifetimeEstimatorStub(object):
    """Missing associated documentation comment in .proto file."""

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.estimateRemainingLifetime = channel.unary_unary(
                '/estimator.LifetimeEstimator/estimateRemainingLifetime',
                request_serializer=estimator__pb2.MachineInfo.SerializeToString,
                response_deserializer=estimator__pb2.RemainingLifetime.FromString,
                )


class LifetimeEstimatorServicer(object):
    """Missing associated documentation comment in .proto file."""

    def estimateRemainingLifetime(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_LifetimeEstimatorServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'estimateRemainingLifetime': grpc.unary_unary_rpc_method_handler(
                    servicer.estimateRemainingLifetime,
                    request_deserializer=estimator__pb2.MachineInfo.FromString,
                    response_serializer=estimator__pb2.RemainingLifetime.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'estimator.LifetimeEstimator', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class LifetimeEstimator(object):
    """Missing associated documentation comment in .proto file."""

    @staticmethod
    def estimateRemainingLifetime(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/estimator.LifetimeEstimator/estimateRemainingLifetime',
            estimator__pb2.MachineInfo.SerializeToString,
            estimator__pb2.RemainingLifetime.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)
