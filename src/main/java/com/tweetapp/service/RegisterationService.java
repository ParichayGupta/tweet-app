package com.tweetapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tweetapp.model.User;
import com.tweetapp.repository.RegisterationRepository;

@Service
public class RegisterationService {

	@Autowired
	private RegisterationRepository registerationRepository;

	public User saveUser(User user) {
		return registerationRepository.save(user);
	}

	public User fetchUserByEmail(String email) {
		return registerationRepository.findByUserEmail(email);
	}

	public User fetchUserByUserName(String userName) {
		return registerationRepository.findByUserName(userName);
	}
	

	public User fetchByUserEmailAndPassword(String userEmail, String password) {
		return registerationRepository.findByUserEmailAndPassword(userEmail, password);
	}

}
