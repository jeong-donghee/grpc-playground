package com.github.grpc_playground.service.client;

import com.example.grpc.hello.HelloServiceGrpc;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.grpc.client.GrpcChannelFactory;

@Configuration
public class GrpcConfig {

    @Bean
    HelloServiceGrpc.HelloServiceBlockingStub stub(GrpcChannelFactory channels) {
        return HelloServiceGrpc.newBlockingStub(channels.createChannel("local-grpc-server"));
    }
}
