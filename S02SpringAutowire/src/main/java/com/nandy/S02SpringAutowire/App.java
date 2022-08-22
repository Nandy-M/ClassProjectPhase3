package com.nandy.S02SpringAutowire;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nandy.S02SpringAutowire.model.Employee;

public class App 
{
    public static void main( String[] args )
    {
       
    	// create the spring container
    	ClassPathXmlApplicationContext springContainer = new ClassPathXmlApplicationContext("com/nandy/S02SpringAutowire/SpringConfig.xml");
       
       Employee emp = (Employee) springContainer.getBean("emp"); 
       System.out.println(emp);
       
      
    }
}