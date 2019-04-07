package com.sample.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sample.spring.service.CustomerService;

public class Application {

	public static void main(String[] args) {
		ApplicationContext app =new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerService customer = app.getBean("customerService", CustomerService.class);
		System.out.println(customer.findCustomers().get(0).getFirstName());

	}

}
