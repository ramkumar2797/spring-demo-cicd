package com.azuretraining.spring_sample_app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping
    public String index(){
        return "Hello All, Day 4 azure training";
    }
}
