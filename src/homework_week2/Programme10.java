package homework_week2;

import java.util.Scanner;

/**
 * Write a Java program that takes a number as input and prints its
 * multiplication table up to 10.
 */
public class Programme10 {
    public void multiplication_table(int input) {

        System.out.println("----Multoplication Table------");
        System.out.println(input + "*1 = " + input * 1);
        System.out.println(input + "*2 = " + input * 2);
        System.out.println(input + "*3 = " + input * 3);
        System.out.println(input + "*4 = " + input * 4);
        System.out.println(input + "*5 = " + input * 5);
        System.out.println(input + "*6 = " + input * 6);
        System.out.println(input + "*7 = " + input * 7);
        System.out.println(input + "*8 = " + input * 8);
        System.out.println(input + "*9 = " + input * 9);
        System.out.println(input + "*10 = " + input * 10);

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Programme10 obj = new Programme10();
        System.out.println("Enter the value : ");
        int input = scanner.nextInt();
        obj.multiplication_table(input);
    }
}
