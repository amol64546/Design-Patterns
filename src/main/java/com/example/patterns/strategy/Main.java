package com.example.patterns.strategy;

import com.example.patterns.strategy.Duck.Duck;
import com.example.patterns.strategy.Duck.MallardDuck;
import com.example.patterns.strategy.Duck.ModelDuck;
import com.example.patterns.strategy.behavior.FlyRocketPowered;

public class Main {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performFly();
        mallard.performQuack();

        Duck modelDuck = new ModelDuck();
        modelDuck.display();
        modelDuck.performFly();
        modelDuck.performQuack();

        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
    }
}
