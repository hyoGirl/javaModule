package com.xulei.observe;

import java.util.Observer;

/***
 * 抽象被观察者接口
 * 声明了添加、删除、通知观察者方法
 * 定义了一个  被观察者的抽象接口
 */
public interface MyObserverable {

    // 注册观察者
    public void registerObserver(MyObserver o);

    // 移除观察者
    public void removeObserver(MyObserver o);

    //通知观察者
    public void notifyObserver();

}
