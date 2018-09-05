package com.spring.factory.simple;

import com.spring.factory.Audi;
import com.spring.factory.BMW;
import com.spring.factory.BenZ;
import com.spring.factory.Car;

//工厂模式，统一管理 
public class SimpleFactory {

	
	public Car getCar(String name) {
		
		if("BMW".equalsIgnoreCase(name)) {
			return new BMW();
		}else if("BenZ".equalsIgnoreCase(name)) {
			return new BenZ();
		}else if("Audi".equalsIgnoreCase(name)) {
			return new Audi();
		}else {
			System.out.println("没有这个产品");
			
			return null;
		}
	}
}
