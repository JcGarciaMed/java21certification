package basics.datatypes;

public class DataTypes {
    public static void main(String[] args) {
        byte b = 12;
        char c = 'a';
        char d = 256;
        boolean a = true;
        int i = 1223;
        long l = 1234433455333222L;
        short g = 12223;
        double h = 12;
        float f = 12.3f;

        System.out.println(d);
        System.out.println(c);
        System.out.println((int)d);
        System.out.println((int)c);
        System.out.println(g);
        System.out.println(h);
        System.out.println(f);

        String alpha = "This is a string";
        System.out.println(alpha);

        char zoctal = 015;
        int octal = 015;
        int decimal = 13;
        int binary = 0b1101;

        System.out.println();
        System.out.println(binary);
        System.out.println(octal);
        System.out.println(decimal);
        System.out.println((int) zoctal);


    }
}
