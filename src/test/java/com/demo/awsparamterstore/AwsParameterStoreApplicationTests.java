package com.demo.awsparamterstore;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class AwsParameterStoreApplicationTests {

    @Value("${server.port}")
    private String serverPort;

    @Value("${management.endpoints.web.exposure.include}")
    private String endpoints;

    @Value("${message}")
    private String test;

    @Test
    void contextLoads() {
        assertEquals(serverPort, "9090");
        assertEquals(endpoints, "env");
        assertEquals(test, "test");
    }
}
