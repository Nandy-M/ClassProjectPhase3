package com.nandy.S06SpringJdbc.dao;

import java.util.List;

import com.nandy.S06SpringJdbc.dto.Employee;

public interface EmployeeDAO {
	int create(Employee employee);

	int update(Employee employee);

	int delete(int id);
	
	Employee read(int id);
	
	List<Employee> read();

}
