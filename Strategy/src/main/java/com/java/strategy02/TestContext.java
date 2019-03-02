package com.java.strategy02;

public class TestContext {
	
	public static void main(String[] args) {
		
		Context context=new Context(new OldStrategy());
		
		context.getPrice(100);
		
		
	}

}
