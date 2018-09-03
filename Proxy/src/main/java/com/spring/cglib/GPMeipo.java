package com.spring.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class GPMeipo implements MethodInterceptor{
	
	
	/**
	 * 1:好像并没有持有被代理对象的引用
	 */
	public Object getInstance(Class clazz) {
		
		Enhancer enhancer=new Enhancer();
		
		//这一步是告诉生成的子类必须去继承哪一个类
		enhancer.setSuperclass(clazz);
		
		//设置回调.这个就会去调用下面的interceptor
		enhancer.setCallback(this);
		//第一步、生成源代码
		//第二步、编译成class文件
		//第三步、加载到JVM中，并返回被代理对象
		
		
		/**
		 * 这个核心代码会生成被代理的对象，然后编译，加载到JVM中去运行
		 */
		return enhancer.create();
		
	}
	
	/**
	 * 1:这个obj的引用是由CGLib给我们new出来的
	 * 2：CGLIBnew 出来的对象，其实就是被代理对象的子类
	 * 在OOP上，new子类之前，其实默认会调用super方法，这样new子类的同时，就会去new出父类，这就相当于是间接的持有了我们父类的引用
	 * 我们改变子类对象的某些属性，是可以间接的操作父类的属性的
	 */
	public Object intercept(Object obj, Method methgod, Object[] args, MethodProxy proxy) throws Throwable {
		// TODO Auto-generated method stub
		
		System.out.println("-----------");
		
		//这里必须去调用这个invokesuper。如果是invoke那就是在调用自己本身了
		Object invokeSuper = proxy.invokeSuper(obj, args);
		System.out.println("-*************");
		return null;
	}

}
