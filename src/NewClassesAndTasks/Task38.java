package NewClassesAndTasks;

public class Task38 {
    public static void main(String[] args) {
        boolean flag = false;

        for(int x = 1; x < 999_999; x++) {
            if (flag == false) {

                // here you can place any function
                for (int y = 1; y < 999_999; y++) {

                    if (x + y == Math.pow(y, 2)) {
                        System.out.println("IT'S FOUNDED!");
                        System.out.printf("x = %d, y = %d", x, y);
                        flag = true;
                    }
                }
            }
        }
    }
}
