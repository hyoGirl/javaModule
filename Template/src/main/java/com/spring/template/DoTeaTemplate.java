package com.spring.template;

public abstract class DoTeaTemplate {
	
	
	
	//模板方法模式在一个方法中定义一个算法的骨架，而将一些步骤的实现延迟到子类中。
	//模板方法使得子类可以在不改变算法结构的情况下，重新定义算法中某些步骤的具体实现。
	
	//喝茶包含了下面几步
	
	public final void createTea() {
		
		//1：烧开水
		boilWater();
		
		//2:准备好杯子，把配料添加到杯子中
		addTea();
		
		//3:把开水倒入
		addWater();
		
		
		//4：喝茶
		drink();
	}

	private void drink() {
		System.out.println("开始喝茶了");
	}

	private void addWater() {
		System.out.println("倒入100度的开水");
	}

	protected abstract void addTea() ;

	private void boilWater() {
		System.out.println("正在烧开水烧到100度");
	}
	
}
