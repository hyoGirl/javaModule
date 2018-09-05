package com.spring.factory.methods;

import com.spring.factory.BMW;
import com.spring.factory.Car;

public class BMWFactory implements Factory{

	public Car getCar() {
		return new BMW();
	}

}
