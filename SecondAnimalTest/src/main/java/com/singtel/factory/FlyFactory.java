package com.singtel.factory;

import com.singtel.behaviour.fly.*;

public class FlyFactory {
    public static IFly getFlyBehaviour(String behaviour){
        if (behaviour.equalsIgnoreCase("NO_FLY")){
            return new NoFly();
        } else {
            return new Fly();
        }
    }
}
