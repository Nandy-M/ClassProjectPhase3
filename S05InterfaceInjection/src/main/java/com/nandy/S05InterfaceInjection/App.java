package com.nandy.S05InterfaceInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;




import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;



import com.nandy.S05InterfaceInjection.DAO.OrderDAO;
import com.nandy.S05InterfaceInjection.DAO.impl.OrderDAOImpl;
import com.nandy.S05InterfaceInjection.service.OrderService;

/**
 * Hello world!
 *
 */
public class App 
{
	private static final String List = null;
	public static void main(String[] args) {
		
		// create the spring container
		ClassPathXmlApplicationContext springContainer = new ClassPathXmlApplicationContext(
				"com/nandy/S05InterfaceInjection/SpringConfig.xml");

		OrderService service = (OrderService) springContainer.getBean("orderservice");
		System.out.println(service);
		service.placeOrder();

	}
}
