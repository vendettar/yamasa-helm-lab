package com.microservicelab1.restaurantsvc;

import com.microservicelab1.restaurantsvc.domain.VerifyOrderResult;
import io.micrometer.core.annotation.Counted;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RestaurantSvcApp {
    private final String restVal = "received restaurant";

    public static void main(String[] args) {
        SpringApplication.run(RestaurantSvcApp.class, args);
    }

    @GetMapping(path = "order/verify")
    @Counted
    public VerifyOrderResult verifyOrderDetails(@RequestParam(name = "orderId") String orderId) {
        return new VerifyOrderResult(true, restVal);
    }
}
