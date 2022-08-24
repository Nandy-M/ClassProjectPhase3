package com.nandy.S06SpringJdbc;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nandy.S06SpringJdbc.dao.EmployeeDAO;
import com.nandy.S06SpringJdbc.dto.Employee;

public class EmployeeApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext springContainer = new ClassPathXmlApplicationContext(
				"com/nandy/S06SpringJdbc/SpringConfig.xml");

		EmployeeDAO employeeDao = (EmployeeDAO) springContainer.getBean("employeedao");

              //createEmployee(employeeDao);
	          
		       //updateEmployee(employeeDao);

		     //deleteEmployee(employeeDao);
		
		        //readEmployee(employeeDao);
		
		    readAllEmployees(employeeDao);

	}
	
	private static void readAllEmployees(EmployeeDAO employeeDao) {
		List<Employee> employees = employeeDao.read();
		System.out.println(employees);
	}
	private static void readEmployee(EmployeeDAO employeeDao) {
		Employee employee = employeeDao.read(1);
		System.out.println(employee);
	}

	private static void deleteEmployee(EmployeeDAO employeeDao) {
		employeeDao.delete(1);
	}

	private static void updateEmployee(EmployeeDAO employeeDao) {
		Employee emp = new Employee();
		emp.setId(1);
		emp.setFirstName("Bob");
		emp.setLastName("Rockwell");

		employeeDao.update(emp);
	}

	private static void createEmployee(EmployeeDAO employeeDao) {
		Employee emp = new Employee();
		emp.setId(1);
		emp.setFirstName("Dexter");
		emp.setLastName("Johnson");

		employeeDao.create(emp);
	}

}
