package basics.operators;

public class OperatorsPractice {
    public static void main(String[] args) {
        /*int a = 10;
        int b = 20;

        a +=(a=4);
        b = b + (b=5);



        System.out.println(a);
        System.out.println(b);


        int c = a + b + (b=5);
        System.out.println(c);
        System.out.println(b);


        int x = 2;     int y = ~x;
        int z = x^y;
        System.out.println(y);
        System.out.println(z);
*/
        byte b = 1;
        char c = '1';
        short d = 2;
        short s = 1;
        int i = 1;
        long j = b;
        j = c;
        j = i;

        /*b = i;
        s = s + b;*/

        s*=b;
        s+=b;
        i = b;
        float f = i;
        double c32 = c * 1;


        s = 1;

        String text="Hola Peru";
        var text2 = text.indent(1);
        var text3 = text.isBlank();
        var text4 = text.lines();
        System.out.println(text2);

        String s1 = "Hello World";
        System.out.println(s1);
        String s2 = """             
                Hello World""";
        System.out.println(s2);
        String s3 = """             
                Hello World
                """;
        System.out.println(s3);

        System.out.println((s1 == s2)+" "+s2.equals(s3)+" "+s2.intern().equals(s3.intern()));


        String examName = "OCP Java";
        String uniqueExamName = new String(examName);
        String internedExamName = uniqueExamName.intern();


        byte starting = 3;
        short firstValue = 5;
        int secondValue = 7;

        int functionValue = (starting/2 + firstValue/2 + (short) (firstValue/3) )  + secondValue/2;
        System.out.println(functionValue);



    }
}
