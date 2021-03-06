package com.wjw.learning.beans.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-autowire.xml");
		Person person = (Person) ctx.getBean("person");
		System.out.println(person);
	}
}
