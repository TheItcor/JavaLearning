package Tasks;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var numberA = scanner.nextInt();
        var numberB = scanner.nextInt();
        double multiplication = 1;
        if (numberA > numberB) {
            int temp;
            temp = numberB;
            numberB = numberA;
            numberA = temp;
        }

        int i = numberA;
        while (i <= numberB) {
            multiplication *= i;
            i++;
        }

        System.out.println(multiplication);
    }
}
