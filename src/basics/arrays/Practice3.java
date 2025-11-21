package basics.arrays;

import java.util.Arrays;

public class Practice3 {
    public static void main(String... args) {
        validate();
        A[] a, a1;
        B[] b;
        a = new A[10]; a1  = a;       b =  new B[20];
        a = b;  // 1
        b = (B[]) a;  // 2
        b = (B[]) a1; // 3
        int[] array = new int[5];
        int anotherArray[] = array;

        anotherArray[0] = 1;
        modifyArray(array);

        System.out.println(Arrays.toString(anotherArray));
        System.out.println(Arrays.toString(array));

        String[] splitString = "Hello world again".split(" ");
        printText(splitString);

        printText("hello", "World", "World");

        int[] disorderedArray = {12, 23, 324, 988, 2, 5 ,1};
        int[] orderedArray = new  int[disorderedArray.length];

        for(int i = 0; i < disorderedArray.length; i++){

        }
    }

    public static void modifyArray(int[] array){
        array[1] = 2;
    }

    private static void printText(String... text){
        for (String s : text){
            System.out.println(s);
        }
    }

    public static void validate(){     var str = "111";     boolean[] bA = new boolean[1];     if( bA[0] ) str = "222";     System.out.println(str);   }

    class A { } class B extends A { }
}
