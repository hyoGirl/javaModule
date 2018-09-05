package com.spring.factory.abstractFactory02;
public class AbstractFactoryDemo {
	
	public static void main(String[] args) {
		LinuxFactory linuxFactory = new LinuxFactory();
		linuxFactory.createButton().processEvent();
		linuxFactory.createText().getWholeText();
		WindowsFactory windowsFactory = new WindowsFactory();
		windowsFactory.createButton().processEvent();
		windowsFactory.createText().getWholeText();
	}
 
}
