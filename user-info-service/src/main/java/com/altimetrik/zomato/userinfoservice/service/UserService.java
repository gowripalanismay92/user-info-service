package com.altimetrik.zomato.userinfoservice.service;

import java.util.List;

import com.altimetrik.zomato.userinfoservice.model.User;

public interface UserService {

	void createUser(User user);

	User retrieveUser(User user);
}
