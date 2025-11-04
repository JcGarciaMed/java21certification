package basics.operators;

public class BitOperators {
    public static void main(String[] args) {
        int num1 = 8; // 1000
        int num2 = 9; // 1001

        System.out.println("num1 in binary = " + Integer.toBinaryString(num1));
        System.out.println("num2 in binary = " + Integer.toBinaryString(num2));
        System.out.println("num1 & num2 in binary = " + Integer.toBinaryString(num1&num2));
        System.out.println("num1 & num2 in decimal = " + (num1&num2));


        int num3 = 8; // 1000
        int num4 = 9; // 1001

        System.out.println("num3 in binary = " + Integer.toBinaryString(num3));
        System.out.println("num4 in binary = " + Integer.toBinaryString(num4));
        System.out.println("num3 | num4 in binary = " + Integer.toBinaryString(num1|num2));
        System.out.println("num3 | num4 in decimal = " + (num1|num2));

        int num5 = 8; // 1000
        int num6 = 9; // 1001

        System.out.println("num5 in binary = " + Integer.toBinaryString(num5));
        System.out.println("num6 in binary = " + Integer.toBinaryString(num6));
        System.out.println("num5 & num6 in binary = " + Integer.toBinaryString(num5^num6));
        System.out.println("num5 & num6 in decimal = " + (num1^num2));

        int num7 = 8; // 1000

        System.out.println("num7 in binary = " + Integer.toBinaryString(num7));
        System.out.println("num7 << 2 in binary = " + Integer.toBinaryString(num7<<2));
        System.out.println("num7 << 2 in decimal = " + (num7<<2));


    }
}
