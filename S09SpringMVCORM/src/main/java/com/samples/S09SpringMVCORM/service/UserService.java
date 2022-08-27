package com.samples.S09SpringMVCORM.service;

import java.util.List;

import com.samples.S09SpringMVCORM.entity.User;

public interface UserService {
	int save(User user);
	List<User> getUsers();

}
