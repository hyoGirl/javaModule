package com.java.decorator;

/**
 * @author ashura1110
 * @ClassName Decorator
 * @description TODO
 * @Date 2019/6/1 12:06
 * @Version 1.0
 */
public abstract class Decorator implements Component {


    protected  Component component;

    public Decorator(Component component){
        this.component=component;
    }


    public void name() {
        component.name();
    }



}
