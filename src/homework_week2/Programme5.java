package homework_week2;

import java.util.Scanner;

/**
 * Write a program for a calculator with addition, subtraction, multiplication
 * and division methods all with parameters and use string concatenation
 * methods.(Note: Two static and Two instance methods.)
 */
public class Programme5 {

    public static void addition(int a, int b){
            int c = a+b;
        System.out.println("Additon of "+ a+ " And "+ b + " is: " + c);
    }
    public static void subtraction(int a, int b){
            int c = a-b;
        System.out.println("Subtraction of "+a+" And "+b+" is: "+c);
    }
    public void multiplication(int a, int b){
            int c= a*b;
        System.out.println("Multiplication of "+a+" And "+b+" is: "+c);
    }
    public void divide(float a, float b){
            float c= a/b;
        System.out.println("Division of "+a+ " And "+b+ " is: "+c);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Here we are perfroming the calculation Operation so we need two numbres for this one");
        System.out.println("Enter the first number ");
        int a = scanner.nextInt();
        System.out.println("Enter the Second number ");
        int b = scanner.nextInt();
        Programme5.addition(a,b);
        subtraction(a,b);

        // Object creation to call instance method

        Programme5 obj= new Programme5();
        obj.multiplication(a,b);
        obj.divide(a,b);

    }

}
