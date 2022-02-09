package com.yet2learn.yet2learntutorialwebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CommonController {
	
	
	@RequestMapping("/auth-user")
	public String welcome(Model model) {
		return "welcome";
	}
	@RequestMapping("/")
	public String index() {
		return "index";
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
