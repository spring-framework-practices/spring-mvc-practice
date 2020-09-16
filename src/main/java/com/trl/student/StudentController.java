package com.trl.student;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/showForm")
    public String showForm (Model model) {

        Student student = new Student();

        model.addAttribute("student", student);
        model.addAttribute("countries", Country.values());
        model.addAttribute("programmingLanguages", ProgrammingLanguage.values());
        model.addAttribute("operatingSystems", OperatingSystem.values());

        return "student/student-form";
    }

    @RequestMapping("/processForm")
    public String processForm (@ModelAttribute("student") Student student) {

        return "student/student-confirmation";
    }

    @RequestMapping("/processFormVersionTwo")
    public String processFormVersionTwo (Model model) {

        return "student/student-confirmation";
    }
}
