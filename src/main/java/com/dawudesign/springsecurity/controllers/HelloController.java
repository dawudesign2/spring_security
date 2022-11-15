package com.dawudesign.springsecurity.controllers;

import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class HelloController {
    @GetMapping("/")
    public String welcome() {
        return  "Welcome to the SHIELD";
    }

    @GetMapping("/avengers/assemble")
    public String champion() {
        return "Avengers... Assemble";
    }

    @GetMapping("/secret-bases")
    public List director() {
        List<String> france = new ArrayList<>();
        france.add("Biarritz");
        france.add("Bordeaux");
        france.add("La Loupe");
        france.add("Lille");
        france.add("Lyon");
        france.add("Marseille");
        france.add("Nantes");
        france.add("Orleans");
        france.add("Paris");
        france.add("Reims");
        france.add("Strasbourg");
        france.add("Toulouse");
        france.add("Tours");

        return france;
    }
}
