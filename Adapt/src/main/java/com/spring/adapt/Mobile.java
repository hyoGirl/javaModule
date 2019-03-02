package com.spring.adapt;

public class Mobile {
	
	public void charge(Target target) {
		
		if(target.outPut5V()==5) {
			System.out.println("正好找到了5v充电器");
		}else {
			System.out.println("电压过高，手机可能会爆炸");
		}
		
	}
	public static void main(String[] args) {
		
		Mobile mobile=new Mobile();
		
		Adapter adapter=new Adapter(new Adaptee());
		
		mobile.charge(adapter);
		
	}	
}
