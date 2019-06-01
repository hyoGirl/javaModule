package com.java.decorator;

/**
 * @author ashura1110
 * @ClassName RedDecorator
 * @description TODO
 * @Date 2019/6/1 12:10
 * @Version 1.0
 */
public class RedDecorator extends  Decorator {


    public RedDecorator(Component component) {
        super(component);
    }

    @Override
    public void name() {
        super.name();

        show();
    }

    private void show() {

        System.out.println("牛肉味道");
    }


}
