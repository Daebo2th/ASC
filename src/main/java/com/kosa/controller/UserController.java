package com.kosa.controller;

import java.security.Principal;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kosa.dao.UserDAO;
import com.kosa.dto.UserInfoDTO;
import com.kosa.service.ShaEncoder;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	ShaEncoder shaEncoder;
	
	@Autowired
	UserDAO dao;

    @Autowired
    SqlSessionTemplate sqlSession;
	
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

    @GetMapping("/logout.do")
    public String logoutPage(HttpServletRequest request, HttpServletResponse response){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
            System.out.println("asd");
        if (auth != null) {
            System.out.println("asd2");
            new SecurityContextLogoutHandler().logout(request, response, auth);
        }
        
        return "redirect:/login?logout=true";
    }

    @GetMapping("/main.do")
    public String user() {

        return "index";
    }
    

    //session에 저장된 uid를 가져와서 삭제 시켜줌 
    @GetMapping("/delete.do")
    public String deleteUser(String uId, Model model, Principal principal) {
        if(principal != null && principal.getName().equals(uId)) { // 인증된 사용자인지 검사
            dao.delete(uId);
            
            return "redirect:/logout"; // 삭제 성공 하면 로그아웃 
        } else {
            model.addAttribute("errorMessage", "삭제할 수 없는 사용자입니다.");
            return "error";
        }
    }
    @GetMapping("/select.do")
    public String selectById(@RequestParam String uId, Model model) {
    	   UserInfoDTO userInfo = dao.selectById(uId);
           model.addAttribute("userInfo", userInfo);
           return "user/select";
    }
    
    @GetMapping("/updateform.do")
    public String updateForm() {


        return "user/updateform";
    }
    
    @PostMapping("/update.do")
    public String updateInfo(String name, String id, String pwd, int age, String gender) {
    	String dbpw = shaEncoder.saltEncoding(pwd, id);
    	Map<String, String> map = new HashMap<String, String>();
    	map.put("uId", id);
    	map.put("pwd", dbpw);
    	dao.updateInfo(new UserInfoDTO(id, name, gender, age));
    	dao.updatePwd(map);
    	return "redirect:/";
    }
}
