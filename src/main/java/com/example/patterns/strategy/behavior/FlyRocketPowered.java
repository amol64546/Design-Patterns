package com.example.patterns.strategy.behavior;

public class FlyRocketPowered implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Flying with rocket power....");
    }
}
