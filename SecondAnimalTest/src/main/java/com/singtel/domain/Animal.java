package com.singtel.domain;

import lombok.experimental.SuperBuilder;

public interface Animal {
    void walk();

    void flyNow();

    void makeSound();

    void swim();

    boolean canSwim();

    boolean canWalk();

    boolean canFly();

    boolean canMakeSound();

}
