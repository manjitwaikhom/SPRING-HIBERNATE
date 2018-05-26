package com.spring.hibernate01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author manjit
 *
 */
public class Lab48 {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/spring/hibernate01/applicationContext.xml");
		CustomerDAO cdao=(CustomerDAO)ctx.getBean("cdao");
		
		//1 add customer
		CustomerTO cto1=new CustomerTO(401,"manjit","mjt@wlk.com",9999,"banglore");
		cdao.addCustomer(cto1);

	}

}
