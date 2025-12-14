package com.example.patterns.strategy.Duck;

import com.example.patterns.strategy.behavior.FlyWithWings;
import com.example.patterns.strategy.behavior.Squeak;

public class RedheadDuck extends Duck{

    public RedheadDuck(){
        quackBehavior = new Squeak();
        flyBehavior = new FlyWithWings();
    }
    @Override
    public void display(){
        System.out.println("This is read head duck.");
    }
}
