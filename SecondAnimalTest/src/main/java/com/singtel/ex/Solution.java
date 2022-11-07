package com.singtel.ex;

import lombok.extern.slf4j.Slf4j;

class Animal {
    void walk(){
        System.out.println("I am walking");
    }
}
class Bird extends Animal {
    void fly() {
        System.out.println("I am flying");
    }

    void sing() {
        System.out.println("I am singing");
    }
}

@Slf4j
public class Solution {
    public static void main(String[] args) {
        log.info("Launched");
        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();
    }
}