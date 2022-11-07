package com.singtel.domain;

import com.singtel.behaviour.sound.ISound;
import com.singtel.behaviour.walk.IWalk;
import lombok.experimental.SuperBuilder;

@SuperBuilder
public class Dog implements LandAnimal {
    ISound soundBehaviour;
    IWalk walkBehaviour;

    @Override
    public void makeSound() {
        soundBehaviour.sing();
    }

    @Override
    public boolean canMakeSound() {
        return soundBehaviour.soundSupported();
    }

    @Override
    public void walk() {
        walkBehaviour.walk();
    }

    @Override
    public boolean canWalk() {
        return walkBehaviour.walkSupported();
    }
}
