package com.demo.awsparamterstore;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AWSParameterStoreDemo implements CommandLineRunner {

    @Value("${message}")
    private String test;

    @Override
    public void run(String... args) {
        System.out.println("test parameter: " + test);
    }
}

