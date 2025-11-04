package basics.operators;

public class UnaryOperator {
    public static void main(String[] args) {
        double number = 7.6;
        boolean isCheck = !true;

        System.out.println("+number " + +number);
        System.out.println("-number " + -number);
        System.out.println("++number " + ++number);
        System.out.println("--number " + --number);
        System.out.println("--number-- " + number--);
        System.out.println("--number changed-- " + number);
        System.out.println("is check " + isCheck);

        System.out.println("-------------------------------------------");


    }
}
