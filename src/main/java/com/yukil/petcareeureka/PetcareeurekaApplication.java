package com.yukil.petcareeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PetcareeurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(PetcareeurekaApplication.class, args);
    }

}
