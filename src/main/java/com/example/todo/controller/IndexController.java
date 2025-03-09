package com.example.todo.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class IndexController {

    // http:localhost:8080/ -> "Hello, world!"
    // GET / -> "Hello, world!"
    @GetMapping
    public string index() {
        return "index";
    }

}
