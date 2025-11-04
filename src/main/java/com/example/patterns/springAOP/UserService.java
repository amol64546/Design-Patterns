package com.example.patterns.springAOP;


public class UserService {

    @LogExecutionTime
    public void performTask() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Task completed.");
    }
}
