package com.kubernetes.countrybuilder.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
@Slf4j
public class HelloController {

    @Value("${country:England}")
    private String country;

    @Value("${secretcode}")
    private String secretCode;

    @GetMapping("/hi")
    public String returnmessage(){
        return new String(country);
    }

    @GetMapping("/secret")
    public String returnSecret(){
        log.info("secret is: {}",secretCode);
        return secretCode;
    }
}
