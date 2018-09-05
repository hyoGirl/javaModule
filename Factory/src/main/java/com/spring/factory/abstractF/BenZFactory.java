package com.spring.factory.abstractF;

import com.spring.factory.BenZ;
import com.spring.factory.Car;

public class BenZFactory extends AbstractFactory{

	public Car getCar() {
		return new BenZ();
	}

}
