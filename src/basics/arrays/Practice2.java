package basics.arrays;

import java.util.Arrays;
import java.util.Random;

public class Practice2 {
    public static void main(String[] args) {
        int[] firstarray = randomArray(10);
        System.out.println("First array length: " + firstarray.length);
        System.out.println(Arrays.toString(firstarray));
        Arrays.sort(firstarray);
        System.out.println(Arrays.toString(firstarray));

        int[] secondarray = new int[10];
        System.out.println(Arrays.toString(secondarray));
        Arrays.fill(secondarray, 5);
        System.out.println(Arrays.toString(secondarray));

        int[] thirdarray = randomArray(10);
        System.out.println(Arrays.toString(thirdarray));

        int fourthArray[] = Arrays.copyOf(thirdarray, thirdarray.length);
        System.out.println(Arrays.toString(thirdarray));

        Arrays.sort(fourthArray);
        System.out.println(Arrays.toString(fourthArray));
        System.out.println(Arrays.toString(thirdarray));

        int[] smallerArray = Arrays.copyOf(thirdarray, 5);
        System.out.println(Arrays.toString(smallerArray));

        int[] largerArray = Arrays.copyOf(thirdarray, 14);
        System.out.println(Arrays.toString(largerArray));

        int[] copy1 = randomArray(10);
        int[] copy2 = copy1;

        System.out.println(Arrays.toString(copy1));
        System.out.println(Arrays.toString(copy2));

        copy1[0] = 666;
        System.out.println(Arrays.toString(copy1));
        System.out.println(Arrays.toString(copy2));


        String[] stringArray = {"Julia", "Andrea", "Yuliana", "Maju", "IRIS"};
        Arrays.sort(stringArray);
        System.out.println(Arrays.toString(stringArray));
        if (Arrays.binarySearch(stringArray, "Maju")>=0) {
            System.out.println("Found Maju!");
        }

        int[] s1 = {1,2,3,4,5};
        int[] s2 = {1,2,3,4,5};

        if (Arrays.equals(s1, s2)) {
            System.out.println("Same arrays are the same");
        }else{
            System.out.println("Same arrays are not the same");
        }

        if (s1==s2) {
            System.out.println("S arrays are the same");
        }else{
            System.out.println("S arrays are not the same");
        }

    }

    public static int[] randomArray(int len){
        Random random = new Random();
        int[] array = new int[len];
        for(int i=0;i<len;i++){
            array[i] = random.nextInt(100);
        }
        return array;
    }
}
