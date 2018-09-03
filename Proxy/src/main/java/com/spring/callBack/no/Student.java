package com.spring.callBack.no;

public class Student {
	
	
	
	public Student(String name) {
		super();
		this.name = name;
	}




	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public int add(int a, int b) {
		
		return a + b;
	}
	
	
	
	public void callHelp(int a, int b) {
		
		new SuperCalculator().add(a, b, this); 
	}
	
//	public void fillBank(int a, int b) {
//		
//		int result=add(a,b);
//		System.out.println(name + "心算:" + a + " + " + b + " = " + result);
//	}
	
	
	public void fillBank(int a, int b,int result) {
		
		System.out.println(name + "回调:" + a + " + " + b + " = " + result);
	}
}
