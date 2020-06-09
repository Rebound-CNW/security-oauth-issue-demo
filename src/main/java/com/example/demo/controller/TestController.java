package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping(path = "/")
    @PreAuthorize("isNice()")
    public ResponseEntity<?> test(){
        return ResponseEntity.ok("Hallo Welt");
    }
}
