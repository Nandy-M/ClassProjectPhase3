package com.nandy.S05InterfaceInjection.DAO.impl;

import org.springframework.stereotype.Component;

import com.nandy.S05InterfaceInjection.DAO.OrderDAO;

@Component("dao")
public class OrderDAOImplV2 implements OrderDAO{
	@Override
	public void createOrder() {
		System.out.println("create order in Oracle DB");
	}

}