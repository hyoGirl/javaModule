package com.java.strategy01;

public interface Strategy01 {
	
	//策略模式：即对应于解决某一个问题的一个算法族，允许用户从该算法族中人选个一个算法解决某一问题，
	//同时可以方便的更换算法或者增加新的算法，并且由客户端决定调用哪个算法，
	
	public double countPrice(double standardPrice);

}
