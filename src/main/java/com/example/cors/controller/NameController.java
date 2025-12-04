package com.example.cors.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class NameController {

    @CrossOrigin("http://localhost:8080")
    @GetMapping("/name")
    public String getName(@RequestParam String name) {
        return name;
    }

    @PostMapping("/reverse-name")
    public String getReverseName(@RequestParam String name) {

        StringBuilder stringToReverse = new StringBuilder();
        stringToReverse.append(name);
        stringToReverse.reverse();

        return stringToReverse.toString();
    }
}
