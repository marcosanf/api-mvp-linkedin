package com.linkedin.mvpin.user;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="tb_user")
public class User {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;
	private @NotBlank @Email String email;
	private @NotBlank String password;
	private @NotBlank String firstName;
	private @NotBlank String lastName;
	private @NotBlank String country;
	private @NotBlank String city;
	private @NotBlank String state;
	private @NotBlank String jobTitle;
	private @NotBlank String company;
	private LocalDateTime CreatedAt = LocalDateTime.now();

	public User(@NotBlank @Email String email, @NotBlank String password, @NotBlank String firstName,
			@NotBlank String lastName, @NotBlank String country, @NotBlank String city, @NotBlank String state,
			@NotBlank String jobTitle, @NotBlank String company) {
		this.email = email;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.country = country;
		this.city = city;
		this.state = state;
		this.jobTitle = jobTitle;
		this.company = company;
	}
	
	@Override
	public String toString() {
		return "User [email=" + email + ", password=" + password + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", country=" + country + ", city=" + city + ", state=" + state + ", jobTitle=" + jobTitle
				+ ", company=" + company + ", CreatedAt=" + CreatedAt + "]";
	}

}
