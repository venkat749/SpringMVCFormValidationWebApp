package com.springMVC.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springMVC.dao.UserDAO;
import com.springMVC.model.User;

@Service
public class UserService {

	@Autowired
	private UserDAO userDAO;
	
	public void addUser(User user) {
		// TODO Auto-generated method stub
		userDAO.add(user);
	}

	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return userDAO.getUsers();
	}

	
}
