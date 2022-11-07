package com.singtel.behaviour.sound;

public class CluckSound implements ISound {
    @Override
    public void sing(){
        //Other sing specific implementation
        System.out.println("Cluck, cluck");
    }

    @Override
    public boolean soundSupported() {
        return true;
    }
}
