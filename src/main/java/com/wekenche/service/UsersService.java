package com.wekenche.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wekenche.domain.User;
import com.wekenche.domain.UserRepository;


@Service
public class UsersService {
	@Autowired
	private UserRepository userRepository;
	
	public Iterable<User> findAll(){
		return userRepository.findAll();
	}
	
}
