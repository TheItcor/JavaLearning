import java.util.Scanner;

public class NumberPlusNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input first Number: ");
        int numberX = in.nextInt();
        System.out.print("Input second Number: ");
        int numberY = in.nextInt();
        System.out.printf("Result: %d", numberY+numberX);
        in.close();
    }
}
