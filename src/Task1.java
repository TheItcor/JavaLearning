import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        // what's a number is bigger
        Scanner scanner = new Scanner(System.in);
        double number1 = scanner.nextDouble();
        double number2 = scanner.nextDouble();

        System.out.println(number1>number2?number1:number2);
    }
}
