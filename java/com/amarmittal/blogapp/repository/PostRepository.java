package com.amarmittal.blogapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.amarmittal.blogapp.entities.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, Integer>{

}
