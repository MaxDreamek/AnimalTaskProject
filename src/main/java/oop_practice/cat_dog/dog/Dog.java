package oop_practice.cat_dog.dog;

import oop_practice.cat_dog.animal.Animal;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
        setSound("Gav");
        setAnimalType("Dog");
    }
}
