package com.linkedin.mvpin.user;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterUserController {
	
	@Autowired
	private UserRepository userRepository;;
	
	@PostMapping(value = "/api/user")
	@Transactional
	public void newuser(@Valid @RequestBody NewUserForm form) {
		User newUser = form.build();
		userRepository.save(newUser);
	}
}
