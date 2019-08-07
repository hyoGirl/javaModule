package com.xulei.observe;

/**
 * 抽象的观察者
 * 定义了一个update()方法，当被观察者调用notifyObservers()方法时，观察者的update()方法会被回调。
 */
public interface MyObserver {

    public void update(String message);
}
