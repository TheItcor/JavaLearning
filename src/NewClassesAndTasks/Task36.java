package NewClassesAndTasks;

public class Task36 {
    public static void main(String[] args) {
        // sum method
        int a = MathMethods.sum(1241,421, 51,55,51,451,532);
        System.out.println(a);

        String[] arrayMonths = new String[12];
        arrayMonths[0] = "Jan";
        arrayMonths[1] = "Feb";
        arrayMonths[2] = "Mar";
        arrayMonths[3] = "Apr";
        arrayMonths[4] = "May";
        arrayMonths[5] = "Jun";
        arrayMonths[6] = "Jul";
        arrayMonths[7] = "Aug";
        arrayMonths[8] = "Sep";
        arrayMonths[9] = "Oct";
        arrayMonths[10] = "Nov";
        arrayMonths[11] = "Dec";

        for (String month : arrayMonths) {
            System.out.println(month);
        }

        System.out.println("/////");

        for (int i = 0; i != arrayMonths.length; i++) {
            System.out.println(arrayMonths[i]);
        }
    }
}
