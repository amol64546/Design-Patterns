package com.example.patterns.strategy.behavior;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Duck cant fly..");
    }
}
