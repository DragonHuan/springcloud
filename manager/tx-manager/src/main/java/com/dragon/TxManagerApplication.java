package com.dragon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by Dragon
 */
@SpringBootApplication
@EnableEurekaClient
public class TxManagerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EnableEurekaClient.class,args);
    }
}
