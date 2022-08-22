package com.nandy.S05InterfaceInjection.DAO.impl;

import org.springframework.stereotype.Component;

import com.nandy.S05InterfaceInjection.DAO.OrderDAO;

@Component("daov2")
public class OrderDAOImpl implements OrderDAO{
	@Override
	public void createOrder() {
		System.out.println("create order in mysql db");
	}

}
