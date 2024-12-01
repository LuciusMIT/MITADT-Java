class Shape {
   
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());

        circle.setRadius(10.0);
        System.out.println("\nUpdated Radius: " + circle.getRadius());
        System.out.println("Updated Area: " + circle.calculateArea());
        System.out.println("Updated Perimeter: " + circle.calculatePerimeter());
    }
}
