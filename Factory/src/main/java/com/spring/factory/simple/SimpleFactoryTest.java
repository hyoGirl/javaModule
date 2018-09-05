package com.spring.factory.simple;

import com.spring.factory.Car;

public class SimpleFactoryTest {
	
	public static void main(String[] args) {
		
		Car car = new SimpleFactory().getCar("BenZ");
		
		System.out.println("产品："+car.getName());
		
	}
}
