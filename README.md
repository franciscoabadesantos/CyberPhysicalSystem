# CyberPhysicalSystem
 
![image](https://github.com/franciscoabadesantos/CyberPhysicalSystem/assets/65195331/34849a9a-824e-4ac4-a29d-e5fe5367ae43)

The architecture is focused on allowing users to obtain maintenance recommendations for industrial machines in a smart manufacturing context. For this purpose, two microservices must be created, one to estimate the remaining useful life of the machine in Java (MS1), and another to recommend the most appropriate type of maintenance in Python (MS2). Microservices must be exposed to the user through a REST API, this format being supported by most browsers and easily interpreted by a human. Communication between this entry point and microservices must be implemented through gRPC. All elements must be deployed in containers on Docker Engine.
