package com.Bridgelabez.Level1;

public class Circle {
    //Instance variable
    double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }
    // Method to calculate the area of the circle
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    // Method to calculate the circumference of the circle
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        // Create a Circle object with radius 5.0
        Circle myCircle = new Circle(6.0);
        // Calculate and print area
        double area = myCircle.calculateArea();
        System.out.println("Area of the circle: " + (int)area);
        System.out.println("Circumference of the circle: " +(int)myCircle.calculateCircumference());
    }
}
