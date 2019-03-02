package com.spring.single;

import java.util.concurrent.TimeUnit;

public class DoubleCheck {

	
	private DoubleCheck() {}
	
	private static volatile DoubleCheck doubleCheck;
	
	public static DoubleCheck getInstance() {
	
		if(doubleCheck==null) {
			synchronized (DoubleCheck.class) {
				if(doubleCheck==null) {
					doubleCheck=new DoubleCheck();
				}
			}
		}
		return doubleCheck;
	}
	
	public static void main(String[] args) {
			for(int i=1;i<5;i++) {
				new Thread(new Runnable() {
					public void run() {
						DoubleCheck instance = DoubleCheck.getInstance();
						String name = Thread.currentThread().getName();
						int random=(int)(Math.random()*10+1);
						try {
							TimeUnit.MILLISECONDS.sleep(random);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						System.out.println(name+"--->"+instance.hashCode());
					}
				}).start();
			}
	}
}
