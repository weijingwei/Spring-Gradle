package com.wjw.learning.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wjw.learning.beans.collections.DataSource;

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
		
		com.wjw.learning.beans.collections.PersonListCar personListCar = (com.wjw.learning.beans.collections.PersonListCar) ctx.getBean("personListCar");
		System.out.println(personListCar);

		com.wjw.learning.beans.collections.PersonMapCar personMapCar = (com.wjw.learning.beans.collections.PersonMapCar) ctx.getBean("personMapCar");
		System.out.println(personMapCar);
		
		DataSource ds = (DataSource) ctx.getBean("datasource");
		System.out.println(ds.getProperties());
		
		com.wjw.learning.beans.collections.PersonListCar personImportList = (com.wjw.learning.beans.collections.PersonListCar) ctx.getBean("personImportList");
		System.out.println(personImportList);

		com.wjw.learning.beans.collections.PersonListCar personP = (com.wjw.learning.beans.collections.PersonListCar) ctx.getBean("personP");
		System.out.println(personP);
	}
}
