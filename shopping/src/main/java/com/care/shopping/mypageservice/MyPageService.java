package com.care.shopping.mypageservice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.care.shopping.mypagedao.MyPageDAO;
import com.care.shopping.mypagedto.MyPageDTO;

@Service
public class MyPageService {
	@Autowired MyPageDAO dao;
	public void loginCheck(HttpServletRequest request, HttpSession session, Model model) {
		
		MyPageDTO d = dao.loginCheck(request.getParameter("id"), request.getParameter("pw"));
		
		if(d != null) {
			session.setAttribute("loginSession", d.getId());
			model.addAttribute("list", d);
			
		}else {
			System.out.println("일치하는 값이 없다...");
		}
	}
	
}
