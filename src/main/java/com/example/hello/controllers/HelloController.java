package com.example.hello.controllers;

import com.example.hello.dtos.HelloDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloController {

    @GetMapping
    public ResponseEntity<HelloDTO> get() {

        return ResponseEntity.ok(HelloDTO.builder()
                .message("Hello, World!")
                .build());
    }
}
