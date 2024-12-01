abstract class Shape {
    int length;
    int breadth;

    public Shape(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    abstract void printArea();
}

class Rectangle extends Shape {
    public Rectangle(int length, int breadth) {
        super(length, breadth);
    }

    @Override
    void printArea() {
        int area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }
}

class Triangle extends Shape {
    public Triangle(int length, int breadth) {
        super(length, breadth);
    }

    @Override
    void printArea() {
        int area = (length * breadth) / 2;
        System.out.println("Area of Triangle: " + area);
    }
}

class Circle extends Shape {
    public Circle(int length) {
        super(length, 0);
    }

    @Override
    void printArea() {
        double area = Math.PI * length * length;
        System.out.println("Area of Circle: " + area);
    }
}

class Main{
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 10);
        rectangle.printArea();

        Shape triangle = new Triangle(5, 10);
        triangle.printArea();

        Shape circle = new Circle(7);
        circle.printArea();
    }
}
