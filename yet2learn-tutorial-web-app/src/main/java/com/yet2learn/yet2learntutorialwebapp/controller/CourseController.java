package com.yet2learn.yet2learntutorialwebapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CourseController {

	private static final Logger logger = LoggerFactory.getLogger(CourseController.class);

	@RequestMapping(value = "/courses/create", method = RequestMethod.GET)
	public String createNewCourse() {
		return "new-course";
	}

}
