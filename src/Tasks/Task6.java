package Tasks;

import java.lang.Math;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double z = 2 * Math.pow(Math.sin(3*Math.PI - 2*a), 2) * Math.pow(Math.cos(5*Math.PI + 2*a), 2);
        double y = 1/4. - 1/4. * Math.sin((5/2.)*Math.PI - 8*a);
        System.out.printf("%.5f %.5f", z, y);
    }
}
