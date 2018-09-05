package com.spring.factory.methods;

import com.spring.factory.BenZ;
import com.spring.factory.Car;

public class BenZFactory implements Factory{

	public Car getCar() {
		return new BenZ();
	}

}
