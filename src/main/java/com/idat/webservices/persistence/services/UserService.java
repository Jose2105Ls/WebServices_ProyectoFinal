package com.idat.webservices.persistence.services;

import java.util.List;
import java.util.Optional;

import com.idat.webservices.persistence.models.User;
import com.idat.webservices.persistence.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;

public class UserService implements IService<User> {

	@Autowired
	private UserRepository repository;

	@Override
	public List<User> findAll() {
		return (List<User>) repository.findAll();
	}

	@Override
	public Optional<User> findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<User> findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<User> save(User entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<User> update(User entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(User entity) {
		// TODO Auto-generated method stub
		
	}
	
}
