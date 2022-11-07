package com.singtel.behaviour.sound;

public class DefaultSound implements ISound {
    @Override
    public void sing(){
        System.out.println("sound");
    }

    @Override
    public boolean soundSupported() {
        return false;
    }
}
