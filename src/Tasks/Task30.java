package Tasks;

import Classes.Human;

public class Task30 {
    public static void main(String[] args) {
        Human humanPedro = new Human();
        humanPedro.name = "Pedro";
        humanPedro.age = 56;
        humanPedro.weight = 76;
        humanPedro.height = 167;
        System.out.printf("My spanish grandpa is %s, and he is %d years old.", humanPedro.name, humanPedro.age);
    }
}
