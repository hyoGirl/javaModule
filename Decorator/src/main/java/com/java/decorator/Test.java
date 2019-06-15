package com.java.decorator;

/**
 * @author ashura1110
 * @ClassName Test
 * @description TODO
 * @Date 2019/6/1 12:28
 * @Version 1.0
 */
public class Test {

    //https://blog.csdn.net/u012403290/article/details/71747516
    public static void main(String[] args) {

        Component concreteComponent=new ConcreteComponent();
        concreteComponent.name();
        RedDecorator redDecorator = new RedDecorator(new BlackDecorator(concreteComponent));
        redDecorator.name();

    }
}
