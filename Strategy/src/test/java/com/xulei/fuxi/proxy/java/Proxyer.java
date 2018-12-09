package com.xulei.fuxi.proxy.java;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Proxyer implements InvocationHandler{

	
	private Work target;
	
	public Object getProxy(Work target) {
		
		this.target=target;
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),this);
	}
	
	/*
	 * 当InvocationHandler 拦截到任何的方法被执行时，自动的运行接口中的invoke方法
	 * 解释invoke方法上的三个参数
	 * 	Object proxy：代理类对象
	 * 	Method method：被外界调用的方法，已经封装成Method对象
	 * 	Object[] args：被调用方法接收的实际参数
	 */
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		if(method.getName().equals("doWork")) {
			System.out.println("开始要工作了！！！");
			method.invoke(this.target, args);
		}
		return null;
	}
}
