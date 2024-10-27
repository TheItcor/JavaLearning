package Tasks;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ruble = scanner.nextInt();
        int kopeck = scanner.nextInt();
        int discount = scanner.nextInt();
        kopeck = ruble*100 + kopeck;
        int priceKopeck = kopeck - (kopeck*discount/100);
        int priceRuble = 0;

        while (priceKopeck > 99) {
            priceRuble++;
            priceKopeck = priceKopeck - 100;
        }
        System.out.printf("%d rub. %02d kop. ", priceRuble, priceKopeck);
    }
}
