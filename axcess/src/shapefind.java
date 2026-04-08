abstract class Shape {

    // Abstract method to calculate area
    abstract double calculateArea();

    // Abstract method to calculate perimeter
    abstract double calculatePerimeter();
}
class Circle extends Shape {

    double radius;

    // Constructor

    Circle(double radius) {
        this.radius = radius;
    }

    // Implement area formula
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Implement perimeter formula
    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
class Rectangle extends Shape {

    double length, breadth;

    // Constructor
    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Area of rectangle
    @Override
    double calculateArea() {
        return length * breadth;
    }

    // Perimeter of rectangle
    @Override
    double calculatePerimeter() {
        return 2 * (length + breadth);
    }
}
class Triangle extends Shape {

    double base, height, side1, side2, side3;

    // Constructor
    Triangle(double base, double height, double side1, double side2, double side3) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Area of triangle
    @Override
    double calculateArea() {
        return 0.5 * base * height;
    }

    // Perimeter of triangle
    @Override
    double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}
class ShapeCalculator {

    static void calculateTotal(Shape[] shapes) {

        double totalArea = 0;
        double totalPerimeter = 0;

        // Loop through all shapes
        for (Shape s : shapes) {
            totalArea += s.calculateArea();
            totalPerimeter += s.calculatePerimeter();
        }

        // Display results
        System.out.println("Total Area = " + totalArea);
        System.out.println("Total Perimeter = " + totalPerimeter);
    }
}
public class shapefind {
    public static void main(String[] args) {

        // Create shape objects
        Shape c = new Circle(5);
        Shape r = new Rectangle(4, 6);
        Shape t = new Triangle(4, 5, 3, 4, 5);

        // Store all shapes in an array
        Shape[] shapes = {c, r, t};

        // Calculate total area and perimeter
        ShapeCalculator.calculateTotal(shapes);
    }
}
