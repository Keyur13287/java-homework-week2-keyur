package homework_week2;

import java.util.Scanner;

/**
 * Write a Java program to print the area and perimeter of a rectangle.
 * Test Data:
 * Width = 5.5 Height = 8.5
 *  Expected Output:
 * Area is 5.6 * 8.5 = 47.60
 * Perimeter is 2 * (5.6 + 8.5) = 28.20
 */
public class Programme14 {
    public static void area(double height, double width){
        double total_area=height*width;
        System.out.println("Area is "+ height+ "*"+width+" = "+total_area);
    }
    public void perimeter(double height, double width){
        double peri = 2 * (height+width);
        System.out.println("perimeter is 2 * ("+height+"+"+width+ ") = "+peri);

    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the height : ");
        double height = scanner.nextDouble();
        System.out.println("Enter the width : ");
        double width = scanner.nextDouble();
        area(height,width);
        //call to instance method needs object so object creation

        Programme14 obj =  new Programme14();
        obj.perimeter(height,width);
    }
}
