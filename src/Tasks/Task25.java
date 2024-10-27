package Tasks;

public class Task25 {
    public static void main(String[] args) {
        int[] numbersTo100 = new int[101];
        for (int i = 0; i != 101; i++) {
            numbersTo100[i] = i;
        }

        for (int i = 0; i < numbersTo100.length; i++) {
            System.out.println(numbersTo100[i]);
        }
    }
}
