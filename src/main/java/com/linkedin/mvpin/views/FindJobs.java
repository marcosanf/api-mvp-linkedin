package com.linkedin.mvpin.views;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.linkedin.mvpin.jobs.Job;
import com.linkedin.mvpin.jobs.JobRepository;



@RestController
public class FindJobs {
	
	@Autowired
	private JobRepository jobRepository;
	
	@GetMapping(value = "/api/findjobs")
	public Iterable<Job> listJobs() {
		return jobRepository.findAll();
	}
	
}
