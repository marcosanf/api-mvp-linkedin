package com.linkedin.mvpin.user;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class LocalUploader implements Uploader{

	@Override
	public String upload(MultipartFile file) {
		System.out.println("Loading attachment ..");
		return "http://cloud/"+file.getOriginalFilename();
	}

}
