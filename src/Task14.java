import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var numberDayWeek = scanner.nextLine();
        switch (numberDayWeek) {
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
                System.out.println("Working day");
                break;
            case "6":
                System.out.println("Saturday");
                break;
            case "7":
                System.out.println("Sunday");
                break;
            default:
                System.out.println("ERROR");
                break;
        }
    }
}
