package io.javabrains.javabasics;

public class Dog extends Animal{

    String dogBreed;

    public Dog(){
        dogBreed = "";
        name = "Dog";
        age=6;
    }

    @Override
    public void makeSound(){
        System.out.println("The dog barks");
    }
}
