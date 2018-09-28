package com.java.strategy01;

public class NewCusomerStrategy implements Strategy01{

	public double countPrice(double standardPrice) {
		
		System.out.println("新客户，必须采用8折处理");
		
		return standardPrice * 0.8;
	}

}
