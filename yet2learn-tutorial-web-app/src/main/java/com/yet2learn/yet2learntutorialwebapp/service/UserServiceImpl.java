package com.yet2learn.yet2learntutorialwebapp.service;

import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.Pbkdf2PasswordEncoder;
import org.springframework.stereotype.Service;

import com.yet2learn.yet2learntutorialwebapp.entity.User;
import com.yet2learn.yet2learntutorialwebapp.repository.RoleRepository;
import com.yet2learn.yet2learntutorialwebapp.repository.UserRepository;

@Service("userServiceImpl")
public class UserServiceImpl implements UserService {

	@Autowired
	@Qualifier("userRepository")
	private UserRepository userRepository;

	@Autowired
	@Qualifier("roleRepository")
	private RoleRepository roleRepository;

	@Autowired
	private Pbkdf2PasswordEncoder pbkdf2PasswordEncoder;

	@Override
	public void save(User user) {
		user.setPassword(pbkdf2PasswordEncoder.encode(user.getPassword()));
		user.setRoles(new HashSet<>(roleRepository.findAll()));
		//user.setRoles(new HashSet<>(roleRepository.findByName("USER")));
		userRepository.save(user);
	}

	@Override
	public User findByUsername(String username) {
		return userRepository.findByUsername(username);
	}

	@Override
	public User findByEmail(String email) {
		return userRepository.findByEmail(email);
	}
}