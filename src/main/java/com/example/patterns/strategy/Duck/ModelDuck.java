package com.example.patterns.strategy.Duck;

import com.example.patterns.strategy.behavior.FlyNoWay;
import com.example.patterns.strategy.behavior.Quack;

public class ModelDuck extends Duck{

    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("This is model duck.");
    }
}
