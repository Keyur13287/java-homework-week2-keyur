package homework_week2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * 20. Write a Java Program to print as below.
 * "+------------------------+"
 * "| |"
 * "| CORNER STORE |"
 * "| |"
 * "| 2015-03-29 04:38PM |"
 * "| |"
 * "| Gallons: 10.870 |"
 * "| Price/gallon: $ 2.089 |"
 * "| |"
 * "| Fuel total: $ 22.71 |"
 * "| |"
 * "+------------------------+"
 */
public class Programme20 {

    public void ouput(String name, String date, Double price, Double gp) {

        System.out.println("'+---------------------------------+'");
        System.out.println("'|                                  |'");
        System.out.println("'|          " + name + "        |'");
        System.out.println(" | " + date + "                  |");
        System.out.println("'|                                  |'");
        System.out.println(" | Gallons:                     " + price + "|");
        System.out.println(" |price/gallon:                   $" + gp + "|");
        System.out.println("'+                                   +'");
        System.out.println(" |Fuel Toatal:             $" + (price *gp) + "|");
        System.out.println("'+                                   +'");
        System.out.println("'+-----------------------------------+'");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the  Store name:");
        String s = in.nextLine();
        //System.out.println("Enter the date and time:");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String d = dtf.format(now);
        //System.out.println(dtf.format(now));
        System.out.println("Enter the price for Gallons:");
        double g = in.nextDouble();
        System.out.println("Enter the price/Gallons ");
        double e = in.nextDouble();
        Programme20 obj= new Programme20();
        obj.ouput(s,d,g,e);
    }
}
