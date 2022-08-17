package com.samples.S01Springcoredi;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext springContainer = new ClassPathXmlApplicationContext(
				"com/samples/S01Springcoredi/SpringConfig.xml");

		 Employee emp = (Employee) springContainer.getBean("emp");
		 System.out.println(emp);

		// Employee em1 = new Employee();
		// em1.setId(10);
		// em1.setName("x");

		// Hospital hospital = (Hospital) springContainer.getBean("hospital");
		// System.out.println(hospital);

		// CarDealer dealer = (CarDealer) springContainer.getBean("cardealer");
		// System.out.println(dealer);

		// Customer customer = (Customer) springContainer.getBean("customer");
		// System.out.println(customer);

		// CountriesAndLanguages countries = (CountriesAndLanguages)springContainer.getBean("countries");
		// System.out.println(countries);

		//Student student = (Student) springContainer.getBean("student");
		//System.out.println(student);
		
		// ShoppingCart shopcart = (ShoppingCart)
		// springContainer.getBean("shoppingcart");
		// System.out.println(shopcart);
		

    	//AbstractApplicationContext springContainer = new ClassPathXmlApplicationContext("com/samples/S01Springcoredi/SpringConfig.xml");
    	//Patient patient = (Patient) springContainer.getBean("patient");
    	//System.out.println(patient);
    	//springContainer.registerShutdownHook();
	}
}
