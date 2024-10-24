public class Task26 {
    public static void main(String[] args) {
        int[] numbers = {10, 41, 51, 51, 65, 15, 10};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println(" ");

        for (int i = numbers.length - 1 ; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}
