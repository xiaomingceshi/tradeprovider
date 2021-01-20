package com.cloud.cloudbootprovidertrade;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CloudBootProviderTradeApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudBootProviderTradeApplication.class, args);
    }

}
