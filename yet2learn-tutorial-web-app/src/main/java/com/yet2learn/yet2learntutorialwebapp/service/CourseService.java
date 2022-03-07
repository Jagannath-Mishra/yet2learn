package com.yet2learn.yet2learntutorialwebapp.service;

import java.util.List;

import com.yet2learn.yet2learntutorialwebapp.payload.CourseResponseDTO;

public interface CourseService {

	List<CourseResponseDTO> getAllCourse();
}
