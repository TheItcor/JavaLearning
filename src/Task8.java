import java.lang.Math;
import java.util.Scanner;


public class Task8 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        number = Math.abs(number);
        System.out.println(number);
    }
}
