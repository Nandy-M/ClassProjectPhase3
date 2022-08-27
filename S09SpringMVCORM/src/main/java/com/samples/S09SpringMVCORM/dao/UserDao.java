package com.samples.S09SpringMVCORM.dao;

import java.util.List;

import com.samples.S09SpringMVCORM.entity.User;

public interface UserDao {
	int create(User user);
	List<User> findUsers();

}
