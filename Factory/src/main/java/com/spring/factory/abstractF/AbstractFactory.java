package com.spring.factory.abstractF;

import com.spring.factory.Audi;
import com.spring.factory.BMW;
import com.spring.factory.BenZ;
import com.spring.factory.Car;

public abstract class AbstractFactory {
	
	/**
	 * 采用抽象模式，可以自己去切换想要的数据。
	 */
	
	/**
	 * 不允许外部访问
	 * @return
	 */
	protected abstract Car  getCar();
	
	//这个方法不能是抽象类，要不然子类还必须全部来重写这个方法
	public Car getCar(String name) {
		
		if("BMW".equalsIgnoreCase(name)) {
			return new BMWFactory().getCar();
		}else if("BenZ".equalsIgnoreCase(name)) {
			return new BenZFactory().getCar();
		}else if("Audi".equalsIgnoreCase(name)) {
			return new AudiFactory().getCar();
		}else {
			System.out.println("没有这个产品");
			
			return null;
		}
	}
	

}
