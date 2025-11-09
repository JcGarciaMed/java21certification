package basics.arrays;

import java.util.Arrays;

public class SortingArray {
    public static void main(String[] args) {
        double[] array = new double[3];
        array[0] = 95.987;
        array[1] = 25.25;
        array[2] = 3.22;
        Arrays.sort(array);


        System.out.println(Arrays.toString(array));
        String[] array1 = {"a", "z", "x", "b", "c", "d"};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));


    }
}
