package homework_week2;

import java.util.Scanner;

/**
 * Write a program to enter any radius value of the circle and find out the
 * area.(Formula of Area A=PI*r*r)
 */
public class Programme6 {
    public void area_circle(double PI, double radius) {
        double area = PI * radius * radius;
        System.out.println("Area of circle is : " + area);

    }

    public static void main(String[] args) {
        double PI = Math.PI;

        System.out.println("Pi value is : " + PI);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius : ");
        double r = scanner.nextDouble();
        //Object creation

        Programme6 obj = new Programme6();
        obj.area_circle(PI, r);


    }
}
