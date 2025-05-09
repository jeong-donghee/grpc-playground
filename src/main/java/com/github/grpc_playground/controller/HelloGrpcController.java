package com.github.grpc_playground.controller;

import com.github.grpc_playground.service.client.HelloGrpcClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HelloGrpcController {

    private final HelloGrpcClient client;

    @GetMapping("/hello")
    public String hello(@RequestParam String name) {
        return client.sayHello(name);
    }
}
