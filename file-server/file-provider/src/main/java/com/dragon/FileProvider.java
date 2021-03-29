package com.dragon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by Dragon
 */
@SpringBootApplication
/*@EnableEurekaClient*/
@MapperScan(basePackages = "com.dragon.mapper")
public class FileProvider {

    public static void main(String[] args) {
        SpringApplication.run(FileProvider.class,args);
    }
}
