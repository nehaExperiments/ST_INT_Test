package com.singtel.behaviour.swim;

public class SwimImpl implements ISwim {
    @Override
    public void swim() {
        System.out.println("swimming");
    }

    @Override
    public boolean swimSupported() {
        return true;
    }
}
