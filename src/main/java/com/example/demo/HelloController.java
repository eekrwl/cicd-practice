package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/dev")
    public String develop() {
        return "develop";
    }

    @GetMapping("hi")
    public String hi() {
        return "hi";
    }
}
