package com.ce.fisa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class ProcessController {

	@GetMapping("")
	public String reqRes() {
		log.info("요청이 정상적으로 들어왔습니다!!!");
		
		return "index";
	}
}
