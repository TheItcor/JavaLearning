import java.util.Scanner;

public class NumberPlusNumber {
    public static void main(String[] args) {
        Scanner ScanName = new Scanner(System.in);
        int NumberX = ScanName.nextInt();
        int NumberY = ScanName.nextInt();
        int NumberFinal = NumberX + NumberY;
        System.out.printf("%d", NumberFinal);
    }
}
