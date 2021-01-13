package com.mycompany.webapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ch02")
public class Ch02Controller {
	private static final Logger logger = LoggerFactory.getLogger(Ch02Controller.class);
	
	@RequestMapping("/content")
	public String content() {
		logger.info("content 메소드 실행");
		return "ch02/content";
	}
	
	@GetMapping("/getMethod")
	public String getMethod() {
		logger.info("getMethod 실행");
		return "ch02/content";
	}
	
	@PostMapping("/postMethod")
	public String postMethod() {
		logger.info("postMethod 실행");
		return "ch02/content";
	}
	
	@GetMapping("/join")
	public String joinForm() {
		logger.info("실행");
		return "ch02/joinForm";
	}
	
	@PostMapping("/join")
	public String join() {
		logger.info("실행");
		return "ch02/content";
	}
	
}
