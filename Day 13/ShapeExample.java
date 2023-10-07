class Rectangle {
    protected double length;
    protected double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

class Cuboid extends Rectangle {
    protected double height;

    public Cuboid(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }

    public double calculateVolume() {
        return length * width * height;
    }

    @Override
    public double calculateArea() {
        // Surface area of a cuboid
        return 2 * ((length * width) + (width * height) + (height * length));
    }
}

public class ShapeExample {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());

        Cuboid cuboid = new Cuboid(5, 10, 3);
        System.out.println("\nCuboid Area: " + cuboid.calculateArea());
        System.out.println("Cuboid Volume: " + cuboid.calculateVolume());
    }
}
