package Tasks;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var weekDay = scanner.nextLine();
        switch (weekDay) {
            case "Понедельник":
            case "понедельник":
                System.out.println("Monday");
                break;
            case "Вторник":
            case "вторник":
                System.out.println("Tuesday");
                break;
            case "Среда":
            case "среда":
                System.out.println("Wednesday");
                break;
            case "Четверг":
            case "четверг":
                System.out.println("Thursday");
                break;
            case "Пятница":
            case "пятница":
                System.out.println("Friday");
                break;
            case "Суббота":
            case "суббота":
                System.out.println("Saturday");
                break;
            case "Воскресенье":
            case "воскресенье":
                System.out.println("Sunday");
                break;
            default:
                System.out.println("ERROR");
                break;

        }
    }
}
