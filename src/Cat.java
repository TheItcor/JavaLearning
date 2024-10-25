public class Cat {
    String name;
    String ownerName;
    String breed;
    int weight;
    int speed;

    String getInfo() {
        return "Name: " + name + ", Owner name: " + ownerName + ", Breed: " + breed + ", Weight: " + weight;
    }

    void happyBirthday() {
        System.out.printf("Happy birthday, %s!", name);
    }

    void catRunning() {
        for (int i = 0; i <= speed; i++) {
            System.out.printf("%s is running away!\n", name);
        }
    }
}
