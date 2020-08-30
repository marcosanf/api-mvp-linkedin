package com.linkedin.mvpin.jobs;

import javax.validation.constraints.NotBlank;

public class Job {
	
	private @NotBlank String jobTitle;
	private @NotBlank String company;
	private @NotBlank String location;
	private @NotBlank String jobDescription;
	

	public Job(@NotBlank String jobTitle, @NotBlank String company, @NotBlank String location,
			@NotBlank String jobDescription) {
		this.jobTitle = jobTitle;
		this.company = company;
		this.location = location;
		this.jobDescription = jobDescription;
	}


	@Override
	public String toString() {
		return "Job [jobTitle=" + jobTitle + ", company=" + company + ", location=" + location + ", jobDescription="
				+ jobDescription + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
}


