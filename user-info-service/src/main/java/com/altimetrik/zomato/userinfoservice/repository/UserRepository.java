package com.altimetrik.zomato.userinfoservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.altimetrik.zomato.userinfoservice.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
	public User findByEmailIdAndPassword(@Param("emailId") String emailId, @Param("password") String password);
	
}
