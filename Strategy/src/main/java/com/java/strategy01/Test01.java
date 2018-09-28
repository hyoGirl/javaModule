package com.java.strategy01;

public class Test01 {
	
	public static void main(String[] args) {
		
		Strategy01 oldCusomerStrategy = new OldCusomerStrategy();
		
		double countPrice = oldCusomerStrategy.countPrice(1000);
		
		System.out.println(countPrice);
	}

}
