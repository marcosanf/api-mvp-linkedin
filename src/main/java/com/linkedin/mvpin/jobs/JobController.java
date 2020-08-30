package com.linkedin.mvpin.jobs;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JobController {
	
	
	@PostMapping(value="/api/jobs")
	public void newjob(@RequestBody @Valid NewJobForm form) {
		Job newJob = form.builJob();
	}
}
