package com.amarmittal.blogapp.services;

import java.util.List;

import com.amarmittal.blogapp.Dto.PostDto;
import com.amarmittal.blogapp.entities.Post;

public interface PostService {

	List<Post> getAllPosts();

	Post getPostById(int postId);

	PostDto createPost(Post post);

	int updatePost(int postId);

	int deletePost(int postId);

}
