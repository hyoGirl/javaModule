package com.spring.java;

public class TestZhang {

	
	public static void main(String[] args) {
		
		//1:获取代理类对象
		Person proxyInstance = (Person) new MeiPo().getProxyInstance(new Zhang());
		
		proxyInstance.byebye();
		
	}
}
