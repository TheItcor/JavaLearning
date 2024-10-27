package Classes;

public class NewHuman {
    private String name;
    private int age;
    private int weight;
    private int height;

    public NewHuman(String name, int age, int weight, int height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public NewHuman(String name, int age) {
        this(name, age, 70,175);
    }

    public NewHuman() {
        this("Ivan", 18, 70, 175);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    public void setWeight(int weight) {
        if (weight >= 0) {
            this.weight = weight;
        }
    }

    public void setHeight(int height) {
        if (height >= 0) {
            this.height = height;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }
}
