package com.spring.adapt02;

public class WebConfig extends WebMvcConfigurerAdapter {

	@Override
	public void method1() {
		super.method1();
		System.out.println("Hello 客户只需要一个方法");
	}
	
	public static void main(String[] args) {
		
		WebConfig webConfig=new WebConfig();
		webConfig.method1();
		
	}
}
