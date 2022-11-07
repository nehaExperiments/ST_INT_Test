package com.singtel.behaviour.sound;

public class WoofSound implements ISound {
    @Override
    public void sing() {
        //Other sing specific implementation
        System.out.println("Woof, woof");
    }

    @Override
    public boolean soundSupported() {
        return true;
    }
}
