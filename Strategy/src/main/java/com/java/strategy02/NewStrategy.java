package com.java.strategy02;


public class NewStrategy implements Strategy02{

	public double countPrice(double standardPrice) {
		System.out.println("新客户打九折");
		
		return standardPrice*0.9;
	}

}
