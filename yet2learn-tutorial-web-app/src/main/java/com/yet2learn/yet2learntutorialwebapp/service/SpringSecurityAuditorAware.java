package com.yet2learn.yet2learntutorialwebapp.service;

import java.util.Optional;

import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.context.SecurityContextHolder;

import com.yet2learn.yet2learntutorialwebapp.entity.User;

public class SpringSecurityAuditorAware implements AuditorAware<String> {

	@Override
	public Optional<String> getCurrentAuditor() {

		User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

		return Optional.of(user.getUsername());
	}

}