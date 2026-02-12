package basics.arrays;

import java.util.Arrays;

public class Practice4 {
    public static void main(String[] args) {
        int[] ia1 = { 0, 1, 4, 5};
        int[] ia2 = { 0, 1, 1, 5, 6};
        int[] ia3 = { 0, 1, 5, 4};
        int x = Arrays.compare(ia1, ia2);
        int z = Arrays.compare(ia3, ia1);
        System.out.println(z);
        int y = Arrays.mismatch(ia1, ia2);
        int z2 = Arrays.mismatch(ia3, ia1);
        System.out.println(z2);
        System.out.println(x+" "+y);



        var dataArr = new String[4];
        dataArr[1] = "Bill";
        dataArr[2] = "Steve";
        dataArr[3] = "Larry";

        //System.out.println(dataArr[0]);
        //int len = dataArr[0].length();

        //System.out.println(len);


        var a = new int[]{ 1, 2, 3, 4 };
        int[] b = { 2, 3, 1, 0 };
        System.out.println( a [ (a = b)[3] ] );


        boolean[] b1 = new boolean[2]; boolean[] b2 = {true , false}; System.out.println( "" + (b1[0] == b2[0]) + ", "+ (b1[1] == b2[1])  );


        String[][][] arr  = {                             { { "a", "b" , "c"}, { "d", "e", null } },                             { {"x"}, null },{{"y"}},{ { "z","p"}, {}                           }       };       System.out.println(arr[0][1][2]);

    }
}
