package com.example.patterns.strategy.Duck;

import com.example.patterns.strategy.behavior.FlyNoWay;
import com.example.patterns.strategy.behavior.MuteQuack;

public class RubberDuck extends Duck{

    public RubberDuck(){
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("This is rubber duck.");
    }
}
