package com.spring.factory.abstractF;

import com.spring.factory.Car;

public class DefaultFactory extends AbstractFactory{
	
	private AudiFactory defaultFactory=new AudiFactory();

	public Car getCar() {
		// TODO Auto-generated method stub
		return defaultFactory.getCar() ;
	}

}
