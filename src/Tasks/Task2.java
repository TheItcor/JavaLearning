package Tasks;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ruble = scanner.nextInt();
        int kopeck = scanner.nextInt();
        while (kopeck > 99) {
            ruble++;
            kopeck = kopeck - 100;
        }
        System.out.printf("%d р. %d к.",ruble, kopeck);
    }
}
