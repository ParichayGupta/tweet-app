package com.tweetapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tweetapp.exception.EmailAlreadyExist;
import com.tweetapp.exception.UserNameAlreadyExist;
import com.tweetapp.exception.UserNotExistsException;
import com.tweetapp.model.User;
import com.tweetapp.service.RegisterationService;

import lombok.extern.slf4j.Slf4j;
import net.bytebuddy.dynamic.TypeResolutionStrategy.Passive;

@Slf4j
@RestController
@RequestMapping("/api/v1.0/tweets")
@CrossOrigin(origins = "http://localhost:4200")
public class RegisterationContorller {

	@Autowired
	RegisterationService registerationService;

	@PostMapping("/register")
	public User register(@RequestBody User user) throws EmailAlreadyExist, UserNameAlreadyExist {
		String userEmail = user.getUserEmail().trim();
		String userName = user.getUserName().trim();

		if (userEmail != null && !"".equals(userEmail)) {
			User checkUserEmail = registerationService.fetchUserByEmail(userEmail);
			if (checkUserEmail != null) {
				throw new EmailAlreadyExist("User with email: " + userEmail + " already exists!!");
			}
		}
		if (userName != null && !"".equals(userName)) {
			User checkUserName = registerationService.fetchUserByUserName(userName);
			if (checkUserName != null) {
				throw new UserNameAlreadyExist("User with username: " + userName + " already exists!!");
			}
		}
		User newUser = null;
		newUser = registerationService.saveUser(user);
		return newUser;
	}

	@PostMapping("/login")
	public User Login(@RequestBody User user) throws UserNotExistsException {
		String userEmail = user.getUserEmail().trim();
		String password = user.getPassword().trim();

//		log.info("Email: " + userEmail + " Password: " + password);
		User checkUser = null;
		if (userEmail != null && password != null) {
			checkUser = registerationService.fetchByUserEmailAndPassword(userEmail, password);
			if (checkUser == null) {
				log.info("Email: " + userEmail + " Password: " + password + " do not match");
				throw new UserNotExistsException("Bad Crediantials");
			}
		}
		return checkUser;
	}
}
