package Tasks;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var hour = scanner.nextInt();
        var tariff = scanner.nextDouble();
        if (hour < 0 | tariff < 0) {
            System.out.println("ERROR");
            return;
        }

        double payment;
        if (hour >= 40) {
            payment = 20 * tariff;
            payment += 20 * tariff * 1.5;
            payment += (hour-40) * tariff * 2;
        } else if (hour >= 20) {
            payment = 20 * tariff;
            payment += (hour-20) * tariff * 1.5;
        }
        else {
            payment = hour * tariff;
        }

        System.out.printf("%.2f", payment);
    }
}
