import java.lang.Math;
import java.util.Scanner;


public class Task8 {

    static int isOdd(int number) {
        if (number % 2 != 0)
        {
            return 1;
        }
        else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        number = Math.abs(number);


        if (99 < number & number > 999)
        {
            System.out.println("ERROR");
            return;
        }

        int temp;
        int result = 0;

        do {
            temp = number % 10;
            number = number / 10;

            if (isOdd(temp) == 1)
            {
                result = result + temp;
            }
        } while (number != 0);

        if (result == 0)
        {
            System.out.println("NO");
            return;
        }
        System.out.println(result);

    }
}
