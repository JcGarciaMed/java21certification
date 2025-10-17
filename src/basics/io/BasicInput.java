package basics.io;

import java.util.Scanner;

public class BasicInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        System.out.println("You entered: " + number);
        input.close();
    }
}
