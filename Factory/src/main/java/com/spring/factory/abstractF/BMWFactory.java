package com.spring.factory.abstractF;

import com.spring.factory.BMW;
import com.spring.factory.Car;

public class BMWFactory extends AbstractFactory{

	public Car getCar() {
		return new BMW();
	}

}
