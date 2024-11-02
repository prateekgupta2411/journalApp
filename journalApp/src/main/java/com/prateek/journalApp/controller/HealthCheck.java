package com.prateek.journalApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {
    @GetMapping("/health_Check")
    public String healthCheck() {
        return "OK";
    }
}
