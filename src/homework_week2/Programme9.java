package homework_week2;

import java.util.Scanner;

/**
 * Write a program to convert the upper case to lower case.
 */
public class Programme9 {
    public void uppercase(String message) {

        String lower = message.toLowerCase();// string method to convert into the lowercase
        System.out.println("Converted lower case strings is:  " + lower);

    }

    public static void main(String[] args) {
        Programme9 obj = new Programme9();
        Scanner scanner = new Scanner(System.in); // declare the scanner for user input
        System.out.println("Enter the string");
        String message = scanner.nextLine();
        obj.uppercase(message); // call the moethod for uppercase

    }
}
