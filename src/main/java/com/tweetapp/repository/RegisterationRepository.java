package com.tweetapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tweetapp.model.User;

@Repository
public interface RegisterationRepository extends JpaRepository<User, Integer> {
	public User findByUserEmail(String userEmail);

	public User findByUserName(String userName);
	
	public User findByUserEmailAndPassword(String userEmail, String password);


}
