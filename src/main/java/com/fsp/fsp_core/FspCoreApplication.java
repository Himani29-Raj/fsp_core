package com.fsp.fsp_core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("tutorial")
public class FspCoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(FspCoreApplication.class, args);
    }

}
