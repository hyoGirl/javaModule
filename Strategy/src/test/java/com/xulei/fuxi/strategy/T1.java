package com.xulei.fuxi.strategy;

public class T1 {
	
	public static void main(String[] args) {
		CountContext c1=new CountContext(new NewCount());
		double doCount = c1.doCount(1000);
		System.out.println(doCount);
	}

}
