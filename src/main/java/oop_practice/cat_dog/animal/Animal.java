package oop_practice.cat_dog.animal;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        setName(name);
    }

    public abstract void sound();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
