package com.microservicelab1.kitchensvc;

import io.micrometer.core.annotation.Counted;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class KitchenSvcApp {
    public static void main(String[] args) {
        SpringApplication.run(KitchenSvcApp.class, args);
    }

    @PostMapping(path = "ticket/create/{orderId}")
    @Counted
    public String createOrder(@PathVariable(name = "orderId") String orderId) {
        return orderId;
    }
}