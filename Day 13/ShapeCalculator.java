class Circle {
    // Radius of the circle
    public int radius;

    // Constructor to initialize the circle with a given radius
    Circle(int radius) {
        this.radius = radius;
    }

    // Calculate the area of the circle
    public double calculateArea() {
        return Math.PI * this.radius * this.radius;
    }
}

class Cylinder extends Circle {
    // Height of the cylinder
    private int height;

    // Constructor to initialize the cylinder with a given radius and height
    Cylinder(int baseRadius, int height) {
        super(baseRadius);
        this.height = height;
    }

    // Calculate the volume of the cylinder
    public double calculateVolume() {
        return Math.PI * this.radius * this.radius * this.height;
    }
}

public class ShapeCalculator {
    public static void main(String[] args) {
        // Create a circle with a radius of 12
        Circle circle = new Circle(12);

        // Uncomment the following line to create a cylinder
        // Cylinder cylinder = new Cylinder(5, 10);
    }
}
