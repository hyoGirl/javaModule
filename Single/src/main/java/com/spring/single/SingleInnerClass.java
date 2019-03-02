package com.spring.single;

public class SingleInnerClass {
	
	
	private SingleInnerClass() {};
	//1:构造函数必须私有化，否则，就意味着在任何地方都可以自由的创建这个对象
	
	//2:这个地方必须私有，才能保证别人不能修改 static 保证了全局唯一
	private static class InnerClass {
		private static final SingleInnerClass INSTANCE=new SingleInnerClass();
		
	}
	
	public static final SingleInnerClass getInstance() {
		return InnerClass.INSTANCE;
	}
	

}
