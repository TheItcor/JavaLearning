package Tasks;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var countNumbers = scanner.nextInt();


        int temp = scanner.nextInt();
        for (int i = 0; i < countNumbers-1; i++) {
            var number = scanner.nextInt();
            if (number < temp) {
                temp = number;
            }
        }
        System.out.println(temp);
    }
}
