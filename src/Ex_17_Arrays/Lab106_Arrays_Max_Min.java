package Ex_17_Arrays;

import java.util.Arrays;

public class Lab106_Arrays_Max_Min {
    public static void main(String[] args) {
        int[] array = {35,89,100,67,11,83};
       // Arrays.sort(array);
       // System.out.println(array[array.length-1]);

        int max_output = give_me_max(array);
        int min_output = give_me_min(array);
        System.out.println(max_output);

    }

    static int give_me_max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];

            }
        }
        return max;

    }
    static int give_me_min(int[] array){
        int min = array[0];
        for (int i = 0; i < array.length ; i++) {
            if (array[i] < min){
                min = array[i];
            }

        }
return min;


    }
}
