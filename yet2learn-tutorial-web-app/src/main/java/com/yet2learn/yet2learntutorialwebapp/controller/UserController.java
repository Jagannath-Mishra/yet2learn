package com.yet2learn.yet2learntutorialwebapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.yet2learn.yet2learntutorialwebapp.entity.User;
import com.yet2learn.yet2learntutorialwebapp.payload.UserDTO;
import com.yet2learn.yet2learntutorialwebapp.service.SecurityService;
import com.yet2learn.yet2learntutorialwebapp.service.UserService;

@Controller
public class UserController {

	private static final Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private UserService userService;

	@Autowired
	private SecurityService securityService;

	@GetMapping("/sign-up")
	public String register(Model model) {
		if (securityService.isAuthenticated()) {
			return "redirect:/auth-user";
		}
		model.addAttribute("UserDTO", new UserDTO());
		return "register";
	}

	@PostMapping("/sign-up")
	public String registration(@ModelAttribute("UserDTO") UserDTO userDTO, BindingResult bindingResult) {
		User user = new User();
		user.setFirstName(userDTO.getFname());
		user.setLastName(userDTO.getLname());
		user.setPassword(userDTO.getPassword());
		user.setEmail(userDTO.getEmail());
		userService.save(user);

		securityService.autoLogin(userDTO.getEmail(), userDTO.getPassword());

		return "redirect:/auth-user";
	}

	@GetMapping("/sign-in")
	public String login(Model model, String error, String logout) {
		if (securityService.isAuthenticated()) {
			return "redirect:/auth-user";
		}

		if (error != null)
			model.addAttribute("error", "Your username and password is invalid.");

		if (logout != null)
			model.addAttribute("message", "You have been logged out successfully.");

		return "login";
	}

}