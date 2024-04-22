package homework_week2;

/**
 * Write a Java program to compute the specified expressions and print the
 * output.
 * Test Data:
 * ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
 * Expected Output : 2.138888888888889
 */
public class Programme12 {
    public static void main(String[] args) {
        double a, b, c, d, Test_Data;
        a = 25.5;
        b = 3.5;
        c = 40.5;
        d = 4.5;
        Test_Data = ((a * b - b * b) / (c - d));
        System.out.println(Test_Data);

    }
}
