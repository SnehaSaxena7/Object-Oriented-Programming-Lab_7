import java.util.InputMismatchException;
import java.util.Scanner;

/** Q1: Divide by zero using try-catch-finally. */
public class Q01_DivideByZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter numerator: ");
            int num = sc.nextInt();
            System.out.print("Enter denominator: ");
            int den = sc.nextInt();

            int result = num / den;
            System.out.println("Result = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero! (" + e.getMessage() + ")");
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid integers only.");
        } finally {
            System.out.println("Finally block executed.");
            sc.close();
        }
    }
}
