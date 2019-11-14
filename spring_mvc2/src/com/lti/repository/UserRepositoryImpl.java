package com.lti.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.lti.model.User;

@Repository("userRepository")
public class UserRepositoryImpl implements UserRepository{

	@Override
	public User addUser(User u) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateUser(User u) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUser(User u) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User findUserById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findUserByEmail(String email) {
		User u=new User(1,"ash","ash@gmail.com","ash123");
		return u;
	}

	@Override
	public List<User> findAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

}
