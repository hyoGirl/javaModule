package com.xulei.observe;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

/**
 * @author ashura1110
 * @ClassName XULEI
 * @description 被观察者，也就是微信公众号服务 实现了Observerable接口，对Observerable接口的三个方法进行了具体实现
 * @Date 2019/8/7 21:30
 * @Version 1.0
 */
public class WechatServer implements MyObserverable {

    //注意到这个List集合的泛型参数为Observer接口，设计原则：面向接口编程而不是面向实现编程
    private List<MyObserver> list;


    private String message;

    public WechatServer() {
        list = new ArrayList<MyObserver>();
    }

    public void registerObserver(MyObserver o) {
        list.add(o);
    }

    public void removeObserver(MyObserver o) {
        if (!list.isEmpty()) {
            list.remove(o);
        }
    }

    public void notifyObserver() {

        for(int i = 0; i < list.size(); i++) {
            MyObserver oserver = list.get(i);
            oserver.update(message);
        }
    }

    /**
     * 自定义方法，当更新消息的时候，就通知所有人
     * @param s
     */
    public void setInfomation(String s) {
        this.message = s;
        System.out.println("微信服务更新消息： " + s);
        //消息更新，通知所有观察者
        notifyObserver();
    }
}
