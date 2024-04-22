package homework_week2;

import java.util.Scanner;

/**
 * Write a Java program that takes three numbers as input to calculate and
 * print the average of the numbers.
 */
public class Programme13 {
    public static void average(double a, double b, double c) {
        double avg = (a + b + c) / 3;
        System.out.println("The average value of three numbers is: " + avg);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The first value:");
        double f = scanner.nextDouble();
        System.out.println("Enter The second value:");
        double s = scanner.nextDouble();
        System.out.println("Enter The third Value");
        double t = scanner.nextDouble();
        average(f, s, t);

    }
}
