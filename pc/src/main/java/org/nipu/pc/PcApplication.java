package org.nipu.pc;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.core.env.Environment;

import javax.annotation.PostConstruct;

@SpringBootApplication
@EnableDiscoveryClient
@Slf4j
public class PcApplication {

    public static void main(String[] args) {
        SpringApplication.run(PcApplication.class, args);
        log.info("Catalog application have been started.");
    }
}
