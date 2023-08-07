package com.kosa.controller;

import com.kosa.dao.UserDAO;
import com.kosa.dto.UserInfoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;
import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private UserDAO userDAO;

    @GetMapping("/")
    public String adminPage(Model model, Principal principal){

        if(principal!=null) model.addAttribute("userName", principal.getName());
        else model.addAttribute("errMsg", "로그인한 사용자가 아닌데요?");

        List<UserInfoDTO> list = userDAO.selectAll();
        System.out.println(list);
        model.addAttribute("list", list);

        return "admin/main";
    }
}
