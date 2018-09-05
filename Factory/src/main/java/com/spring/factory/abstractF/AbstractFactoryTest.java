package com.spring.factory.abstractF;

public class AbstractFactoryTest {
	
	public static void main(String[] args) {
		
		DefaultFactory df=new DefaultFactory();
		
		System.out.println(df.getCar("BenZ"));
		
		
	}

}
