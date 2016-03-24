package com.wjw.learning.beans.relation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wjw.learning.beans.autowire.Address;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-relation.xml");
		Address add = (Address) ctx.getBean("address2");
		System.out.println(add);
		
	}

}
