package homework_week2;

import java.util.Scanner;

/**
 * Write a Java program to convert a given string into lowercase.
 * Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 * Output: the quick brown fox jumps over the lazy dog
 */
public class Programme19 {
    public static void main(String[] args) {
//        String s="HELL";
//        System.out.println(s.toLowerCase());
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input: ");
        String s = scanner.nextLine();
        Programme19 obj = new Programme19();
        obj.lowercase(s);


    }

    public void lowercase(String upper) {
        String lower = upper.toLowerCase();
        System.out.println("Output: " + lower);
    }
}
