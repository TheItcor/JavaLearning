public class Circle {
    double radius = 1;
    double square = getSquare(radius);
    double diameter = radius/2;

    double getSquare(double radius) {
        this.square = Math.PI * Math.pow(radius, 2);
        return square;
    }

    double getDiameter(double radius) {
        this.diameter = radius/2;
        return square;
    }

    void getInfo() {
        System.out.printf("Radius: %.2f, Square: %.2f, Diameter: %.2f \n", radius, square, diameter);
    }

    void getCool() {
        System.out.println("Your circle is cool!");
    }
}
