package com.linkedin.mvpin.jobs;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JobController {
	
	@Autowired
	private JobRepository jobRepository;
	
	@PostMapping(value="/api/jobs")
	@Transactional
	public void newjob(@RequestBody @Valid NewJobForm form) {
		Job newJob = form.builJob();
		jobRepository.save(newJob);
	}
}
