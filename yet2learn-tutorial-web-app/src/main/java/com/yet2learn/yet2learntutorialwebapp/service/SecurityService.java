package com.yet2learn.yet2learntutorialwebapp.service;

import com.yet2learn.yet2learntutorialwebapp.entity.User;

public interface SecurityService {
	
	boolean isAuthenticated();

	void autoLogin(String username, String password);

	User getCurrentLoggedInUserDetails();
}