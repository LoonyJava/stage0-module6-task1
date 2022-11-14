package com.epam.mjc.stage0;

public class Bird extends Animal {

    public Bird() {
        super("blue", 2, false);
    }

    @Override
    public String getDescription() {
        String description = super.getDescription() + " " + "Moreover, it has 2 wings and can fly.";
        return description;
    }

    public static void main(String[] args) {
        Bird bird = new Bird();
        Animal animal = new Animal("red",1,false);
        Dog dog = new Dog();
        System.out.println(bird.getDescription());
        System.out.println(animal.getDescription());
        System.out.println(dog.getDescription());
    }
}
