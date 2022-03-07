package com.yet2learn.yet2learntutorialwebapp.service;

import com.yet2learn.yet2learntutorialwebapp.payload.SubContentResponseDTO;

public interface SubContentService {

	SubContentResponseDTO getSubContentByURL(String url);

	SubContentResponseDTO getSubContentById(Long id);

}
