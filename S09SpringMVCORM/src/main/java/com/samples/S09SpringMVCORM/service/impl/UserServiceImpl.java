package com.samples.S09SpringMVCORM.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.samples.S09SpringMVCORM.dao.UserDao;
import com.samples.S09SpringMVCORM.entity.User;
import com.samples.S09SpringMVCORM.service.UserService;

@Component("userService")
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userdao;

	@Override
	@Transactional
	public int save(User user) {
		return userdao.create(user);
	}
	
}