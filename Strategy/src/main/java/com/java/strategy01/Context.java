package com.java.strategy01;

/**
 *  负责和具体的策略进行交互。具体的算法和直接的客户端分离。
 * @author ashura1110
 *
 */
public class Context {
	
	Strategy01 strategy01;
	public Context(Strategy01 strategy01) {
		
		this.strategy01=strategy01;
	}
	
	
	public void getPrice(double price) {
		
		System.out.println("报价为： "+strategy01.countPrice(price));
	}

}
