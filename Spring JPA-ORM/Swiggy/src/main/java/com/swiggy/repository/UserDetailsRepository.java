package com.swiggy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.swiggy.entity.UserDetails;
@Repository
public interface UserDetailsRepository extends JpaRepository<UserDetails, String> {

}
