package com.example.carPricing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Creates a Spring Boot Application to run the Pricing Service.
 */
@EnableEurekaClient
@SpringBootApplication
public class CarPricingServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarPricingServiceApplication.class, args);
    }

}
