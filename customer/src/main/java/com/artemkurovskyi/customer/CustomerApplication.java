package com.artemkurovskyi.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(
        scanBasePackages = {
                "com.artemkurovskyi.amqp",
                "com.artemkurovskyi.customer"
                })
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.artemkurovskyi.clients")
public class CustomerApplication {
    public static void main(String[] args) {
        SpringApplication.run(CustomerApplication.class, args);
    }
}
