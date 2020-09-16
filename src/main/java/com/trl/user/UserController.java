package com.trl.user;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping(path = "/user")
public class UserController {

    @InitBinder
    public void initBinding(WebDataBinder dataBinder) {

        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }

    @GetMapping(path = "/sign-up")
    public String showForm(Model model) {

        UserDTO userDTO = new UserDTO();

        model.addAttribute("user", userDTO);

        return "user/sign-up-form";
    }

    @PostMapping(path = "/show-user-data")
    public String showUserData(@Valid @ModelAttribute("user") UserDTO userDTO, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "user/sign-up-form";
        } else {
            return "user/show-user-data";
        }

    }

}
