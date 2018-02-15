package com.example.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@Autowired
	public JdbcTemplate jdbcTemplate;
	
	@RequestMapping("/createTable")
	public void createTable() {
		try {
			jdbcTemplate.execute("create table country(id identity, name varchar(277),"
					+ "department varchar(255))");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@RequestMapping("/insert")
	public void insertTable() {
		try {
			jdbcTemplate.execute("insert into student(name, department) values('Mahfuz', 'CSE')");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
