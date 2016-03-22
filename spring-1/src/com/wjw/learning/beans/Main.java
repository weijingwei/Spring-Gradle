package com.wjw.learning.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		// 1. 创建容器对象
		@SuppressWarnings("resource")
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 2. 获取bean
		HelloWorld hw = (HelloWorld) ctx.getBean("helloWorld");
		// 3. 调用方法
		hw.hello();
		
		Car car = (Car) ctx.getBean("car");
		System.out.println(car);
		Car car2 = (Car) ctx.getBean("car2");
		System.out.println(car2);
		
		Person person = (Person) ctx.getBean("person");
		System.out.println(person);
	}
}
