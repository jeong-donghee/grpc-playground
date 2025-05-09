package com.github.grpc_playground.service.client;

import com.example.grpc.hello.HelloRequest;
import com.example.grpc.hello.HelloServiceGrpc;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HelloGrpcClient {

    private final HelloServiceGrpc.HelloServiceBlockingStub stub;

    public String sayHello(String name) {
        return stub.sayHello(HelloRequest.newBuilder()
                        .setName(name)
                        .build())
                .getMessage();
    }
}
