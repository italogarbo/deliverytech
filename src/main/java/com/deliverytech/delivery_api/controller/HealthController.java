package com.deliverytech.delivery_api.controller;

import java.time.LocalDateTime;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/health")
    public Map<String, String> healthCheck() {
        return Map.of(
        "status", "UP", 
        "timestamp", LocalDateTime.now().toString(),
        "service", "Delivery API",
        "javaVersion", System.getProperty("java.version")
        );
    }

    @GetMapping("/info")
    
    public AppInfo info() {
        return new AppInfo(
            "Delivery Tech API", 
            "1.0.0", 
            "JDK 21.",
            "Spring Boot 3.5.6"
        
        );
    
    }
    public record AppInfo(
        String applicatioString,
        String version,
        String developer,
        String framework
        ){}
    }