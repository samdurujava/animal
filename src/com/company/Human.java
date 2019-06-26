package com.company;

public class Human extends Animal {

    public Human() {
        super();
        System.out.println("The Human is here!");
    }

    @Override
    public String sleep() {
        return "A human sleeps...";
    }

    @Override
    public String eat() {
        return "A human eats...";
    }

    public String hate() {
        return "A human hates";
    }

}