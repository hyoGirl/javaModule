package com.spring.factory.abstractFactory02;
public class LinuxFactory implements AbstractFactory02 {
 
	public Button createButton() {
		return new LinuxButton();
	}
 
	public Text createText() {
		return new LinuxText();
	}
 
}
