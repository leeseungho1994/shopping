package com.care.shopping.mypagecontroller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.care.shopping.mypageservice.MyPageService;

@Controller
public class MyPageController {
	@Autowired
	private MyPageService mps;
	
	@RequestMapping("myPageLogin")
	public String myPageLogin(HttpServletRequest request, HttpSession session, Model model) {
		 mps.loginCheck(request, session, model);
		 return "mypage/loginCheck";
	}
}
