package io.javabrains.javabasics;

/*
Create a class `Animal2` with an abstract method `makeSound`.
Create an anonymous inner class implementation of `Animal2` and then call the `makeSound` method
 */

public class AnonymousInnerClasses {
    public static void main(String[] args) {
        Animal2 an2 =new Animal2(){

            @Override
            public void makeSound() {
                System.out.println("This abstract method is making sounds.");
            }
        };
        an2.makeSound();

    }

}
