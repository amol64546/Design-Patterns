package com.example.patterns.strategy.Duck;

import com.example.patterns.strategy.behavior.FlyWithWings;
import com.example.patterns.strategy.behavior.Quack;

public class MallardDuck extends Duck{

    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("This is Mallard Duck");
    }
}
