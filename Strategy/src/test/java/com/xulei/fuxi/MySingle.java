package com.xulei.fuxi;

public class MySingle {

	private MySingle() {}
	
	private static class Demo{
		private static final MySingle ss=new MySingle();
	}
	
	public static final MySingle getInstance() {
		return Demo.ss;
	}
}
