package com.rim2.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "hello";
    }

    @GetMapping("/hope")
    public String hope() {
        return "hope";
    }
}
