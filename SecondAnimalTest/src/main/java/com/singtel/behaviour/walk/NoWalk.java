package com.singtel.behaviour.walk;

public class NoWalk implements IWalk {
    @Override
    public void walk() {
        throw new UnsupportedOperationException("Walk not supported");
    }

    @Override
    public boolean walkSupported() {
        return false;
    }
}
