package com.trl.hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

    @GetMapping(path = "/showForm")
    public String showForm () {
        return "hello-world-form";
    }

    @GetMapping(path = "/processForm")
    public String processForm () {
        return "hello-world-process-form";
    }

    @GetMapping(path = "/processFormVersionTwo")
    public String processFormVersionTwo (HttpServletRequest request, Model model) {

        String studentName = request.getParameter("studentName");

        studentName = studentName.toUpperCase();

        String result = "Yo! " + studentName;

        model.addAttribute("message", result);

        return "hello-world-process-form";
    }

    @GetMapping(path = "/processFormVersionThree")
    public String processFormVersionThree (@RequestParam("studentName") String studentName, Model model) {

        studentName = studentName.toUpperCase();

        String result = "Yo! " + studentName;

        model.addAttribute("message", result);

        return "hello-world-process-form";
    }
}
