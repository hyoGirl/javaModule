package com.spring.template;

public class TestTeaTemplate {
	
	
	public static void main(String[] args) {
		
		DoTeaTemplate tea=new GreenTea();
		
		tea.createTea();
		
		System.out.println();
		DoTeaTemplate redTea=new RedTea();
		
		redTea.createTea();
		
		
	}

}
