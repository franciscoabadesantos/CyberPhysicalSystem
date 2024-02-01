# Use the official Python image as the base image
FROM python:3.9-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the necessary files to the container
COPY maintenance.py .
COPY maintenance_pb2.py .
COPY maintenance_pb2_grpc.py .

# Install the required dependencies
RUN pip install grpcio
RUN pip install grpcio-tools
RUN pip install google
RUN pip install google protobuf

# Expose the port on which the server listens
EXPOSE 50051

# Set the command to run the server when the container starts
CMD [ "python", "maintenance.py" ]