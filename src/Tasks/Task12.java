package Tasks;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var distanceAToB = scanner.nextInt();
        var distanceBToC = scanner.nextInt();
        var weigh = scanner.nextInt();

        int fuelBurningPerKilometr = 1;

        if (weigh > 2000) {
            System.out.println("ERROR");
            return;
        }
        if (weigh > 500) {
            fuelBurningPerKilometr = 4;
        }
        if (weigh > 1000) {
            fuelBurningPerKilometr = 7;
        }
        if (weigh > 1500) {
            fuelBurningPerKilometr = 9;
        }

        double fuelBurns, fuelNeedsBtoC;
        final int tankCapacity = 300;
        fuelBurns = fuelBurningPerKilometr * distanceAToB + fuelBurningPerKilometr * distanceBToC;
        fuelNeedsBtoC = fuelBurns - tankCapacity;

        if (fuelNeedsBtoC < 0) {
            System.out.println("0.00");
            return;
        }

        if (fuelBurningPerKilometr * distanceAToB > tankCapacity | fuelBurningPerKilometr * distanceBToC > tankCapacity) {
            System.out.println("ERROR");
            return;
        } else {
            System.out.printf("%.2f", fuelNeedsBtoC);
        }

    }
}
