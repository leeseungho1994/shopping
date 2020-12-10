package com.care.shopping.indexcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping("index")
	public String index() {
		return "index/index";
	}
	@RequestMapping("myPage")
	public String myPage() {
		return "mypage/myPage";
	}
	@RequestMapping("center")
	public String center() {
		return "center/center";
	}
}
