package homework_week2;

import java.util.Scanner;

/**
 * Write a program to calculate the area of a triangle.
 */
public class Programme8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("------Calculate the area of Triangle-----");
        System.out.println("Enter the Heigh:");
        int h=scanner.nextInt();
        System.out.println("Enter the Base:");
        int b=scanner.nextInt();
        int area=(b*h)/2;
        System.out.println("Area of triangle is : "+area );


    }
}
