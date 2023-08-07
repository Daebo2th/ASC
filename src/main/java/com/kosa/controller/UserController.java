package com.kosa.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kosa.dao.UserDAO;
import com.kosa.service.ShaEncoder;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	ShaEncoder shaEncoder;
	
	@Autowired
	UserDAO dao;
	
    @GetMapping("/join.do")
    public String join(Model model){

        return "user/join";
    }

    @PostMapping("/join.do")
    public String joinForm(String id, String pwd,
			String name, int age, String gender){
    	String dbpw = shaEncoder.saltEncoding(pwd, id);
    	Map<String, Object> map = new HashMap<>(); 
    	map.put("id", id);
    	map.put("pwd", dbpw);
    	map.put("name", name);
    	map.put("age", age);
    	map.put("gender", gender);
    	
    	dao.join(map);
        return "user/login";
    }

    @GetMapping("login.do")
    public String login(Model model, boolean fail) {
        if (fail) {
            System.out.println("실패");
        }
        return "user/login";
    }

    @PostMapping("/logout.do")
    public String logout() {

        return "redirect:/login";
    }

    @GetMapping("/")
    public String admin() {

        return "index";
    }

    @GetMapping("/main.do")
    public String user() {

        return "index";
    }


}
