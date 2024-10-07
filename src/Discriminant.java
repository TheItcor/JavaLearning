import java.util.Scanner;


public class Discriminant {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Enter a, b, c");
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            double d = b^2 - 4 * a * c;
            double x1 = (-b + Math.sqrt(d)) / 2*a;
            double x2 = (-b - Math.sqrt(d)) / 2*a;
            if (d > 0) {
                if (x1 == x2) {
                    System.out.println(x1);
                }
                else {
                    System.out.printf("x = %.1f\n", x1);
                    System.out.printf("x = %.1f", x2);
                }
            }
            else if (d == 0) {
                System.out.printf("x = %.2f", x1);
            }
            else {
                System.out.println("The equation has no real roots: x < 0");
            }

            System.out.println("\n");
        }
    }
}
