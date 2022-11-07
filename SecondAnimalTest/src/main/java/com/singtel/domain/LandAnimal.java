package com.singtel.domain;

public interface LandAnimal extends Animal {

    @Override
    default void flyNow() {
        throw new UnsupportedOperationException("Fly is not supported for land animals");
    }

    @Override
    default void swim() {
        throw new UnsupportedOperationException("Swim is not supported for land animals");
    }

    @Override
    default boolean canFly() {
        return false;
    }

    @Override
    default boolean canSwim() {
        return false;
    }


}
