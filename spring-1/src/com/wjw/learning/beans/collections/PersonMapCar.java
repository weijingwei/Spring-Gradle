package com.wjw.learning.beans.collections;

import java.util.Map;

import com.wjw.learning.beans.Car;

public class PersonMapCar {
	private String name;
	private int age;

	private Map<String, Car> carMap;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Map<String, Car> getCarMap() {
		return carMap;
	}

	public void setCarMap(Map<String, Car> carMap) {
		this.carMap = carMap;
	}

	@Override
	public String toString() {
		return "Person2Car [name=" + name + ", age=" + age + ", carMap=" + carMap + "]";
	}

}
