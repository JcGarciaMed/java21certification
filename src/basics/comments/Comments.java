package basics.comments;

import java.util.Arrays;

public class Comments {
    public static void main(String[] args) {
        //this is a single line comment in java

        /* This is a multi line comment
        int a[][] = {{1,2}, {2,3}, {3,4}} ;
        for(int row = 0; row < a.length; row++){
            for(int col = 0; col < a[row].length; col++){
                System.out.print(a[row][col] + " ");
            }
        }
        System.out.println("this is my array :"  + Arrays.deepToString(a));
        */
        doSomething(25,85);
    }

    /**
     * This element return the sum of two ints
     * @param a is the first parameter
     * @param b is the second parameter
     * @return this method returns the sum of a and b
     */
    public static int doSomething(int a, int b ) {
        System.out.println(a + b);
        return a + b;
    }
}
