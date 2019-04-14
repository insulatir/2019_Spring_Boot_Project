package com.the23rdTeam.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SUMMERNOR_V4Service {

    public static void main(String[] args) {
        SpringApplication.run(SUMMERNOR_V4Service.class, args);
    }
}
