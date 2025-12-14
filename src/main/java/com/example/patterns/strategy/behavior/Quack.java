package com.example.patterns.strategy.behavior;

public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Duck is quacking...");
    }
}
