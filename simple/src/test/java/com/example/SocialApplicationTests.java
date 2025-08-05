package com.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

@SpringBootTest
@SpringJUnitConfig
class SocialApplicationTests {

    @Test
    @DisplayName("Loads the application context successfully")
    void contextLoads() {
        assertDoesNotThrow(() -> {
        }, "Application context should load");
    }
}