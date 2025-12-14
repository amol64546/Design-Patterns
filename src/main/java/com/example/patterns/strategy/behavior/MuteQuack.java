package com.example.patterns.strategy.behavior;

public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Duck cant quack.");
    }
}
