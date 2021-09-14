package com.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String args[])
	{
		
		ApplicationContext context= new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		Person person= (Person) context.getBean("person");
		
		System.out.println(person.getName());
		
		System.out.println(person.getPhones());
		
		System.out.println(person.getAddresses());
	}
}
