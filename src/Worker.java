public class Worker {
    String name;
    String employeePosition;
    int age;
    int salary;

    public Worker(String name, String employeePosition, int age, int salary) {
        this.name = name;
        this.employeePosition = employeePosition;
        this.age = age;
        this.salary = salary;
    }


    void getInfo() {
        System.out.printf("Name of employee: %s \nPosition: %s \nAge: %d \nSalary: %d", this.name, this.employeePosition, this.age, this.salary);
    }
}
