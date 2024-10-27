package Tasks;

import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var controlNumber = scanner.nextInt();
        int justNumber;
        int count = 0;

        do {
          justNumber = scanner.nextInt();
          if (controlNumber % justNumber == 0 & justNumber > 0) {
              count++;
          }
        } while (justNumber >= 0);

        System.out.println(count);
    }
}
