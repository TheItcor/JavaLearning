package Tasks;
import Classes.NewHuman;

public class Task35 {
    public static void main(String[] args) {
        NewHuman someDude = new NewHuman("John", 25);
        System.out.printf("Name: %s, age %d, \n", someDude.getName(), someDude.getAge());
    }
}
