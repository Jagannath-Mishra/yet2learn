package com.yet2learn.yet2learntutorialwebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CommonController {
	
	

	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/sign-in")
	public String login() {
		return "login";
	}
	
	@RequestMapping("/sign-up")
	public String register() {
		return "register";
	}
	
	@RequestMapping("/welcome")
	public String welcome() {
		return "welcome";
	}
	
	@RequestMapping("/browse")
	public String browse() {
		return "browse";
	}
	
	@RequestMapping("/archive")
	public String archive() {
		return "archive";
	}
	
	@RequestMapping("/single")
	public String single() {
		return "single";
	}
	
	
}
