package com.springMVC.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.springMVC.model.User;

@Repository
public class UserDAO {

	List<User> list = new ArrayList<User>();
		
	public void add(User user) {
		list.add(user);
	}

	public List<User> getUsers() {
		return list;
	}

}
