package com.singtel.behaviour.fly;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NoFly implements IFly {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Fly not supported");
    }

    @Override
    public boolean flySuspported() {
        return false;
    }
}
