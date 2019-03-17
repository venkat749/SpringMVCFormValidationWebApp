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

import com.springMVC.validator.isValidPassword;

@Component
@Scope("request")
public class User {

	@NotEmpty
	@Size(min=6,max=16)
	@Pattern(regexp = "[^0-9]+")
	private String name;
	@NotNull
	@NotEmpty
	@isValidPassword
	private String password;
	@Min(value=12)
	@Max(value=60)
	@NotNull
	private Integer age;
	@NotEmpty
	@Email
	private String email;
	@NotEmpty
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
	public void setPassword(String password) {
		this.password = password;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getName() {
		return name;
	}
	public String getPassword() {
		return password;
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