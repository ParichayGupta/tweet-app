package com.tweetapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tweetapp.model.Likes;

@Repository
public interface LikesRepository extends JpaRepository<Likes, Integer> {

}
