import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        // what's a number is bigger
        System.out.println("Input a two numbers.");
        Scanner scanner = new Scanner(System.in);
        double number1 = scanner.nextDouble();
        double number2 = scanner.nextDouble();

        System.out.println(number1>number2?number1:number2);
    }
}
