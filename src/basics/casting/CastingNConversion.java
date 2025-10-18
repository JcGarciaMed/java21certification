package basics.casting;

public class CastingNConversion {
    public static void main(String[] args) {
        double a;
        int b = 20;
        a=b;
        b=(int)a;
        System.out.println(a);
        System.out.println(b);

        a = 20.52/6;
        System.out.println(a);

        double db1 = 25.00;
        long lng1 = (long) db1;
        byte b1 = (byte) lng1;
        short sh1 = (short) b1;


        System.out.println(db1);
        System.out.println(lng1);
        System.out.println(b1);
        System.out.println(sh1);

    }
}
