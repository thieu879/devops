package com.data.hn_ks23_nguyengiathieu_002.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/api/hello")
    public String hello() {
        return "Hello from Nguyen Gia Thieu - K23!";
    }

    @GetMapping("/api/status")
    public String status() {
        return "Backend is running OK!";
    }
}