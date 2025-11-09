package basics.arrays;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {

        int[] numberArray;
        numberArray = new int[10];

        char charArray[] = new char[195];

        numberArray[0] = 1;
        numberArray[1] = -2;
        numberArray[2] = 3;
        numberArray[3] = -4;
        numberArray[4] = 5;
        numberArray[5] = -6;

        System.out.println("arreglo " + Arrays.toString(numberArray));
        System.out.println("tamaño " + numberArray.length);
        int acum = 0;
        for (int i = 0; i < numberArray.length; i++) {
            System.out.println(numberArray[i]);
            acum += numberArray[i];
            System.out.println(acum);
        }

        int numberarray2[] = {1, -4, 23, 32, 21};
        numberarray2[3] = 3;
        System.out.println("arreglo " + Arrays.toString(numberarray2));

        int ages[] = new int[]{15, 16, 15, (int) 18.9};

        System.out.println("arreglo " + Arrays.toString(ages));

        Object[] mixedArray = new Object[10];
        mixedArray[0] = 1;
        mixedArray[1] = "Nose";
        mixedArray[2] = false;

        System.out.println(Arrays.toString(mixedArray));

    }
}
