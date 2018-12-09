package com.xulei.fuxi.strategy;

public class NewCount implements CountStrategy{

	public double countPrice(Double price) {
		
		
		System.out.println("这个是新会员");
		
		return price*0.99;
		
	}

}
