package com.singtel.domain;

import com.singtel.behaviour.walk.IWalk;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Data
public class Chicken extends Bird {
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
