package com.spring.template2;

public class RedTea2 extends TeaTemplate2{
	
	


	@Override
	protected boolean addOther() {
		return false;
	}

	@Override
	protected void addTea() {
		
		System.out.println("开始加入了红茶");
	}

}
