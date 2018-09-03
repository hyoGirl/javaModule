package com.spring.callBack.no;

public class Test01 {

	
	public static void main(String[] args) {
		
		
		Student student = new Student("zhangsan");
		
		int a=1;
		int b=2;
		
//		 student.fillBank(a, b);
		
		student.callHelp(a, b);
		
	}
}
