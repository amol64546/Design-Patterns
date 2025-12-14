package com.example.patterns.strategy.behavior;

public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Duck is squeaking....");
    }
}
