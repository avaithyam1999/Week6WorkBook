package com.pluralsight;

public class AnimalApp {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.eat();

        Dog dog1 = new Dog();
        dog1.bark();
        dog1.eat();
        dog1.sleep();
    }
}
