package com.audi.infrastructure;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
@Slf4j
public class InfrastructureApplication {
    public static void main(String[] args) {
        SpringApplication.run(InfrastructureApplication.class, args);
        log.info("infrastructure service started success...");
    }
}
