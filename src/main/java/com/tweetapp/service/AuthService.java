package com.tweetapp.service;
//
//import javax.sound.midi.VoiceStatus;
//import javax.transaction.Transactional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Service;
//
//import com.tweetapp.dto.RegisterRequest;
//import com.tweetapp.model.User;
//import com.tweetapp.repository.UserRepository;
//
//import lombok.AllArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//
//@Slf4j
//@Service
//@AllArgsConstructor // Constructor Injection
public class AuthService {
//
//	private final PasswordEncoder passwordEncoder;
//
//	private final UserRepository userRepository;
//
//	/**
//	 * This method will register a new user and save it to database.
//	 * The password is encoded as well for security
//	 * @Transactional because this method will interact with database.
//	 * @author PARICHAY GUPTA */
//	@Transactional
//	public void register(RegisterRequest registerRequest) {
//		
//		User user = new User();
//		user.setFirstName(registerRequest.getFirstName());
//		user.setLastName(registerRequest.getLastName());
//		user.setUserName(registerRequest.getUserName());
//		user.setUserEmail(registerRequest.getEmail());
//		user.setGender(registerRequest.getGender());
//		user.setPassword(passwordEncoder.encode(registerRequest.getPassword());
//		log.info("Saving "+registerRequest.getUserName()+" to database");
//		
//		userRepository.save(user); 	
//		log.info("Hurray "+registerRequest.getUserName()+" Saved to databse");
//		log.info(registerRequest.getUserName()+" -- Registered Successfully");
//
//	}
//
}
