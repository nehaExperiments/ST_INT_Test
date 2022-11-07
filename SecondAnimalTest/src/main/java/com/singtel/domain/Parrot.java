package com.singtel.domain;

import com.singtel.factory.FlyFactory;
import lombok.Builder;
import lombok.experimental.SuperBuilder;

@SuperBuilder
public class Parrot extends Bird {
    public Animal neighbour;

    @Override
    public void flyNow() {
        flyBehaviour.fly();
    }

    @Override
    public void makeSound() {
        neighbour.makeSound();
    }

    @Override
    public boolean canFly() {
        return flyBehaviour.flySuspported();
    }

    @Override
    public boolean canMakeSound() {
        return neighbour.canMakeSound();
    }
}
