package com.microservicelab1.kitchensvc;

import io.micrometer.core.annotation.Counted;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@SpringBootApplication
@RestController
public class KitchenSvcApp {
    
    private final String restVal = "-received-kitchen";

    public static void main(String[] args) {
        SpringApplication.run(KitchenSvcApp.class, args);
    }

    @PostMapping(path = "ticket/create/{orderId}")
    @Counted
    public String createOrder(@PathVariable(name = "orderId") String orderId) {
        log.info("Received order creation request for orderId: {}", orderId);
        return orderId + restVal;
    }
}