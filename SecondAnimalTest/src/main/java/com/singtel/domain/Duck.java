package com.singtel.domain;

import com.singtel.behaviour.walk.IWalk;
import com.singtel.factory.FlyFactory;
import com.singtel.factory.SoundFactory;
import lombok.Builder;
import lombok.experimental.SuperBuilder;

@SuperBuilder
public class Duck extends Bird {
    IWalk walkBehaviour;

    @Override
    public void walk() {
        walkBehaviour.walk();
    }

    @Override
    public boolean canWalk() {
        return walkBehaviour.walkSupported();
    }
}
