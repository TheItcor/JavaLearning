package Tasks;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte grade;
        byte count = 0;
        for (byte i = 0; i <= 9; i++) {
            grade = scanner.nextByte();
            if (grade < 4) {
                count++;
            }
        }
        System.out.println(count);
    }
}
