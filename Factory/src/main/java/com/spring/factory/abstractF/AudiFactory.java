package com.spring.factory.abstractF;


import com.spring.factory.Audi;
import com.spring.factory.Car;

public class AudiFactory extends AbstractFactory{

	public Car getCar() {
		return new Audi();
	}

}
