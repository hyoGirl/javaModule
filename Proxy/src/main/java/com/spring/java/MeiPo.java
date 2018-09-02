package com.spring.java;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MeiPo implements InvocationHandler{
	
	private Person target;
	
	//1:获取被代理的人的资料信息
	public Object getProxyInstance(Person target) {
		this.target=target;
		
		/**
		 * 第二个参数决定了这个target必须是一个接口
		 */
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
		
	}
	
	/**
	 * 当InvocationHandler 拦截到任何的方法被执行时，自动的运行接口中的invoke方法
	 * 1:被代理的对象
	 * 2：反射获取的对象方法
	 * 3：方法执行的参数
	 */
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		if(method.getName().equals("findLove")) {
			System.out.println("开始了");
			method.invoke(this.target, args);
		}
		if(method.getName().equals("byebye")) {
			System.out.println("结束了");
			method.invoke(this.target, args);
		}
		
		
		return null;
	}

}
