package com.yet2learn.yet2learntutorialwebapp.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yet2learn.yet2learntutorialwebapp.entity.SubContent;
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
//		SubContent subContent = subContentRepository.findBySubContentMetaURL(url);
		SubContentResponseDTO subContentResponseDTO = mapper.map(subContentRepository.findBySubContentMetaURL(url), SubContentResponseDTO.class);
//		subContentResponseDTO.setId(subContent.getId());
//		System.out.println("ID:"+subContent.getId());
//		subContentResponseDTO.setContent(subContent.getContent());
//		subContentResponseDTO.setEnable(subContent.isEnable());
//		subContentResponseDTO.setHits(subContent.getHits());
//		subContentResponseDTO.setLastModifiedBy(subContent.getLastModifiedBy());
//		subContentResponseDTO.setLastModifiedDate(subContent.getLastModifiedDate());
//		subContentResponseDTO.setNextPageId(subContent.getNextPageId());
//		subContentResponseDTO.setPrevPageId(subContent.getPrevPageId());
//		subContentResponseDTO.setSubContentBody(subContent.getSubContentBody());
//		subContentResponseDTO.setSubContentHeading(subContent.getSubContentHeading());
//		subContentResponseDTO.setSubContentMetaURL(subContent.getSubContentMetaURL());
//		subContentResponseDTO.setSubContentSortName(subContent.getSubContentSortName());
		if(subContentResponseDTO.getNextPageId()!= null) {
		SubContent nextContent = subContentRepository.getById(subContentResponseDTO.getNextPageId());
		subContentResponseDTO.setNextTopic(nextContent.getSubContentHeading());
		}
		return subContentResponseDTO;
	}

	@Override
	public SubContentResponseDTO getSubContentById(Long id) {
		return mapper.map(subContentRepository.getById(id), SubContentResponseDTO.class);
	}

}
