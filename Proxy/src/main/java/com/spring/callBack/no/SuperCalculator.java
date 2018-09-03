package com.spring.callBack.no;

public class SuperCalculator {
	
	public void add(int a,int b,Student student) {
		
		
		int result=a+b;
//		student.fillBank(a, b);
		
		student.fillBank(a, b, result);
	}
}
