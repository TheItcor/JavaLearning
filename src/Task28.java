import java.util.Scanner;

public class Task28 {
    public static boolean isOdd(int number) {
        if (number % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] allNumbersArray = new int[number+1];

        for (int i = 0; allNumbersArray[allNumbersArray.length-1] != number; i++) {
            allNumbersArray[i] = i;
        }

        for (int i = 0; i <= allNumbersArray.length-1; i++) {
            if (isOdd(allNumbersArray[i])) {
                System.out.println(allNumbersArray[i]);
            }
        }
    }
}
