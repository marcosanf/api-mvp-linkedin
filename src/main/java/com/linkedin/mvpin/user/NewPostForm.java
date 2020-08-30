package com.linkedin.mvpin.user;

import java.time.LocalDateTime;

import javax.validation.constraints.NotBlank;

import org.springframework.web.multipart.MultipartFile;

import com.sun.istack.NotNull;

public class NewPostForm {
	
	private LocalDateTime postDate = LocalDateTime.now();
	@NotBlank
	private String postContent;
	@NotNull
	private MultipartFile postAttachment;
	private Long userId;
	
	public LocalDateTime getPostDate() {
		return postDate;
	}
	public void setPostDate(LocalDateTime postDate) {
		this.postDate = postDate;
	}
	public String getPostContent() {
		return postContent;
	}
	public void setPostContent(String postContent) {
		this.postContent = postContent;
	}
	public MultipartFile getPostAttachment() {
		return postAttachment;
	}
	public void setPostAttachment(MultipartFile postAttachment) {
		this.postAttachment = postAttachment;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	

	public Post buildPost(UserRepository userRepository, Uploader uploader) {
		User user = userRepository.findById(userId).get();
		String linkAttachment = uploader.upload(postAttachment);
		return new Post(postDate, postContent, linkAttachment, user);
	
	}
	
	
}
