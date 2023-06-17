package com.test.eureka.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class Application {

    @Value("${server.port}")
    String port;

    @RequestMapping("/")
    public String home() {
        return "欢迎光临，服务端口号为：" + port;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}