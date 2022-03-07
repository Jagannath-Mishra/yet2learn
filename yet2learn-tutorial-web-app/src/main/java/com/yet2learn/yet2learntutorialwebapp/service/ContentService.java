package com.yet2learn.yet2learntutorialwebapp.service;

import java.util.List;

import com.yet2learn.yet2learntutorialwebapp.payload.ContentResponseDTO;

public interface ContentService {

	ContentResponseDTO getContentByCourseName(String courseName);

	List<ContentResponseDTO> getContentById(Long contentId);

}
