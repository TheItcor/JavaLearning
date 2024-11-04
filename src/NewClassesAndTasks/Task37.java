package NewClassesAndTasks;

public class Task37 {
    public static void main(String[] args) {
        String someString = "Hello! My name is Alex and i'm 29 years old.";
        String name = someString.substring(18, 22);
        int age = Integer.parseInt(someString.substring(31, 33));
        Person personAlex = new Person();

        personAlex.setName(name);
        personAlex.setAge(age);

        System.out.printf("- His name: %s and he is %d years old", personAlex.getName(), personAlex.getAge());

    }

}
