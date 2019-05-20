package com.liuliuge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FeignTutorialApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignTutorialApplication.class, args);
    }

}
