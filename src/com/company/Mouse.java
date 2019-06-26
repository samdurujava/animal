package com.company;

public class Mouse extends Animal {

    public Mouse() {
        super();
        System.out.println("I am a Mouse now!");
    }

    @Override
    public String sleep() {
        return "A Mouse sleeps...";
    }

    @Override
    public String eat() {
        return "A Mouse eats...";
    }

    public String lurk() {
        return "A mouse lurks";
    }

}