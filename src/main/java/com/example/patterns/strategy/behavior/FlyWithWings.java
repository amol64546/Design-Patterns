package com.example.patterns.strategy.behavior;

public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Duck is flying...");
    }
}
