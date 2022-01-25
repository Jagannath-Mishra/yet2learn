package com.yet2learn.yet2learntutorialwebapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.yet2learn.yet2learntutorialwebapp.repository.UserRepository;

@Controller
public class UserContorller {

	@Autowired
	UserRepository userRepository;
	
	
	
}
