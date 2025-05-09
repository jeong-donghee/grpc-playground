package com.github.grpc_playground.service.server;

import com.example.grpc.hello.HelloRequest;
import com.example.grpc.hello.HelloResponse;
import com.example.grpc.hello.HelloServiceGrpc;
import io.grpc.stub.StreamObserver;
import org.springframework.grpc.server.service.GrpcService;

@GrpcService
public class HelloServiceImpl extends HelloServiceGrpc.HelloServiceImplBase {

    @Override
    public void sayHello(HelloRequest request, StreamObserver<HelloResponse> responseObserver) {
        String name = request.getName();
        HelloResponse response = HelloResponse.newBuilder()
                .setMessage("Hello " + name)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
