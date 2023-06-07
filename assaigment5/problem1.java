public abstract class Shape {
    public String color;

    protected Shape(String color) {
        this.color = color;
    }

    public abstract double calculateArea();

    public abstract double calculatePerimetr();
}

class Rectangle extends Shape {

    private int width;
    private int height;

    public Rectangle(String color, int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimetr() {
        return 2 * (width + height);
    }
}


class Circle extends Shape {

    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimetr() {
        return (2 * Math.PI * radius);
    }


}

class Square extends Shape {

    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePerimetr() {
        return side * 4;
    }
}

class Main {
    public static void main(String[] args) {
        Shape[] shapes = {new Rectangle("red", 4, 3),
                new Circle("black_Circle", 3),
                new Circle("white_Circle", 4),
                new Square("red", 5),
                new Square("red", 7)
        };

        for (Shape shape : shapes) {
            System.out.println("Perimeter" + shape.calculatePerimetr() + "  Area " + shape.calculateArea());
        }

    }
}
