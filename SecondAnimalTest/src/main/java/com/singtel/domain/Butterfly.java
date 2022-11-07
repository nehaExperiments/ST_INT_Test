package com.singtel.domain;

import com.singtel.domain.state.CaterpillarState;
import com.singtel.domain.state.GrownupState;
import com.singtel.domain.state.IState;
import lombok.experimental.SuperBuilder;

@SuperBuilder
public class Butterfly extends Bird {
    IState state = new CaterpillarState();

    @Override
    public void walk() {
        this.state.getWalkBehaviour().walk();
    }

    @Override
    public void flyNow(){
        this.state.getFlyBehaviour().fly();
    }

    @Override
    public void makeSound(){
        this.state.getSoundBehaviour().sing();
    }

    @Override
    public void swim(){
        this.state.getSwimBehaviour().swim();
    }

    public void metamorphose(){
        this .state = new GrownupState();
    }

    @Override
    public boolean canSwim(){
        return this.state.getSwimBehaviour().swimSupported();
    }

    @Override
    public boolean canWalk(){
        return this.state.getWalkBehaviour().walkSupported();
    }

    @Override
    public boolean canFly(){
        return this.state.getFlyBehaviour().flySuspported();
    }

    @Override
    public boolean canMakeSound(){
        return this.state.getSoundBehaviour().soundSupported();
    }

}
