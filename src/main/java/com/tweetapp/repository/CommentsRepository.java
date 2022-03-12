package com.tweetapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tweetapp.model.Comments;

@Repository
public interface CommentsRepository extends JpaRepository<Comments, Integer> {

}
