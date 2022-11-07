package com.singtel.factory;

import com.singtel.behaviour.walk.*;

public class WalkFactory {
    public static IWalk getWalkBehaviour(String behaviour){
        if (behaviour.equalsIgnoreCase("NO_WALK")){
            return new NoWalk();
        } else {
            return new Walk();
        }
    }
}
