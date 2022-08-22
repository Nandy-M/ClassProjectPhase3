package com.nandy.S04Spel;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nandy.S04Spel.model.CarDealer;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {
		// create the spring container
		ClassPathXmlApplicationContext springContainer = new ClassPathXmlApplicationContext(
				"com/nandy/S04Spel/SpringConfig.xml");

		CarDealer dealer = (CarDealer) springContainer.getBean("carDealer");
		System.out.println(dealer);

	}
}
