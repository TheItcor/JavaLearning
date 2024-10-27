public class Monster {
    int hands;
    int eyes;
    int legs;

    Monster() {
        this(2,2,2);
    }

    Monster(int amount) {
        this(amount, amount, amount);
    }

    Monster(int hands, int eyes, int legs) {
        this.hands = hands;
        this.eyes = eyes;
        this.legs = legs;
    }

    void printInfo() {
        System.out.printf("Monster eyes: %s, hands: %s, legs: %s \n", this.eyes, this.hands, this.legs);
    }

}
