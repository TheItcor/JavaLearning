package Tasks;

import Classes.Box;

public class Task29 {
    public static void main(String[] args) {
        Box someBox = new Box();
        someBox.x = 20;
        someBox.y = 10;
        someBox.z = 20;
        var boxVolume = someBox.x * someBox.y * someBox.z;
        System.out.println("Classes.Box Volume: " + someBox.getVolume());
    }
}
