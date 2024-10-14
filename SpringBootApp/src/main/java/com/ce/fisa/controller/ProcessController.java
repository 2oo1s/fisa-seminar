package com.ce.fisa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class ProcessController {

//	@GetMapping("/lamda")
//	public String reqRes() {
//		log.info("요청 수락 ~~~");
//		return "Lamda식으로 변화 감지하기 성공!!!"; // 이 메서드는 REST 응답으로 사용할 수 있습니다.
//	}

	@GetMapping("")
	public String reqRe2s() {
		log.info("요청 수락 ~~~");
		return "index";
	}
}
