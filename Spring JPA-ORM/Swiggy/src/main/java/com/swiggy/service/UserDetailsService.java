package com.swiggy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swiggy.entity.UserDetails;
import com.swiggy.repository.UserDetailsRepository;

@Service
public class UserDetailsService implements UserDetailsServiceInterface {

	@Autowired
	UserDetailsRepository repository;

	@Override
	public UserDetails userRegister(UserDetails details) {

		UserDetails findById = null;
		try {
			findById = repository.findById(details.getUserName()).get();
		} catch (Exception e) {
		}
		if (findById != null) {
			System.out.println("User Alrady Exist Plz Login ........");
			return null;
		} else {
			UserDetails save = repository.save(details);
			return save;
		}

	}

}
