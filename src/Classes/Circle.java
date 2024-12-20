package Classes;

public class Circle {
    double radius;
    double square;
    double diameter;

    public Circle(double radius) {
        this.radius = radius;
        this.square = getSquare(radius);
        this.diameter = radius/2;
    }

    double getSquare(double radius) {
        this.square = Math.PI * Math.pow(radius, 2);
        return square;
    }

    double getDiameter(double radius) {
        this.diameter = radius/2;
        return square;
    }

    public void getInfo() {
        System.out.printf("Radius: %.2f, Square: %.2f, Diameter: %.2f \n", this.radius, this.square, this.diameter);
    }

    public void getCool() {
        System.out.println("Your circle is cool!");
    }
}
