package com.xulei.fuxi.strategy;

public class OldCount implements CountStrategy{

	public double countPrice(Double price) {
		
		System.out.println("这个是老会员");
		return price*0.5;
	}

}
