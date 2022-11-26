package com.amarmittal.blogapp.services.serviceImpl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.amarmittal.blogapp.Dto.PostDto;
import com.amarmittal.blogapp.entities.Post;
import com.amarmittal.blogapp.repository.PostRepository;
import com.amarmittal.blogapp.services.PostService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {

	private final PostRepository postRepository;

	private final ModelMapper modelMapper;

	private PostDto postToPostDto(Post post) {
		return this.modelMapper.map(post, PostDto.class);
	}

	private Post postDtoToPost(PostDto postDto) {
		return this.modelMapper.map(postDto, Post.class);
	}

	@Override
	public List<Post> getAllPosts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Post getPostById(int postId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PostDto createPost(Post post) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updatePost(int postId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deletePost(int postId) {
		// TODO Auto-generated method stub
		return 0;
	}

}
