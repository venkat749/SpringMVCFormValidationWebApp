package com.springMVC.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("request")
public class User {

	@NotEmpty(message = "Name cannot be empty")
	@Size(min=6,max=16,message= "Name should have a length between 6 and 16")
	@Pattern(regexp = "[^0-9]+", message = "Name should not contain numeric value")
	private String name;
	@Min(value=12,message = "Age cannot be less than 12")
	@Max(value=60,message = "Age cannot be more than 60")
	@NotNull(message = "Please enter your age")
	private Integer age;
	@NotEmpty(message = "email cannot be left blank")
	@Email(message="email is not valid")
	private String email;
	@NotEmpty(message = "Enter valid country")
	private String country;
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getName() {
		return name;
	}
	public Integer getAge() {
		return age;
	}
	public String getEmail() {
		return email;
	}
	public String getCountry() {
		return country;
	}
}