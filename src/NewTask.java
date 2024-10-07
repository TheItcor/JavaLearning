import java.util.Scanner;
import java.util.Locale;


public class NewTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nameSurname = in.nextLine();
        int age = in.nextInt();
        double discount = in.nextDouble();
        System.out.printf("С днем рождения, %s! Сегодня Вам %d!\n", nameSurname, age);
        System.out.printf("По этому поводу дарим Вам скидку %.1f%%\n", discount);
        System.out.print("на весь ассортимент нашего сайта!");
        in.close();
    }
}
