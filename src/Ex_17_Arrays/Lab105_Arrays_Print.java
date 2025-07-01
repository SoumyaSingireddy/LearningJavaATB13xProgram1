package Ex_17_Arrays;

import java.util.Arrays;

public class Lab105_Arrays_Print {
    public static void main(String[] args) {
        int[] marks = {55,70,98,86,75};
        System.out.println("----");

        for (int i = 0; i < marks.length ; i++) {
            System.out.println(marks[i]);

        }
        Arrays.sort(marks);

        for (int i = 0; i < marks.length ; i++) {
            System.out.println(marks[i]);
        }
    }
}
