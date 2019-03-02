package com.java.strategy02;

public class Context {
	
	
	Strategy02 strategy02;

	public Context(Strategy02 strategy02) {
		super();
		this.strategy02 = strategy02;
	}
	

	public void getPrice(double price) {
		
		System.out.println("报价为： "+strategy02.countPrice(price));
	}
}
