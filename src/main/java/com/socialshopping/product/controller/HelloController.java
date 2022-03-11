package com.socialshopping.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String readiness() {
        return "Hello, World!\nThe Application is ready to use!";
    }


}
