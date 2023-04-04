package com.startup.controllers;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/testController")
    public String testController() {
        return "testController";
    }
}
