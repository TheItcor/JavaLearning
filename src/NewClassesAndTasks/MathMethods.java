package NewClassesAndTasks;

public class MathMethods {

    final static double PI = 3.14;

    public static int sum(int... numbers) {
        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        return sum;
    }
}
