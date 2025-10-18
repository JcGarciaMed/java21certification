package basics.numbers;

public class JavaNumbers {
    public static void main(String[] args) {
        System.out.println("-----------Octal Numbers----------");

        int oct1 = 015; // 13 as decimal
        int oct2 = 0104; // 68 as decimal
        int sumoct1 = oct1 + oct2;
        System.out.println(oct1);
        System.out.println(oct2);
        System.out.println(sumoct1); // decimal sum
        System.out.println(Integer.toOctalString(sumoct1)); // octal sum

        System.out.println();
        System.out.println("-----------Hexadecimal Numbers----------");
        int hex1 = 0x1B0;
        int hex2 = 0X2F;
        int sumhex1 = hex1 + hex2;
        System.out.println(hex1);
        System.out.println(hex2);
        System.out.println(sumhex1); // hexagonal sum
        System.out.println(Integer.toHexString(sumhex1)); // hexagonal sum

        System.out.println();
        System.out.println("-----------Binary Numbers----------");
        int bin1 = 0b1001;
        int bin2 = 0B1011;
        int sumbin = bin1 + bin2;
        System.out.println(bin1);
        System.out.println(bin2);
        System.out.println(sumbin); // hexagonal sum
        System.out.println(Integer.toHexString(sumbin)); // hexagonal sum
    }
}
