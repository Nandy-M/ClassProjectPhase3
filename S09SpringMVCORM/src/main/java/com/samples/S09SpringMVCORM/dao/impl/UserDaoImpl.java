package com.samples.S09SpringMVCORM.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.samples.S09SpringMVCORM.dao.UserDao;
import com.samples.S09SpringMVCORM.entity.User;

@Component
public class UserDaoImpl implements UserDao{

	@Autowired
	private HibernateTemplate hibernateTemplate;
	@Override
	public int create(User user) {
		return (int) hibernateTemplate.save(user);
	}
	@Override
	public List<User> findUsers() {
		return hibernateTemplate.loadAll(User.class);
	}
	
}