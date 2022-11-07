package com.singtel.behaviour.sound;

public class RoosSound implements ISound {
    @Override
    public void sing() {
        //Other sing specific implementation
        System.out.println("Cock-a-doodle-doo");
    }

    @Override
    public boolean soundSupported() {
        return true;
    }
}
