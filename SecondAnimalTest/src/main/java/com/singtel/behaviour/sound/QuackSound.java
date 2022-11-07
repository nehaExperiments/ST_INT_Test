package com.singtel.behaviour.sound;

public class QuackSound implements ISound {
    @Override
    public void sing(){
        //Other sing specific implementation
        System.out.println("Quack, quack");
    }

    @Override
    public boolean soundSupported() {
        return true;
    }
}
