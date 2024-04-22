package homework_week2;

import java.util.Scanner;

/**
 * Write a Java program to print the sum (addition), multiply, subtract, divide and
 * remainder of two numbers.
 * Test Data:
 * Input first number: 125
 * Input second number: 24
 * Expected Output :
 * 125 + 24 = 149
 * 125 - 24 = 101
 * 125 x 24 = 3000
 * 125 / 24 = 5
 * 125 mod 24 = 5
 */
public class Programme18 {
    public static void operation(int a, int b) {

        System.out.println(a + "+" + b + " = " + (a + b));
        System.out.println(a + "-" + b + " = " + (a - b));
        System.out.println(a + "*" + b + " = " + (a * b));
        System.out.println(a + "/" + b + " = " + (a / b));
        System.out.println(a + " mod " + b + " = " + (a % b));


    }

    public static void main(String[] args) {
        //operation(125,24);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        int n1 = scanner.nextInt();
        System.out.println("Enter the second number");
        int n2 = scanner.nextInt();
        operation(n1, n2);

    }
}
