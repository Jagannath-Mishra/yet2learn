package com.yet2learn.yet2learntutorialwebapp.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yet2learn.yet2learntutorialwebapp.payload.SubContentResponseDTO;
import com.yet2learn.yet2learntutorialwebapp.repository.SubContentRepository;
@Service
public class SubContentServiceImpl implements SubContentService {

	@Autowired
	ModelMapper mapper;
	
	@Autowired
	private SubContentRepository subContentRepository;
	
	@Override
	public SubContentResponseDTO getSubContentByURL(String url) {
		return mapper.map(subContentRepository.findBySubContentMetaURL(url), SubContentResponseDTO.class);
	}

}
