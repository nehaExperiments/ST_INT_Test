package com.singtel.behaviour.walk;

public class Walk implements IWalk {
    @Override
    public void walk() {
        //Other fly specific implementation
        System.out.println("Walking");
    }

    @Override
    public boolean walkSupported() {
        return true;
    }
}
