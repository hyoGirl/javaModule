package com.spring.factory.methods;

public class FactoryTest {
	
	public static void main(String[] args) {
		
		/**
		 * 工厂方法模式，各个产品的生产商，都拥有各自的工厂和生产工艺
		 */
		Factory factory=new AudiFactory();
		
		System.out.println(factory.getCar());
		
		
		System.out.println("------工厂为什么不能动态配置-------");
		
		/**
		 * 有点麻烦，。这个用户还必须去知道自己产品由那个工厂去生产。
		 * 增加了代码的使用复杂度
		 */
		Factory f1=new BMWFactory();
		
		System.out.println(f1.getCar());
		
	}

}
