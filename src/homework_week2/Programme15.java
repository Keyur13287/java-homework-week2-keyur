package homework_week2;

import java.util.Scanner;

/**
 * Write a Java program to swap two variables.
 */
public class Programme15 {
    public void swap(int a, int b) {

        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("after swapping values of input1 is: " + a + " and input2 is: " + b);

    }

    public static void main(String[] args) {
        //scanner for input
        //object created for calling instance method
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value 1");
        int n1 = in.nextInt();
        System.out.println("Enter the value 2");
        int n2 = in.nextInt();

        System.out.println("The values of before swapping for input1 is: " + n1 + " and input2 is: " + n2);

        Programme15 obj = new Programme15();
        obj.swap(n1, n2);
    }
}
