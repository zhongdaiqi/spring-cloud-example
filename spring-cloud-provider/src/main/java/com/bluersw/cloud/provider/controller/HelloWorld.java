package com.bluersw.cloud.provider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

	@RequestMapping("/hello")
	public String Hello(@RequestParam String name){
		return "你好！" + name + ",这是一个微服务。";
	}
}
