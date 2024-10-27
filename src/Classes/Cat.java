package Classes;

public class Cat {
    public String name;
    public String ownerName;
    public String breed;
    public int weight;
    public int speed;

    public String getInfo() {
        return "Name: " + name + ", Owner name: " + ownerName + ", Breed: " + breed + ", Weight: " + weight;
    }

    public void happyBirthday() {
        System.out.printf("Happy birthday, %s!", name);
    }

    public void catRunning() {
        for (int i = 0; i <= speed; i++) {
            System.out.printf("%s is running away!\n", name);
        }
    }
}
