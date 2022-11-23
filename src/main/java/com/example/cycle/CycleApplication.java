package com.example.cycle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class CycleApplication {

    public static void main(String[] args) {
        SpringApplication.run(CycleApplication.class, args);
    }

}