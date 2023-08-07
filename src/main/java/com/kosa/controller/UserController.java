package com.kosa.controller;

import com.kosa.dto.UserDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("/join.do")
    public String join(Model model){

        return "user/join";
    }

    @PostMapping("/join.do")
    public String joinForm(UserDTO dto){

        return "user/join";
    }

    @GetMapping("login.do")
    public String login(){

        return "user/login";
    }

    @PostMapping("login.do")
    public String loginForm(String id){

        return "user/login";
    }

    @PostMapping("/logout.do")
    public String logout(){

        return "redirect:/login";
    }



}
