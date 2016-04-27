package com.wjw.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.wjw.test.config.PropertiesConfigure;

@SpringBootApplication
public class MainClass {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(MainClass.class, args);
		PropertiesConfigure configure = (PropertiesConfigure) ctx.getBean("propertiesConfigure");
		System.out.println(configure.getPropertiesBean());
		
		System.setProperty("user", "db3admin");
		System.out.println(configure.getPropertiesBean());
	}
	
}
