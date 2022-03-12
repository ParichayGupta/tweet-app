package com.tweetapp.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tweetapp.dto.RegisterRequest;

@RestController
@RequestMapping("/api/v1.0/tweets/auth")
public class AuthController {

	
	@PostMapping("/register")
	public void register(@RequestBody RegisterRequest registerUser) {}
}
