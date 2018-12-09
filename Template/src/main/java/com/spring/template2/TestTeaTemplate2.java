package com.spring.template2;

public class TestTeaTemplate2  {

	
	public static void main(String[] args) {
		
		TeaTemplate2 red=new RedTea2();
		
		
		red.doTea();
		
		System.out.println();
		
		
		TeaTemplate2 green=new GreenTea2();
		
		
		green.doTea();
		
	}
}
