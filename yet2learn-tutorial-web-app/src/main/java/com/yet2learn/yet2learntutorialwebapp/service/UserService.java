package com.yet2learn.yet2learntutorialwebapp.service;

import com.yet2learn.yet2learntutorialwebapp.entity.User;

public interface UserService {

	void save(User user);

	User findByUsername(String username);

	User findByEmail(String email);
}