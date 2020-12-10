package com.care.shopping.centercontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CenterController {
	@RequestMapping("notice")
	public String notice() {
		return "center/notice";
	}
	@RequestMapping("board")
	public String board() {
		return "center/board";
	}
	@RequestMapping("event")
	public String event() {
		return "center/event";
	}
	@RequestMapping("QnA")
	public String QnA() {
		return "center/QnA";
	}
	@RequestMapping("boardWriting")
	public String boardWriting() {
		return "center/boardWriting";
	}
}
