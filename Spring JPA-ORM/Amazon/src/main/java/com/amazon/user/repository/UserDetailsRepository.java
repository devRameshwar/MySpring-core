package com.amazon.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.amazon.user.entity.UserDetails;
@Component
public interface UserDetailsRepository extends JpaRepository<UserDetails, String> {

}
