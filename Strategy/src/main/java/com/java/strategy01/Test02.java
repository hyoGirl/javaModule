package com.java.strategy01;

public class Test02 {
	
	public static void main(String[] args) {
		
		
		Context c1=new Context(new OldCusomerStrategy());
		
		
		c1.getPrice(1000);
		
	}

}
