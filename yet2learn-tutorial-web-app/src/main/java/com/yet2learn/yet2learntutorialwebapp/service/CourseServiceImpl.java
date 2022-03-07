package com.yet2learn.yet2learntutorialwebapp.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yet2learn.yet2learntutorialwebapp.payload.CourseResponseDTO;
import com.yet2learn.yet2learntutorialwebapp.repository.CourseRepository;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	CourseRepository courseRepository;

	@Autowired
	ModelMapper mapper;

	@Override
	public List<CourseResponseDTO> getAllCourse() {
		return courseRepository.findAll().stream().map(course -> mapper.map(course, CourseResponseDTO.class))
				.collect(Collectors.toList());

	}

}
