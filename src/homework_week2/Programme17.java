package homework_week2;

import java.util.Scanner;

/**
 * Write a Java program to convert a decimal number to binary number.
 * Input Data:
 * Input a Decimal Number : 5
 */
public class Programme17 {
    public static void main(String[] args) {
        //int a=5;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the decimal number:");
        int a = scanner.nextInt();
        Programme17 obj = new Programme17();
        obj.decimaltobinary(a);

    }

    public void decimaltobinary(int x) {
        String binary = Integer.toBinaryString(x);
        System.out.println("Converted Binary number of" + x + "is :" + binary);

    }
}
