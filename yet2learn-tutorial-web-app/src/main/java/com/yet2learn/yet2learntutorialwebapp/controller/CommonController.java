package com.yet2learn.yet2learntutorialwebapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yet2learn.yet2learntutorialwebapp.payload.SubContentResponseDTO;
import com.yet2learn.yet2learntutorialwebapp.service.ContentService;
import com.yet2learn.yet2learntutorialwebapp.service.CourseService;
import com.yet2learn.yet2learntutorialwebapp.service.SubContentService;

@Controller
public class CommonController {

	@Autowired
	CourseService courseService;

	@Autowired
	ContentService contentService;

	@Autowired
	SubContentService subContentService;

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

	@RequestMapping("/{url}")
	public String single(@PathVariable("url") String url, Model model) {
		model.addAttribute("courses", courseService.getAllCourse());
		SubContentResponseDTO subContentDTO = subContentService.getSubContentByURL(url);
		System.out.println(subContentDTO.toString());
		model.addAttribute("contents", subContentDTO);
		model.addAttribute("tableOfContents", contentService.getContentById(subContentDTO.getContent().getId()));
		return "single";
	}

	@RequestMapping("/navigate/{page-id}")
	public String pageNavigate(@PathVariable("page-id") Long id) {
		SubContentResponseDTO subContentDTO = subContentService.getSubContentById(id);
		String url = subContentDTO.getSubContentMetaURL();
		return "redirect:/" + url;

	}

}
