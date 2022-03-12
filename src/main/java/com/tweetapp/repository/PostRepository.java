package com.tweetapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tweetapp.model.TweetPost;

@Repository
public interface PostRepository extends JpaRepository<TweetPost, Integer> {

}
