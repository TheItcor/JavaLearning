package Tasks;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var number = scanner.nextInt();

        int sum = 0;
        for (int i=1; i != number+1; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
