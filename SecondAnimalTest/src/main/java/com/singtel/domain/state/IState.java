package com.singtel.domain.state;

import com.singtel.behaviour.fly.IFly;
import com.singtel.behaviour.sound.ISound;
import com.singtel.behaviour.swim.ISwim;
import com.singtel.behaviour.walk.IWalk;

public interface IState {
    IFly getFlyBehaviour();

    ISound getSoundBehaviour();

    IWalk getWalkBehaviour();

    ISwim getSwimBehaviour();
}
