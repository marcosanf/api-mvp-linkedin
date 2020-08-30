package com.linkedin.mvpin.views;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.linkedin.mvpin.user.Post;
import com.linkedin.mvpin.user.PostRepository;

@RestController
public class FeedController {
	
	@Autowired
	private PostRepository postRepository;
	
	@GetMapping(value= "/api/feed")
	public Iterable<Post> listPosts() {
		return postRepository.findAll();
	}
}
