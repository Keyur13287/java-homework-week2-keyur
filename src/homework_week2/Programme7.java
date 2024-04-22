package homework_week2;

import java.util.Scanner;

/**
 * Write a program to insert any temperature value in degree Fahrenheit and
 * convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */
public class Programme7 {
    public static void temprature(float f) {
        float Degree = ((f - 32) * 5 / 9);
        System.out.println("After Converting the value of fahernhit " + f + " , The Degree Celsius value is :" + Degree);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the fahrenheit details:");
        float f = scanner.nextFloat();
        temprature(f);
    }
}
