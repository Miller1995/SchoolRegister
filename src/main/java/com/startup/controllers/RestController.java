package com.startup.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class RestController {
    @GetMapping("/rest")
    public String sayHello() {
        return "Say hello from Rest Controller";
    }
}
