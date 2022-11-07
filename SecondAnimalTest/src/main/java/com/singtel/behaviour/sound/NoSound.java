package com.singtel.behaviour.sound;

public class NoSound implements ISound {
    @Override
    public void sing(){
        throw new UnsupportedOperationException("Sound is not supported");
    }

    @Override
    public boolean soundSupported() {
        return false;
    }
}
