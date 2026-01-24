// Assignment 4
abstract class Shape {
    int length;
    int breadth;
    int height;
    int radius;

    // For 2D shapes like Rectangle, Square
    public Shape(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // For 3D shapes (if needed later)
    public Shape(int length, int breadth, int height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    // For Circle
    public Shape(int radius) {
        this.radius = radius;
    }

    abstract public void area();
}

class Square extends Shape {

    public Square(int side) {
        super(side, side);   // length = breadth = side
    }

    @Override
    public void area() {
        int result = length * breadth;
        System.out.println("Area of Square: " + result);
    }
}

class Rectangle extends Shape {

    public Rectangle(int length, int breadth) {
        super(length, breadth);
    }

    @Override
    public void area() {
        int result = length * breadth;
        System.out.println("Area of Rectangle: " + result);
    }
}

class Circle extends Shape {

    public Circle(int radius) {
        super(radius);
    }

    @Override
    public void area() {
        double result = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + result);
    }
}

public class Assignment4 {
    public static void main(String[] args) {
        Shape s1 = new Square(4);
        Shape s2 = new Rectangle(5, 3);
        Shape s3 = new Circle(7);

        s1.area();
        s2.area();
        s3.area();
    }
}
