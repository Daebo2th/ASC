package com.kosa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class MainController {

    @GetMapping("/")
    public String main(Model model, Principal principal){

        model.addAttribute("userName", principal.getName());

        return "index";
    }

}
