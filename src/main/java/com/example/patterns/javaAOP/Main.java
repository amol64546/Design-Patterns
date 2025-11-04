package com.example.patterns.javaAOP;

public class Main {

    @LogExecution
    public void print(){
        System.out.println("Hello world!");
    }

    public static void main(String[] args) throws Exception {
        Main main = new Main();
        AnnotationProcessor.runAnnotatedMethods(main);
        main.print();
    }
}
