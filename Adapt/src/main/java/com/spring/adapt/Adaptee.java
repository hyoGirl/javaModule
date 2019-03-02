package com.spring.adapt;

/**
 * 这个类已经存在了
 * 
 * @author ashura1110
 *
 */
public class Adaptee {

	public int outPut20V() {
		int src = 220;
		System.out.println("我是：" + src + "V的电压");
		return src;
	}
}
