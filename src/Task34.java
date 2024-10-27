public class Task34 {
    public static void main(String[] args) {
        Monster sixyMonster = new Monster(6);
        Monster defaultMonster = new Monster();
        Monster strangeMonster = new Monster(2, 5, 6);

        sixyMonster.printInfo();
        defaultMonster.printInfo();
        strangeMonster.printInfo();
    }
}
