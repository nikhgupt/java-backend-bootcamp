package io.javabrains.javabasics;

/*
Create a class `Rectangle` with the following attributes: `width`, `height`, and a static variable `numOfRectangles` which will keep track of the number of rectangles created.

1.  Create a constructor that takes the width and height as arguments and sets the values of the `width` and `height` instance variables.
2.  Create a method `getArea` that calculates and returns the area of the rectangle.
3.  Create a method `getPerimeter` that calculates and returns the perimeter of the rectangle.
4.  Create a method `getNumOfRectangles` that returns the value of the `numOfRectangles` static variable.
5.  In this main method, create several `Rectangle` objects, calculate and print their area and perimeter, and finally print the number of rectangles created without keeping count in this class.
 */

public class StaticChallenge {

    public static void main(String[] args) {

        Rectangle a = new Rectangle(10,20);
        Rectangle b = new Rectangle (25,2);
        Rectangle c = new Rectangle(15,5);
        System.out.println("a.getArea() = " + a.getArea());
        System.out.println("a.getPerimeter() = " + a.getPerimeter());
        System.out.println("b.getArea() = " + b.getArea());
        System.out.println("b.getPerimeter() = " + b.getPerimeter());
        System.out.println("c.getArea() = " + c.getArea());
        System.out.println("c.getPerimeter() = " + c.getPerimeter());
        System.out.println("Rectangle.numOfRectangles = " + Rectangle.numOfRectangles);

    }
}

class Rectangle {
    float width ;
    float length ;
    static int numOfRectangles = 0;

    public Rectangle(float width, float length){
        this.width = width;
        this.length = length;
        numOfRectangles +=1 ;

    }

    public float getArea() {
        return width * length;
    }

    public float getPerimeter() {
        return 2*(width + length);
    }

    public int getNumOfRectangles(){
        return numOfRectangles;
    }
}
