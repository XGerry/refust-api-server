package com.spread.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author:Gerry
 * @description:
 * @date: Created in 2018/11/20
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.spread.api"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
