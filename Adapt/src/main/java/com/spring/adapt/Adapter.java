package com.spring.adapt;

/**
 * 作为一个适配器类，将一个类的接口转换成客户希望的另一个接口。适配器模式让那些接口不兼容的类可以一起工作
 * @author ashura1110
 */
public class Adapter implements Target {
	// 1：持有对适配者对象的引用
	Adaptee adaptee;
	public Adapter(Adaptee adaptee) {
		super();
		this.adaptee = adaptee;
	}
	// 2:转发调用
	public int outPut5V() {
		int dst = 0;
		if (adaptee != null) {
			int src = adaptee.outPut20V();
			System.out.println("对象适配器工作，开始适配电压");
			dst = src / 44;
			System.out.println("适配完成后输出电压：" + dst);
		}
		return dst;
	}
}
