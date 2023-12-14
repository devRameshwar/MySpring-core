package com.amazon.user.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableArgumentResolver;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Component;

import com.amazon.user.entity.UserDetails;
import com.amazon.user.repository.UserDetailsRepository;

import oracle.net.aso.f;

@Component
public class UserDetailsService {

	@Autowired
	UserDetailsRepository repository;

	public UserDetails userRegister(UserDetails details) {
		UserDetails save = repository.save(details);
		return save;
	}

	public List<UserDetails> setAllUserRegister(List<UserDetails> list) {

		List<UserDetails> saveAll = repository.saveAll(list);
		return saveAll;
	}

	public void updateUserDetails(String id, String lastName) {

		UserDetails findById = repository.findById(id).get();
		if (findById != null) {

			findById.setLastName(lastName);
			repository.save(findById);
		}else {
			System.out.println("User Not Found !!!!!!!!!!!!!!");
		}
	}
	
	public List<UserDetails> getAllUserDetails() {
		//List<UserDetails> findAll2 = repository.findAll(Sort.by("userName"));
		List<UserDetails> findAll = repository.findAll(Sort.by(Direction.DESC,"userName"));
		return findAll;
	}
	
	public void  LoadUserDetails(int page,int noOfRecard) {
	   // List<UserDetails> content = repository.findAll(Pageable.ofSize(2)).getContent();
		Pageable request = PageRequest.of(page, noOfRecard);
		Page<UserDetails> findAll = repository.findAll(PageRequest.of(page, noOfRecard, Sort.by(Direction.DESC, "firstName")));
 		for(UserDetails data:findAll) {
			System.out.println(data);
		}
	}
}
