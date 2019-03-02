package com.java.strategy02;

public class OldStrategy implements Strategy02{

	public double countPrice(double standardPrice) {
		System.out.println("老客户打八折");
		return standardPrice*0.8;
	}

}
