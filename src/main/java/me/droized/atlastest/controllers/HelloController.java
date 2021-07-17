package me.droized.atlastest.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/")
public class HelloController {

    @GetMapping(path = "/greeting")
    public String hello() {
        return "Hello World !";
    }
}
