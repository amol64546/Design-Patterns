package com.example.patterns.strategy.Duck;

public class DecoyDuck extends Duck{
    @Override
    public void display() {
        System.out.println("This is decoy duck.");
    }
}
