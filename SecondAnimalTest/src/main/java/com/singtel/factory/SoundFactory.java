package com.singtel.factory;

import com.singtel.behaviour.sound.*;

public class SoundFactory {
    public static ISound getSoundBehaviour(String behaviour){
        if (behaviour.equalsIgnoreCase("CLUCK")){
            return new CluckSound();
        } else if (behaviour.equalsIgnoreCase("QUACK")){
            return new QuackSound();
        } else if (behaviour.equalsIgnoreCase("ROOS")){
            return new RoosSound();
        } else if (behaviour.equalsIgnoreCase("WOOF")){
            return new RoosSound();
        } else if (behaviour.equalsIgnoreCase("NO_SOUND")){
            return new NoSound();
        } else {
            return new DefaultSound();
        }
    }
}
