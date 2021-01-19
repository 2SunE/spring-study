package com.mycompany.webapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

// @Annotation 작성 위치 -> 클래스, 필드, 메소드, 매개변수
@Controller
@RequestMapping("/ch02") // 클래스에 @RequestMapping 적용되면 공통 경로 -> http://localhost:8080/webapp/ch02
public class Ch02Controller {
	private static final Logger logger = LoggerFactory.getLogger(Ch02Controller.class);
	
	// 메소드에 @RequestMapping, @GetMapping, @PostMapping 적용되면 세부 경로
	// RequestMapping 메소드 -> HTTP 요청에 따라 요청 처리 및 Service로 처리 위임, HTTP 응답 방법을 결정하고 뷰 이름 리턴 
	@RequestMapping("/content")
	public String content() {
		logger.info("content 메소드 실행");
		return "ch02/content";
	}
	
	// HTTP GET 요청을 특정 핸들러 메소드에 맵핑하기 위한 annotation, 주소에 파라미터가 노출된다.
	// @RequestMapping(method = RequestMethod.GET, path = "/getMethod") 같은 형태
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
	
	@RequestMapping(method = RequestMethod.GET, path = "/join")
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
