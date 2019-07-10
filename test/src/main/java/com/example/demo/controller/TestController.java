package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

	@Value("${username:null}")
	private String username;

	@RequestMapping(value = "/getUser")
	@ResponseBody
	public String getUser() {
		return username;
	}
}
