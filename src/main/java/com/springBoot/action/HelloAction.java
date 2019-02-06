package com.springBoot.action;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloAction {

	@RequestMapping("/hello.action")
	public String hello() {
		return "Hello world";
	}
}
