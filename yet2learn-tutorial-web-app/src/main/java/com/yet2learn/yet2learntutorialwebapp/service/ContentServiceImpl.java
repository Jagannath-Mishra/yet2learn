package com.yet2learn.yet2learntutorialwebapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yet2learn.yet2learntutorialwebapp.entity.Content;
import com.yet2learn.yet2learntutorialwebapp.payload.ContentResponseDTO;
import com.yet2learn.yet2learntutorialwebapp.repository.ContentRepository;
import com.yet2learn.yet2learntutorialwebapp.repository.SubContentRepository;

@Service
public class ContentServiceImpl implements ContentService {

	@Autowired
	ContentRepository contentRepository;

	@Autowired
	SubContentRepository subContentRepository;

	@Override
	public ContentResponseDTO getContentByCourseName(String courseName) {

		return null;
	}

	@Override
	public List<ContentResponseDTO> getContentById(Long contentId) {
		Content content = contentRepository.getById(contentId);
		List<Content> listContent = contentRepository.findByCourseId(content.getCourse().getId());
		List<ContentResponseDTO> response = new ArrayList<>();
		for (Content data : listContent) {
			ContentResponseDTO obj = new ContentResponseDTO();
			obj.setContentHeading(data.getContentHeading());
			obj.setSubContent(data.getSubContent());
			response.add(obj);
		}
		System.out.println(response);
		return response;
	}

}
