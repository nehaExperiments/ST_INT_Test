package com.singtel.domain.state;

import com.singtel.behaviour.fly.IFly;
import com.singtel.behaviour.sound.ISound;
import com.singtel.behaviour.swim.ISwim;
import com.singtel.behaviour.walk.IWalk;
import com.singtel.factory.FlyFactory;
import com.singtel.factory.SoundFactory;
import com.singtel.factory.SwimFactory;
import com.singtel.factory.WalkFactory;

public class CaterpillarState implements IState {
    @Override
    public IFly getFlyBehaviour() {
        return FlyFactory.getFlyBehaviour("NO_FLY");
    }

    @Override
    public ISound getSoundBehaviour() {
        return SoundFactory.getSoundBehaviour("NO_SOUND");
    }

    @Override
    public IWalk getWalkBehaviour() {
        return WalkFactory.getWalkBehaviour("WALK");
    }

    @Override
    public ISwim getSwimBehaviour() {
        return SwimFactory.getSwimBehaviour("NO_SWIM");
    }

}
