package com.kosa.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;

public class UserDeniedHandler implements AccessDeniedHandler {

	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response,
			AccessDeniedException accessDeniedException) throws IOException, ServletException {
		
		request.setAttribute("errMsg", "관리자만 이용 가능");
		
		String url = "/WEB-INF/views/user/denied.jsp";
		
		request.getRequestDispatcher("/WEB-INF/views/user/denied.jsp").forward(request, response);
	}
	
	
}
