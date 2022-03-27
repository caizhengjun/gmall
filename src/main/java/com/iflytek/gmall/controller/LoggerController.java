package com.iflytek.gmall.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggerController {

    @GetMapping("/applog")
    public String logger(String name, Integer age) {
        System.out.println(name);
        System.out.println(age);
        return "success";
    }
}
