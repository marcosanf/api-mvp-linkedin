package com.linkedin.mvpin.user;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.URL;

import com.sun.istack.NotNull;

@Entity
@Table(name="tb_post")
public class Post {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;
	private LocalDateTime postDate;
	private @NotBlank String postContent;
	private @NotNull @URL String linkAttachment;
	@ManyToOne
	private User user;

	public Post(LocalDateTime postDate, @NotBlank String postContent, @NotNull @URL String linkAttachment, @NotNull  User user) {
		this.postDate = postDate;
		this.postContent = postContent;
		this.linkAttachment = linkAttachment;
		this.user = user;
	}
	

	@Override
	public String toString() {
		return "Post [postDate=" + postDate + ", postContent=" + postContent + ", linkAttachment=" + linkAttachment
				+ ", user=" + user + ", getPostDate()=" + getPostDate() + ", getPostContent()=" + getPostContent()
				+ ", getLinkAttachment()=" + getLinkAttachment() + ", getUser()=" + getUser() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}


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

	public String getLinkAttachment() {
		return linkAttachment;
	}

	public void setLinkAttachment(String linkAttachment) {
		this.linkAttachment = linkAttachment;
	}

	public Long getId() {
		return id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
