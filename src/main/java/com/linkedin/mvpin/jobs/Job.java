package com.linkedin.mvpin.jobs;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;


@Entity
@Table(name= "tb_job")
public class Job {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;
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


