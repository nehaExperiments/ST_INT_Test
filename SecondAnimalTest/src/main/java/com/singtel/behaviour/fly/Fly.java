package com.singtel.behaviour.fly;

public class Fly implements IFly {
    @Override
    public void fly() {
        //Other fly specific implementation
        System.out.println("Flying");
    }

    @Override
    public boolean flySuspported() {
        return true;
    }
}
