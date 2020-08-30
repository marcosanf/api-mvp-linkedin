package com.linkedin.mvpin.user;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {
	
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private Uploader uploader;
	@Autowired
	private PostRepository postRepository;
	
	@PostMapping(value = "/api/posts")
	@Transactional
	public void newpost(@Valid NewPostForm form) {
		Post newPost = form.buildPost(userRepository, uploader);
		postRepository.save(newPost);
	}
}
