package Tasks;

import java.util.Scanner;

public class Task27 {
    public static void main(String[] args) {
        System.out.println("Input your numbers (> 0) in Arroy");
        System.out.println("[-1] - for end");
        Scanner scanner = new Scanner(System.in);
        int[] someArroy = new int[100];
        int answer = 0;
        int i0 = 0;
        while (answer != -1) {
            answer = scanner.nextInt();
            someArroy[i0] = answer;
            i0++;
        }

        for (int i1 = 0; i1 != i0; i1++) {
            System.out.println(someArroy[i1]);
        }
    }
}
