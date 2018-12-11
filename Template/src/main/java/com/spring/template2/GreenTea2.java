package com.spring.template2;

public class GreenTea2 extends TeaTemplate2 {

	

	@Override
	protected void addTea() {
		System.out.println("测试分支");
		System.out.println("开始加入了绿茶");
	}

	@Override
	protected boolean addOther() {
		return true;
	}

}
