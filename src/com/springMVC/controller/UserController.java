package com.springMVC.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springMVC.model.User;
import com.springMVC.service.UserService;

@Controller
@Scope("request")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String register(@ModelAttribute("user1") User user) {
		return "register";
	}
	
	@RequestMapping(value = "/registerSuccess", method = RequestMethod.POST)
	public String registerSuccess(@Valid @ModelAttribute("user1") User user, BindingResult result) {
		if(result.hasErrors()) {
			return "register";
		}
		userService.addUser(user);
		return "redirect:/listUsers";
	}
	
	@RequestMapping(value = "/listUsers", method = RequestMethod.GET)
	public String listUsers(Model model) {
//		model.addAttribute("userList", userService.getUsers());
		List<User> users = userService.getUsers();
		model.addAttribute("userList", users);
		return "userList";
		
	}
}
