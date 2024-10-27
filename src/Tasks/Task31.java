package Tasks;

import Classes.Cat;

public class Task31 {
    public static void main(String[] args) {
        Cat someCat = new Cat();
        someCat.name = "Silly Classes.Cat";
        someCat.ownerName = "Andrew";
        someCat.breed = "Siam";
        someCat.weight = 7;
        someCat.speed = 5;
        System.out.println(someCat.getInfo());
        someCat.happyBirthday();
        someCat.catRunning();
    }
}
