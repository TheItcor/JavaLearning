package Tasks;

public class Task24 {
    public static void main(String[] args) {
        String[] monthsOfYear = new String[12];
        monthsOfYear[0] = "January";
        monthsOfYear[1] = "February";
        monthsOfYear[2] = "March";
        monthsOfYear[3] = "April";
        monthsOfYear[4] = "May";
        monthsOfYear[5] = "June";
        monthsOfYear[6] = "July";
        monthsOfYear[7] = "August";
        monthsOfYear[8] = "September";
        monthsOfYear[9] = "October";
        monthsOfYear[10] = "November";
        monthsOfYear[11] = "December";
        for (int i = 0; i < monthsOfYear.length; i++) {
            System.out.print(monthsOfYear[i]);
            if (i == monthsOfYear.length - 1) {
                System.out.print(".");
            } else {
                System.out.print(", ");
            }
        }
    }
}
