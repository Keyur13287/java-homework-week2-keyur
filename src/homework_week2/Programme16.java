package homework_week2;

import java.util.Scanner;

/**
 * Write a Java program to add two binary numbers.
 * Input Data:
 * Input first binary number: 10
 * Input second binary number: 11
 */
public class Programme16 {
    public void addition(String a, String b) {
        int a1 = Integer.parseInt(a, 2);
        int a2 = Integer.parseInt(b, 2);
        int result = a1 + a2;
        String results = Integer.toBinaryString(result);
        System.out.println("Addition of two binary is : " + results);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first binary number:");
        String a = scanner.nextLine();
        System.out.println("Enter the second binary number:");
        String b = scanner.nextLine();
        Programme16 obj = new Programme16();
        obj.addition(a, b);
    }


}
