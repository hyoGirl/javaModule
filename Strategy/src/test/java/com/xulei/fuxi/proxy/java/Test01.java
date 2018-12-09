package com.xulei.fuxi.proxy.java;

public class Test01 {
	public static void main(String[] args) {
		Work work = (Work) new Proxyer().getProxy(new Seller());
		work.doWork();
	}
}
