package com.spring.cglib;

public class TestCglib {
	
	public static void main(String[] args) {
		
		
		A instance = (A) new GPMeipo().getInstance(A.class);
		
		instance.findLove();
	}

}
