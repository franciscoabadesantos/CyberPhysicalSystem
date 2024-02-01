import grpc
import maintenance_pb2
import maintenance_pb2_grpc
import estimator_pb2
import estimator_pb2_grpc

def run_client(api_id, api_status, api_runtime_hours):
    # Crie um canal gRPC para se conectar ao servidor de manutenção
    maintenance_channel = grpc.insecure_channel('maintenance_python:50051')
    maintenance_stub = maintenance_pb2_grpc.MaintenanceRecommendationServiceStub(maintenance_channel)

    # Crie um canal gRPC para se conectar ao servidor do estimador de tempo de vida útil
    estimator_channel = grpc.insecure_channel('estimator_java:50052')
    lifetime_estimator_stub = estimator_pb2_grpc.LifetimeEstimatorStub(estimator_channel)

    # Obter o tempo de vida útil restante estimado
    machine_info = estimator_pb2.MachineInfo(id=api_id)
    response = lifetime_estimator_stub.estimateRemainingLifetime(machine_info)
    print("Estimated remaining lifetime for machine {}: {}".format(response.id, response.lifetime))


    # Crie uma mensagem MachineState com os valores de teste e o tempo de vida útil restante estimado
    request = maintenance_pb2.MachineState(
        status=api_status,
        id=api_id,
        runtime_hours=api_runtime_hours,
        remaining_lifetime=response.lifetime
    )

    # Chame o método GetMaintenanceRecommendations no stub do cliente
    response2 = maintenance_stub.GetMaintenanceRecommendations(request)

    # Processe a resposta
    for recommendation in response2.recommendations:
        machine_id = recommendation.id
        maintenance_type = recommendation.type

        if maintenance_type==0:
            type = "Preventivo / Precaução"
            api_type = "Machine working for too long. Corrective Action needed"
        elif maintenance_type==1:
            type = "Corretivo"
            api_type = "Machine has Broken Down!! Preventive Action needed"
        if maintenance_type==2:
            type = "Prevditivo"
            api_type = f"Corrective Action needed, it only has {response.lifetime} cycles left"
        elif maintenance_type==3:
            type = "Não tem correções para fazer"
            api_type = "There's no problems with this machine"
        print(f"Recomendação para a máquina {api_id}: {maintenance_type} - {type}")

    # Feche os canais gRPC
    maintenance_channel.close()
    estimator_channel.close()

    return api_type

if __name__ == '__main__':
    run_client()