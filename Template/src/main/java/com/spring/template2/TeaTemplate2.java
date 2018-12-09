package com.spring.template2;

public abstract class TeaTemplate2 {

	
//	1. 保护抽象类中定义算法顺序的方法不被子类修改。
//
//	2. 分离可变及不可变部分，让子类自己决定可变部分的实现。
//
//	3. 让算法的具体实现对子类开放，对其他类关闭。
	
	public final void doTea() {
		
		
		//1:烧开水
		boildWater();
		
		//2：放茶叶
		addTea();
		
		//3:加牛奶。这个是为了让子类有选择的使用
		
		addOther();
		
		if(addOther()) {
			addMilk();
		};
		
		//4:倒入开水
		addWater();
		
		//5: 喝茶
		drinkTea();
		
	}

	protected boolean addOther() {
		return false;
	
	}

	protected void addWater() {
		
		System.out.println("开水烧到100度了，可以倒入了");
	}

	protected  void drinkTea() {
		
		System.out.println("开始喝茶了");
	}
	

	protected  void addMilk() {
		System.out.println("加入了牛奶");
	}

	protected abstract void addTea();

	protected void boildWater() {
		
		System.out.println("开始烧开水了");
	}
	
}
