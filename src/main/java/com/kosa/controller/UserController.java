package com.kosa.controller;

import com.kosa.dto.UserDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @GetMapping("/join")
    public String join(Model model){

        return "join";
    }

    @PostMapping("/join")
    public String joinForm(UserDTO dto){

        return "join";
    }

    @GetMapping("login")
    public String login(){

        return "login";
    }

    @PostMapping("login")
    public String loginForm(String id){

        return "login";
    }



    @PostMapping("/logout")
    public String logout(){

        return "redirect:/login";
    }



}
