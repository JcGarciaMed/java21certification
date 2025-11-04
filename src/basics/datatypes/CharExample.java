package basics.datatypes;

public class CharExample {
    public static void main(String[] args) {
        //Char Data Type --> 0 - 65535
        char a = 65535;
        char c1 = 'H';
        char c2 = 5;
        char c3 = 53;
        System.out.println(a);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(Character.isDigit(a));
        System.out.println(Character.isLetter(a));
        System.out.println(Character.isDigit(c1));
        System.out.println(Character.isLetter(c1));


        char letter1 = 67;
        int num1 = letter1 + 3;
        char letter2 = (char) num1;
        System.out.println(num1);
        System.out.println(letter1);
        System.out.println(letter2);


    }
}
