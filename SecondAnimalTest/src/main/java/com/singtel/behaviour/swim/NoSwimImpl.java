package com.singtel.behaviour.swim;

public class NoSwimImpl implements ISwim {
    @Override
    public void swim() {
        throw new UnsupportedOperationException("Swim is not supported");
    }

    @Override
    public boolean swimSupported() {
        return false;
    }
}