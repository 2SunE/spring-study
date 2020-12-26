package com.mycompany.webapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/* 
	컨트롤러 역할을 할 클래스에 @Controller 어노테이션 적용
	- 컨트롤러 빈을 생성해서 싱글톤으로 관리
	- 기본 생성자를 이용해서 객체 생성
*/
@Controller
@RequestMapping("/ch01")
public class Ch01Controller {
	private static final Logger logger = LoggerFactory.getLogger(Ch01Controller.class);

	@RequestMapping("/content")
	public String home() {
		logger.info("실행");
		return "ch01/content";
	}

}
