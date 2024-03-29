package com.films.system.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class AppConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(AppConfigApplication.class, args);
    }
}
