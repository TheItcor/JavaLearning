import java.lang.Math;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double answer = Math.log(x+7 * Math.sqrt(Math.pow(x, 4) + Math.PI));
        System.out.printf("%.4f", answer);
    }
}
