package com.spring.hibernate.main;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.hibernate.dao.PersonDAO;
import com.spring.hibernate.model.Person;

public class SpringHibernateMain {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring4.xml");
		
		PersonDAO personDAO = context.getBean(PersonDAO.class);
		
		Person person = new Person();
		person.setName("Manjit");
		person.setPhone("+919999999999");
		person.setAddress("Imphal");
		person.setEmail("info@info.com");
		person.setCountry("India");
		
		personDAO.save(person);
		
		System.out.println(">>>>PERSON:>>>>>:"+person);
		
		List<Person> list = personDAO.list();
		
		for(Person p : list){
			System.out.println(">>>>PERSON List:>>>>:"+p);
		}
		
		context.close();
		
	}

}
