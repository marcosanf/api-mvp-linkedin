package com.linkedin.mvpin.jobs;

import javax.validation.constraints.NotBlank;

public class NewJobForm {
	
	@NotBlank
	private String jobTitle;
	
	@NotBlank
	private String company;
	
	@NotBlank
	private String location;
	
	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getJobDescription() {
		return jobDescription;
	}

	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}

	@NotBlank
	private String jobDescription;

	public Job builJob() {
		return new Job(jobTitle, company, location, jobDescription);
	}
}
