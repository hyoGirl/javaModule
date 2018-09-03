package com.spring.callBack.yes;

public class Student {
	
	public Student(String name) {
		super();
		this.name = name;
	}




	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	/**
	 * 不希望小明和老婆婆把fillBlank的功能直接暴漏给用户代码调用，那小明和老婆婆如果直接去实现doJob接口，势必要直接暴漏。
	 * 那么用户代码不callHelp，而是直接调用fillBlank会怎样？
                    假如上述情况正是你不希望看到的，那么我觉得用内部类这种方式，挺合适。
                    而且小明的接口实现跟别人不同，那么他的内部类doHomeWork就可以有权不被别人“看到”。
	 * @author ashura1110
	 *
	 */
	public class doHomeWork implements DoJob{

		public void fillBlank(int a, int b, int result) {
			
			System.out.println(name + "求助小红计算:" + a + " + " + b + " = " + result);
		}
		
	}
	
	
	public void callHelp (int a, int b) {
		
		new SuperCalculator().add(a, b, new doHomeWork());
	}
}
