import grpc
import maintenance_pb2 as maintenance_pb2
import maintenance_pb2_grpc as maintenance_pb2_grpc
from concurrent import futures


class MaintenanceRecommendationService(maintenance_pb2_grpc.MaintenanceRecommendationServiceServicer):
    def GetMaintenanceRecommendations(self, request, context):
        if request.status == maintenance_pb2.BROKEN_DOWN:
            # If MachineStatus is BROKEN_DOWN, recommend corrective maintenance
            recommendation = maintenance_pb2.MaintenanceRecommendation(
                type=maintenance_pb2.CORRECTIVE
            )
        elif request.runtime_hours > 500:
            # If MachineStatus is not BROKEN_DOWN and runtime_hours hasn't been reached, recommend preventive maintenance
            recommendation = maintenance_pb2.MaintenanceRecommendation(
                type=maintenance_pb2.PREVENTIVE
            )
        elif request.remaining_lifetime < 1000: 
            # If MachineStatus hasn't reached the lifetime limit, recommend predictive maintenance
            recommendation = maintenance_pb2.MaintenanceRecommendation(
                type=maintenance_pb2.PREDICTIVE
            )
        else:
            recommendation = maintenance_pb2.MaintenanceRecommendation(
                type=maintenance_pb2.NONE
            )

        # Create a RecommendationList containing the recommendation
        recommendation_list = maintenance_pb2.RecommendationList(
            recommendations=[recommendation]
        )

        return recommendation_list

def run_server():
    # Create a gRPC server
    server = grpc.server(futures.ThreadPoolExecutor())

    # Add the servicer to the server
    maintenance_pb2_grpc.add_MaintenanceRecommendationServiceServicer_to_server(
        MaintenanceRecommendationService(), server
    )

    # Start the server
    server.add_insecure_port('[::]:50051')
    server.start()
    server.wait_for_termination()

if __name__ == '__main__':
    run_server()