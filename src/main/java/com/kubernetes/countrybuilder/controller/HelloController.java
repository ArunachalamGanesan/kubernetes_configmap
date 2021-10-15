package com.kubernetes.countrybuilder.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Value("${country:England}")
    private String country;

    @GetMapping("/hi")
    public String returnmessage(){
        return new String(country);
    }
}
