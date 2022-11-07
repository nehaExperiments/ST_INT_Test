package com.singtel.factory;


import com.singtel.behaviour.swim.*;

public class SwimFactory {
    public static ISwim getSwimBehaviour(String behaviour){
        if (behaviour.equalsIgnoreCase("NO_SWIM")){
            return new NoSwimImpl();
        } else {
            return new SwimImpl();
        }
    }
}
