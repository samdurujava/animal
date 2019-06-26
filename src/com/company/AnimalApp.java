package com.company;

public class AnimalApp {

    public static void main(String[] args) {

        Animal a = new Animal();
        print(a.eat());
        print(a.sleep());

        Cat c = new Cat();
        print(c.eat());
        print(c.sleep());
        print(c.purr());


        Bird b = new Bird();
        print(b.eat());
        print(b.sleep());
        print(b.fly());

        Human h = new Human();
        print(h.eat());
        print(h.sleep());
        print(h.hate());

        Mouse m = new Mouse();
        print(m.eat());
        print(m.sleep());
        print(m.lurk());

    }

    private static void print(String s) {
        System.out.println(s);
    }
}
