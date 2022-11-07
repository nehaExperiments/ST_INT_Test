package com.singtel.domain;

import com.singtel.behaviour.swim.ISwim;
import lombok.experimental.SuperBuilder;

@SuperBuilder
public abstract class Fish implements Animal {
    ISwim swimBehaviour;

    abstract public String getColor();

    abstract public String getSize();

    @Override
    public void swim() {
        swimBehaviour.swim();
    }

    @Override
    public void walk() {
        throw new UnsupportedOperationException("walk is not supported for fish");
    }

    @Override
    public void flyNow() {
        throw new UnsupportedOperationException("fly is not supported for fish");
    }

    @Override
    public void makeSound() {
        throw new UnsupportedOperationException("sound is not supported for fish");
    }

    @Override
    public boolean canFly() {
        return false;
    }

    @Override
    public boolean canMakeSound() {
        return false;
    }

    @Override
    public boolean canSwim() {
        return swimBehaviour.swimSupported();
    }

    @Override
    public boolean canWalk() {
        return false;
    }

}
