package com.xulei.fuxi.strategy;

public class CountContext {
	
	
	CountStrategy countStrategy;

	public CountContext(CountStrategy countStrategy) {
		super();
		this.countStrategy = countStrategy;
	}
	
	public double doCount(double price) {
		return countStrategy.countPrice(price);
		
	}

}
