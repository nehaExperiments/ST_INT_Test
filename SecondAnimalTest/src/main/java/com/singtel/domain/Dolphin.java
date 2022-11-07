package com.singtel.domain;

import com.singtel.behaviour.swim.ISwim;
import lombok.Builder;

@Builder
public class Dolphin {
    ISwim swimBehaviour;

    public void swim() {
        swimBehaviour.swim();
    }
}
