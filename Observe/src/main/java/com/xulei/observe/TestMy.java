package com.xulei.observe;

/**
 * @author ashura1110
 * @ClassName XULEI
 * @description TODO
 * @Date 2019/8/7 21:38
 * @Version 1.0
 */
public class TestMy {

    public static void main(String[] args) {

        WechatServer wrapper=new WechatServer();

        User AA=new User("AA");
        User BB=new User("BB");
        User CC=new User("CC");


        wrapper.registerObserver(AA);
        wrapper.registerObserver(BB);
        wrapper.registerObserver(CC);


        wrapper.setInfomation("超市大降价了");


        System.out.println("---------------");

        wrapper.removeObserver(AA);
        wrapper.setInfomation("超市破产了");

    }
}
