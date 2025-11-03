package com.example.patterns.singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        instance1.showMessage();

        if (instance1 == instance2) {
            System.out.println("Both instances are the same (Singleton works).");
        } else {
            System.out.println("Instances are different (Singleton failed).");
        }
    }
}

