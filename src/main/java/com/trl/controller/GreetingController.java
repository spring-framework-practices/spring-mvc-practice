package com.trl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingController {

    @GetMapping(path = "/")
    public String greeting3() {
        return "greeting";
    }
}
