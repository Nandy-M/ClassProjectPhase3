package com.nandy.S06SpringJdbc;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App 
{
	public static void main(String[] args) {
		ClassPathXmlApplicationContext springContainer = new ClassPathXmlApplicationContext(
				"com/nandy/S06SpringJdbc/SpringConfig.xml");

		JdbcTemplate jdbcTemplate = (JdbcTemplate) springContainer.getBean("jdbctemplate");
		
		String sql = "insert into student values (?, ?, ?)";
		int updateResult = jdbcTemplate.update(sql, 1, "John", "Wilson");
		System.out.println("Number of records inserted: " + updateResult);
		

	}
}
