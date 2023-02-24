package io.javabrains.javabasics;

public class Cat extends Animal {

    int numOfLives ;

    public Cat(){
        numOfLives = 1;
        name = "Cat";
        age = 5;
    }

    @Override
    public void makeSound(){
        System.out.println("The cat meows");
    }
}
