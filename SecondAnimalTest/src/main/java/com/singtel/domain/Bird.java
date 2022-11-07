package com.singtel.domain;

import com.singtel.behaviour.fly.IFly;
import com.singtel.behaviour.sound.ISound;
import lombok.experimental.SuperBuilder;

@SuperBuilder
public abstract class Bird implements Animal {

    IFly flyBehaviour;
    ISound soundBehaviour;

    @Override
    public void flyNow() {
        flyBehaviour.fly();
    }

    @Override
    public void makeSound() {
        soundBehaviour.sing();
    }

    @Override
    public boolean canFly() {
        return flyBehaviour.flySuspported();
    }

    @Override
    public boolean canMakeSound() {
        return soundBehaviour.soundSupported();
    }

    public void walk() {
        throw new UnsupportedOperationException("not supported at base");
    }

    public void swim() {
        throw new UnsupportedOperationException("not supported at base");
    }

    @Override
    public boolean canSwim() {
        return false;
    }

    @Override
    public boolean canWalk() {
        return false;
    }


}
