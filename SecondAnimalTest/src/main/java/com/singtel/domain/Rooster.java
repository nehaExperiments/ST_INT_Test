package com.singtel.domain;

import com.singtel.factory.FlyFactory;
import com.singtel.factory.SoundFactory;
import lombok.Builder;
import lombok.experimental.SuperBuilder;

@SuperBuilder
public class Rooster extends Chicken {
    public void Rooster(){
            this.flyBehaviour = FlyFactory.getFlyBehaviour("FLY");
            this.soundBehaviour = SoundFactory.getSoundBehaviour("Roos");
    }
}