package basics.operators;

public class OperatorPrecedence {
    public static void main(String[] args) {
        int result = 5 + 2 * 4;
        System.out.println(result);

        result = (5 + 2) * 4;
        System.out.println(result);

        result += 80 / 20 % 8 * 3 - 5;
        System.out.println(result);

        int x = 8, y=4, z=2, sum = 0;

        /*sum = x + --y + --z;
        System.out.println(sum);*/

        /*sum = x + y-- + --z + y;
        System.out.println(sum);*/

        sum = x + y-- + --z * y;
        System.out.println(sum);


        int x1 = 2 + 5 / 2 % 7 * 4 - 2;
        System.out.println(x1);

        System.out.println(11/2);
        System.out.println(11/2.0);
        System.out.println(11%2);
        System.out.println(11%2.0);

        int n1 = 7;
        int n2 = 3;
        System.out.println(n1 == n2);

        int n3 = 5;
        int n4 = 2;
        System.out.println(n3 & n4);

        char c1 = 'A';
        System.out.println(++c1);

    }
}
