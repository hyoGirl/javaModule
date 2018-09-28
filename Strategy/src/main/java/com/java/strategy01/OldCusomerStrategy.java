package com.java.strategy01;

public class OldCusomerStrategy implements Strategy01{

	public double countPrice(double standardPrice) {
		
		System.out.println("老客户，必须打五折");
		
		return standardPrice * 0.5;
	}

}
