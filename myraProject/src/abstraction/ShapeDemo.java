package abstraction;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Base class Shape
abstract class Shape {
    private String color;
    private boolean filled;

    // Constructor
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    // Abstract methods
    public abstract double getArea();

    public abstract double getPerimeter();

    // Getter methods
    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }
}

// Circle class (subclass of Shape)
class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Rectangle class (subclass of Shape)
class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor
    public Rectangle(String color, boolean filled, double length, double width) {
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }
}

// Square class (subclass of Shape)
class Square extends Shape {
    private double sideLength;

    // Constructor
    public Square(String color, boolean filled, double sideLength) {
        super(color, filled);
        this.sideLength = sideLength;
    }

    @Override
    public double getArea() {
        return sideLength * sideLength;
    }

    @Override
    public double getPerimeter() {
        return 4 * sideLength;
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        // Create instances of different shapes
        Circle circle = new Circle("Red", true, 5);
        Rectangle rectangle = new Rectangle("Blue", false, 4, 6);
        Square square = new Square("Green", true, 3);

        // Demonstrate polymorphism using an array of Shape objects
        List<Shape> shapes = new ArrayList<>();
        shapes.add(circle);
        shapes.add(rectangle);
        shapes.add(square);

        // Display area and perimeter for each shape
        for (Shape shape : shapes) {
            System.out.println("Shape: " + shape.getClass().getSimpleName());
            System.out.println("Area: " + shape.getArea());
            System.out.println("Perimeter: " + shape.getPerimeter());
            System.out.println();
        }

        // User input interface (optional)
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the type of shape (Circle, Rectangle, Square): ");
        String shapeType = scanner.nextLine();

        System.out.println("Enter the color of the shape: ");
        String color = scanner.nextLine();

        System.out.println("Is the shape filled? (true/false): ");
        boolean filled = scanner.nextBoolean();

        Shape userShape = null;

        switch (shapeType.toLowerCase()) {
            case "circle":
                System.out.println("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                userShape = new Circle(color, filled, radius);
                break;
            case "rectangle":
                System.out.println("Enter the length of the rectangle: ");
                double length = scanner.nextDouble();
                System.out.println("Enter the width of the rectangle: ");
                double width = scanner.nextDouble();
                userShape = new Rectangle(color, filled, length, width);
                break;
            case "square":
                System.out.println("Enter the side length of the square: ");
                double sideLength = scanner.nextDouble();
                userShape = new Square(color, filled, sideLength);
                break;
            default:
                System.out.println("Invalid shape type.");
        }

        if (userShape != null) {
            System.out.println("\nUser Input Shape:");
            System.out.println("Area: " + userShape.getArea());
            System.out.println("Perimeter: " + userShape.getPerimeter());
        }

        scanner.close();
    }
}















