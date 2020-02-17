package org.nipu.po;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
@Slf4j
public class PoApplication {

    public static void main(String[] args) {
        SpringApplication.run(PoApplication.class, args);
        log.info("Order application have been started.");
    }
}
