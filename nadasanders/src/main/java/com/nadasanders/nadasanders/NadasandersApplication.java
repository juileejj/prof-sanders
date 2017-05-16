package com.nadasanders.nadasanders;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = {
        "com.nadasanders.controller",
        "com.nadasanders.pojo",
        "com.nadasanders.repository",
        "com.nadasanders.service",
        "com.nadasanders.service.impl"
})
public class NadasandersApplication {

    public static void main(String[] args) {
        SpringApplication.run(NadasandersApplication.class, args);
    }
}
