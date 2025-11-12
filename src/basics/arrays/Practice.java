package basics.arrays;

import java.util.Arrays;

public class Practice {
    public static void main(String[ ] args){
        var a = new int[]{ 1, 2, 3, 4, 5 };
        int[] b = { 6, 7, 8, 9 , 10};
        a=b;
        System.out.println(Arrays.toString(a));
        //System.out.println( a [ (a = b)[3] ] );

        int[][] orig = { { 1, 2, 3} , { 4, 5, 6, 7}};
        int[][] dup = orig.clone();
        int[] copy = dup[0].clone();

        System.out.println(Arrays.toString(orig[0]));
        System.out.println(Arrays.toString(orig[1]));
        System.out.println(Arrays.toString(dup[0]));
        System.out.println(Arrays.toString(dup[1]));
        System.out.println(Arrays.toString(copy));


        System.out.println("=====================================");
        System.out.println(orig == dup);
        System.out.println(orig.equals(dup));
        System.out.println(orig[0] == dup[0]);
        System.out.println(dup[0] == copy);
        System.out.println(dup[0].equals(copy));

        int[] arr = new int[2];
        arr[0] = 1;
        arr[1] = 2;
        System.out.println(Arrays.toString(arr));

        Ejemplo ej = new Ejemplo();
        ej.doSomething();
        ej.doSomething();
        ej.doSomething();
    }
}
