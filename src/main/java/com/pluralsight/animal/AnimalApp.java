package com.pluralsight.animal;

import java.util.ArrayList;

public class AnimalApp {
    public static void main(String[] args) {
//        Animal animal1 = new Animal();
//        animal1.eat();
//        animal1.makeSound();
//
//        Dog dog1 = new Dog();
//        dog1.bark();
//        dog1.eat();
//        dog1.sleep();
//        dog1.makeSound();
//
//        Cat cat1 = new Cat();
//        cat1.meow();
//        cat1.makeSound();

        Dog dog = new Dog();
        Cat cat = new Cat();
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(cat);

        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
