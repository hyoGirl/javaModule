package com.java.decorator;

/**
 * @author ashura1110
 * @ClassName BlackDecorator
 * @description TODO
 * @Date 2019/6/1 12:27
 * @Version 1.0
 */
public class BlackDecorator extends Decorator {
    public BlackDecorator(Component component) {
        super(component);
    }

    @Override
    public void name() {
        super.name();

        show();
    }

    private void show() {

        System.out.println("蔬菜味道");

    }


}
