package com.nandy.S03StereotypeAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.nandy.S03StereotypeAnnotations.model.Instructor;
import com.nandy.S03StereotypeAnnotations.model.Patient;



/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		// create the spring container
		ClassPathXmlApplicationContext springContainer = new ClassPathXmlApplicationContext(
				"com/nandy/S03StereotypeAnnotations/SpringConfig.xml");

		Instructor inst = (Instructor) springContainer.getBean("inst");
		System.out.println(inst);
		
		Patient patient = (Patient) springContainer.getBean("patient");
		System.out.println(patient);


	}
}