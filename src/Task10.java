import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var number = scanner.nextInt();
        var number1 = scanner.nextInt();
        var number2 = scanner.nextInt();
        var number3 = scanner.nextInt();
        var number4 = scanner.nextInt();
        int min, min1, result;
        if (number > number1) {
            min = number1;
        }
        else {
            min = number;
        }

        if (number2 > number3) {
            min1 = number3;
        }
        else {
            min1 = number2;
        }

        if (min > min1) {
            result = min1;
        }
        else {
            result = min;
        }

        if (result > number4) {
            System.out.println(number4);
        }
        else {
            System.out.println(result);
        }
    }
}
