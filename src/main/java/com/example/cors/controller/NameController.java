package com.example.cors.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class NameController {
    
    //@CrossOrigin serve a non far bloccare le chiamate che provengono
    //da un dominio diverso da quello in cui gira la mia API, in questo caso localhost:3000
    @CrossOrigin("http://localhost:3000")
    @GetMapping("/name")
    public String getName(@RequestParam String name) {
        return name;
    }

    @PostMapping("/reverse-name")
    public String getReverseName(@RequestParam String name) {

        StringBuilder reversedString = new StringBuilder();
        reversedString.append(name);
        reversedString.reverse();

        return reversedString.toString();
    }
}
