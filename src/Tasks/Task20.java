package Tasks;

import java.util.Scanner;
import static java.lang.Math.abs;

public class Task20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var number = scanner.nextInt();
        var digitSum = 0;
        var count = 0;
        do {
            digitSum += number % 10;
            count++;
            number = number / 10;
            System.out.println(number);
        } while (number != 0);
        digitSum = abs(digitSum);

        System.out.printf("%d %d", count, digitSum);
    }
}
