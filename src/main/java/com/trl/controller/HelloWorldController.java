package com.trl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {

    @GetMapping(path = "/showForm")
    public String showForm () {
        return "hello-world-form";
    }

    @GetMapping(path = "/processForm")
    public String processForm () {
        return "hello-world-process-form";
    }
}
