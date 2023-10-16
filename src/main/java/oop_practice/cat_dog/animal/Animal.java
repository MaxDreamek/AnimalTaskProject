package oop_practice.cat_dog.animal;

public class Animal {
    private String name;
    private String sound;
    private String animalType;

    {
        animalType = "Animal";
        sound = "";
    }

    public Animal(String name) {
        setName(name);
    }

    public void sound() {
        System.out.println("I'am a " + getAnimalType() + ". My name is " + getName() + ". " + getSound());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }
}
