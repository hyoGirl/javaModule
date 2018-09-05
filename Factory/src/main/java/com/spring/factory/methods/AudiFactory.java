package com.spring.factory.methods;

import com.spring.factory.Audi;
import com.spring.factory.Car;

public class AudiFactory implements Factory{

	public Car getCar() {
		return new Audi();
	}

}
