package com.spring.factory.abstractFactory02;

public class WindowsFactory implements AbstractFactory02 {
 
	public Button createButton() {
		return new WindowsButton();
	}
 
	public Text createText() {
		return new WindowsText();
	}
 
}
