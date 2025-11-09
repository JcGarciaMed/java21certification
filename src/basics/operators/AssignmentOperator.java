package basics.operators;

public class AssignmentOperator {
    public static void main(String[] args) {
        int x = 20, y = 15, z;

        x += x + (x=18) + x;
        System.out.println("z +=--> " + x);

        z = x + y;
        System.out.println("z = x + y --> " + z);

        z +=x;
        System.out.println("z +=x --> " + z);

        z-=x;
        System.out.println("z-=x --> "+ z);

        z *=x;
        System.out.println("z *=x --> "+ z);

        z /=x;
        System.out.println("z /=x --> "+ z);

        z %=x;
        System.out.println("z %=x --> "+ z);


    }
}
