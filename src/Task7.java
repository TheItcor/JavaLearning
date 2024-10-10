import java.util.Scanner;
import java.lang.Math;

class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double d1 = Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2));
        double d2 = Math.sqrt(Math.pow(x2, 2) + Math.pow(y2, 2));
        if (d1 < d2)
        {
            System.out.println("Первая точка ближе");
        }
        else if (d2 < d1)
        {
            System.out.println("Вторая точка ближе");
        }
        else
        {
            System.out.println("Точки на равных расстояниях");
        }

    }
}
