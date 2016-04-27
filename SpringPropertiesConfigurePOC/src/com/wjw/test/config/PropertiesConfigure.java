package com.wjw.test.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Configuration
@PropertySource("classpath:resources/db.properties")
//@PropertySource("file:/${myPlaceholder:C:/isg}/app.properties")	myPlaceholder can be configured in application.properties. Then can be found
public class PropertiesConfigure {
	@Autowired
	Environment env;
	
	@Autowired
	DBPropertiesBean dbPropertiesBean;
	
	private static int index = 1;
	
	@Bean
	@Scope("prototype")
	public DBPropertiesBean getPropertiesBean() {
		System.out.println(index++);
		dbPropertiesBean.setUser(env.getProperty("user"));
		dbPropertiesBean.setPassword(env.getProperty("password"));
		dbPropertiesBean.setUrl(env.getProperty("url"));
		dbPropertiesBean.setDriverclass(env.getProperty("driverclass"));
		return dbPropertiesBean;
	}

	@Override
	public String toString() {
		return "PropertiesConfigure [configBean=" + dbPropertiesBean + "]";
	}
	
}

@Component
class DBPropertiesBean {
	private String user;
	private String password;
	private String url;
	private String driverclass;

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDriverclass() {
		return driverclass;
	}

	public void setDriverclass(String driverclass) {
		this.driverclass = driverclass;
	}

	@Override
	public String toString() {
		return "ConfigBean [user=" + user + ", password=" + password + ", url=" + url + ", driverclass=" + driverclass
				+ "]";
	}
}