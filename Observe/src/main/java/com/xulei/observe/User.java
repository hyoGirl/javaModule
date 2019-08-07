package com.xulei.observe;


/**
 * @author ashura1110
 * @ClassName XULEI
 * @description TODO
 * @Date 2019/8/7 21:36
 * @Version 1.0
 */
public class User implements MyObserver {



    private String name;
    private String message;

    public User(String name) {
        this.name = name;
    }

    public void update(String message) {

        this.message=message;
        read();
    }

    public void read() {
        System.out.println(name + " 收到推送消息： " + message);
    }
}
