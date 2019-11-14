package com.lti.service;

import java.util.List;

import com.lti.model.User;

public interface UserService {
	public User addUser(User u);
	public void updateUser(User u);
	public void deleteUser(User u);
	public User findUserById(int id);
	public List<User> findAllUsers();
	
	public User login(User u);
}
