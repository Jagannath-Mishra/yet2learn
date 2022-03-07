package com.yet2learn.yet2learntutorialwebapp.payload;

import java.util.List;

import com.yet2learn.yet2learntutorialwebapp.entity.SubContent;

public class ContentResponseDTO {

	private String contentHeading;

	private List<SubContent> subContent;

	public String getContentHeading() {
		return contentHeading;
	}

	public void setContentHeading(String contentHeading) {
		this.contentHeading = contentHeading;
	}

	public List<SubContent> getSubContent() {
		return subContent;
	}

	public void setSubContent(List<SubContent> subContent) {
		this.subContent = subContent;
	}

	@Override
	public String toString() {
		return "ContentResponseDTO [contentHeading=" + contentHeading + ", subContent=" + subContent + "]";
	}
	

}
