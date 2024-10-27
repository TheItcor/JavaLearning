package Tasks;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        // from seconds to minutes and hours
        Scanner scanner = new Scanner(System.in);
        int second = scanner.nextInt();
        int minute = 0;
        int hour = 0;

        while (second > 59) {
            minute++;
            second = second - 60;
        }
        while (minute > 59) {
            hour++;
            minute = minute - 60;
        }

        System.out.printf("%d hours %d minutes %d seconds", hour, minute, second);
    }
}
