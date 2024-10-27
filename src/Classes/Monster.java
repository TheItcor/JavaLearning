package Classes;

public class Monster {
    int hands;
    int eyes;
    int legs;

    public Monster() {
        this(2,2,2);
    }

    public Monster(int amount) {
        this(amount, amount, amount);
    }

    public Monster(int hands, int eyes, int legs) {
        this.hands = hands;
        this.eyes = eyes;
        this.legs = legs;
    }

    public void printInfo() {
        System.out.printf("Classes.Monster eyes: %s, hands: %s, legs: %s \n", this.eyes, this.hands, this.legs);
    }

}
