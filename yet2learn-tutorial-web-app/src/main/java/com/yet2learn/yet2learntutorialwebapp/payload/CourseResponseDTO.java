package com.yet2learn.yet2learntutorialwebapp.payload;

import java.util.Set;

import com.yet2learn.yet2learntutorialwebapp.entity.Content;

public class CourseResponseDTO {

	private String courseName;

	private String courseDesc;
	
	private String url;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	private boolean enable;
	
	private Set<Content> content;

	public String getCourseName() {
		return courseName;
	}
	
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseDesc() {
		return courseDesc;
	}

	public void setCourseDesc(String courseDesc) {
		this.courseDesc = courseDesc;
	}

	public boolean isEnable() {
		return enable;
	}

	public void setEnable(boolean enable) {
		this.enable = enable;
	}

	public Set<Content> getContent() {
		return content;
	}

	public void setContent(Set<Content> content) {
		this.content = content;
	}
	
	
}
