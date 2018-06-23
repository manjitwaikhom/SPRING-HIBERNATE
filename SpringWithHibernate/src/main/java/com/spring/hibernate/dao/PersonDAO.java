package com.spring.hibernate.dao;

import java.util.List;

import com.spring.hibernate.model.Person;

public interface PersonDAO {

	public void save(Person p);
	
	public List<Person> list();
	
}
