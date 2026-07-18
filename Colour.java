package project;
abstract class Shape {
    abstract double calculateArea();

    void display() {
        System.out.println("Calculating area...");
    }
}

class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return 3.14 * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double calculateArea() {
        return length * width;
    }
}

public class Colour {
    public static void main(String[] args) {
        Shape s1 = new Circle(5);
        s1.display();
        System.out.println("Circle Area: " + s1.calculateArea());

        Shape s2 = new Rectangle(4, 6);
        s2.display();
        System.out.println("Rectangle Area: " + s2.calculateArea());
    }
}

